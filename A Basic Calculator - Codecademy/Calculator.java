public class Calculator {

    /*
     * Learned how to use the toString methid to print more useful detail than the
     * class and the memory location.
     * 
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
    int result;

    public Calculator() {

    }

    public int add(int input1, int input2) {
        return this.result = input1 + input2;
    }

    public int substract(int input1, int input2) {
        return this.result = input1 - input2;
    }

    public int multiply(int input1, int input2) {
        return this.result = input1 * input2;
    }

    public int divide(int input1, int input2) {
        return this.result = input1 / input2;
    }

    public int modulo(int input1, int input2) {
        return this.result = input1 % input2;
    }

    public String toString() {
        return "The answer is: " + this.result;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator);
        System.out.println(myCalculator.substract(45, 11));
        System.out.println(myCalculator);
        System.out.println(myCalculator.multiply(5, 7));
        System.out.println(myCalculator);
        System.out.println(myCalculator.divide(15, 3));
        System.out.println(myCalculator);
        System.out.println(myCalculator.modulo(16, 3));
        System.out.println(myCalculator);
    }
}