package isp.lab2;

import java.util.Scanner;

public class Exercise1 {

    /**
     * This method should generate an random number between 2 and 10 then
     * should ask user to enter that amount of numbers from keyboard and
     * store the numbers in an int array which should be returned
     *
     * @return the array of numbers read from keyboard
     */
    private static int[] getUserNumbers() {
        int n = (int) (Math.random() * (10 - 2)) + 2;
        System.out.println("numar generat" + n);
        int[] numbers = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Number=");
            int value = scanner.nextInt();
            numbers[i] = value;
            System.out.println();
        }
        return numbers;
    }

    /**
     * This method should compute the arithmetical mean of the given numbers
     *
     * @param userNumbers the numbers used to calculate the arithmetical mean
     * @return the arithmetical mean of the given numbers
     */
    protected static double computeTheArithmeticalMean(int[] userNumbers) {
        int sum = 0;
        for (int i = 0; i < userNumbers.length; i++) {
            sum += userNumbers[i];
        }
        double result = (double) sum / userNumbers.length;
        return result;
    }

    public static void main(String[] args) {
        int[] userNumbers = getUserNumbers();
        System.out.println("Mean number is: " + computeTheArithmeticalMean(userNumbers));
    }


}
