package isp.lab2;

public class Exercise3 {

    /**
     * This method should verify if a number is prime
     *
     * @param number the number to check
     * @return true if number is prime and false otherwise
     */
    public static boolean isPrimeNumber(final int number) {
        if (number == 2 || number == 3) return true;
        if (number == 0 || number == 1) return false;
        int k = 2;
        while (k * k <= number) {
            if (number % k == 0) return false;
            k++;

        }
        return true;
    }

    /**
     * This method should calculate the sum of digits of a given number
     *
     * @param number the number used to calculate the sum of digits
     * @return an int representing the sum of digits of the given number
     */
    public static int calculateSumOfDigits(int number) {
        int s;
        s = 0;
        int p = number;
        while (p != 0) {
            s += p % 10;
            p = p / 10;
        }
        return s;
    }

    /**
     * This method should extract the prime numbers from a given interval
     * using isPrimeNumber(final int number) method defined above
     * NOTE* a < b
     *
     * @param a the left end of the interval
     * @param b the right end of the interval
     * @return and int array consisting of the prime numbers from the given interval
     */
    public static int[] getPrimeNumbersFromInterval(int a, int b) {
        // TODO: Use isPrimeNumber(final int number)
        int[] v = new int[15];
        int s = 0;
        for (int i = a; i <= b; i++) {
            if (isPrimeNumber(i)) {
                v[s] = i;
                s++;
            }
        }
        return v;
    }

    /**
     * This method should calculate the geometric mean of the given prime numbers
     *
     * @param primeNumbers the numbers used to calculate the geometric mean
     * @return the geometric mean of the given numbers
     */
    public static double calculateGeometricMean(int[] primeNumbers) {
        double prod = 1, s = 0;
        for (int i = 0; i < primeNumbers.length; i++) {
            if (primeNumbers[i] != 0)
                prod *= primeNumbers[i];
            s++;
        }
        return Math.pow(prod, (float) 1 / s);
    }

    /**
     * This method should calculate the number of prime numbers which
     * have the sum of digits an even number
     * NOTE* use calculateSumOfDigits(int number)
     *
     * @param primeNumbers prime numbers used for calculation
     * @return the numbers which respect the given condition
     */
    public static int numberOfPNWithEvenSumOfDigits(int[] primeNumbers) {
        // TODO: Use calculateSumOfDigits(int number)
        int s;
        s = 0;
        for (int i = 0; i < primeNumbers.length; i++)
            if (primeNumbers[i] != 0 && calculateSumOfDigits(primeNumbers[i]) % 2 == 0) s++;
        return s;
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 48;
        System.out.println("The geometric mean is: " + calculateGeometricMean(getPrimeNumbersFromInterval(a, b)));
        System.out.println("The number of prime numbers which have the sum of digits an even number is: " + numberOfPNWithEvenSumOfDigits(getPrimeNumbersFromInterval(a, b)));
    }
}
