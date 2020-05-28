import java.util.ArrayList;
import java.util.Arrays;

public class PrimeDirective {

    ArrayList<Integer> primeNumbers;

    public PrimeDirective() {
        this.initPrimeNumberList();
    }

    public void initPrimeNumberList() {
        this.primeNumbers = new ArrayList<Integer>();
    }

    public void pushPrimeNumber(int primeNumber) {
        this.primeNumbers.add(primeNumber);
    }

    public void getPrimeNumberArrayList(int[] numbersArray) {
        for (int number : numbersArray) {
            if (isPrimeNumber(number)) {
                this.pushPrimeNumber(number);
            }
        }
        System.out.println(this.primeNumbers);
    }

    public boolean isPrimeNumber(int numberToCheck) {
        int fail = -1;
        int pass = 1;
        // tests divisible by 2
        if (singlePrimeNumberTest(numberToCheck, 2) == pass) {
            return true;
        } else if (singlePrimeNumberTest(numberToCheck, 2) == fail) {
            return false;
        } else {
            if (singlePrimeNumberTest(numberToCheck, 3) == pass) {
                return true;
            } else if (singlePrimeNumberTest(numberToCheck, 3) == fail) {
                return false;
            } else {
                if (singlePrimeNumberTest(numberToCheck, 5) == pass) {
                    return true;
                } else if (singlePrimeNumberTest(numberToCheck, 5) == fail) {
                    return false;
                } else {
                    if (singlePrimeNumberTest(numberToCheck, 7) == pass) {
                        return true;
                    } else if (singlePrimeNumberTest(numberToCheck, 7) == fail) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    public int singlePrimeNumberTest(int numberToCheck, int knownPrimeNumbersUnder10) {
        if (numberToCheck % knownPrimeNumbersUnder10 == 0) {
            if (numberToCheck / knownPrimeNumbersUnder10 == 1) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = { 6, 29, 28, 33, 11, 100, 101, 43, 89 };
        pd.getPrimeNumberArrayList(numbers);

    }
}