public class FizzBuzz {

    int number;
    int multipleFizz;
    int multipleBuzz;

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(3, 5);
        fizzBuzz.incrementFizzBuzz(100);
    }

    public FizzBuzz(int multiple1, int multiple2) {
        setNumber();
        setMultipleFizz(multiple1);
        setMultipleBuzz(multiple2);
    }

    public void setNumber() {
        this.number = 0;
    }

    public void setMultipleFizz(int fizzNumber) {
        this.multipleFizz = fizzNumber;
    }

    public void setMultipleBuzz(int buzzNumber) {
        this.multipleBuzz = buzzNumber;
    }

    public int getNumber() {
        return this.number;
    }

    public int getMultipleFizz() {
        return this.multipleFizz;
    }

    public int getMultipleBuzz() {
        return this.multipleBuzz;
    }

    public void incrementFizzBuzz(int numberOfIncrements) {
        int num = this.getNumber();
        while (num < numberOfIncrements) {
            num += 1;
            System.out.println(resultOutput(num));
        }
        System.out.println("Completed");

    }

    public String resultOutput(int incrementedNumberToCheck) {
        if (checkMultiple(incrementedNumberToCheck, getMultipleFizz(), getMultipleBuzz())) {
            return "FizzBuzz";
        } else if (checkMultiple(incrementedNumberToCheck, getMultipleFizz())) {
            return "Fizz";
        } else if (checkMultiple(incrementedNumberToCheck, getMultipleBuzz())) {
            return "Buzz";
        } else {
            return String.valueOf(incrementedNumberToCheck);
        }
    }

    public boolean checkMultiple(int numberToIncrement, int multiple) {
        if (numberToIncrement % multiple == 0) {
            // is a multiple
            return true;
        } else {
            return false;
        }
    }

    public boolean checkMultiple(int numberToIncrement, int multiple1, int multiple2) {
        if ((numberToIncrement % multiple1) == 0 && (numberToIncrement % multiple2) == 0) {
            // is a multiple
            return true;
        } else {
            return false;
        }
    }
}