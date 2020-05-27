public class Droid {

    /*
     * CodecademyPro Portfolio
     * 
     * This program simulates a basic calculator.
     * 
     * Author Vakisan Manoharan
     * 
     * Summer Project 2020
     * 
     * Project Date: 26/05/2020
     */
    String name;
    int batteryLevel;

    public Droid(String droidName) {
        this.name = droidName;
        this.batteryLevel = 100;
    }

    public void performTask(String task) {
        System.out.println(this.name + " is performing task: " + task);
        this.batteryLevel -= 10;
    }

    public int energyReport() {
        System.out.println(this.name + " " + this.batteryLevel);
        return this.batteryLevel;
    }

    public String toString() {
        return "Hello, I’m the droid: " + this.name;
    }

    public void energyTransfer(Droid toDroid) {
        int tempBatteryStore = this.energyReport();
        this.batteryLevel = toDroid.batteryLevel;
        toDroid.batteryLevel = tempBatteryStore;
    }

    public static void main(String[] args) {
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("Dancing");
        codey.energyReport();
        codey.performTask("Dancing again");
        codey.energyReport();
        Droid modey = new Droid("modey");
        modey.energyTransfer(codey);
        modey.energyReport();
        codey.energyReport();

    }
}