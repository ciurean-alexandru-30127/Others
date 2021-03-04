package isp.lab2;

import java.util.Random;

public class Exercise5 {

    /**
     * This method should generate an array that have 20 random numbers between -1000 and 1000
     *
     * @return the random numbers
     */
    public static int[] generateRandomNumbers() {
        int[] v = new int[20];
        Random x = new Random();
        for (int i = 0; i < 20; i++) {
            v[i] = x.nextInt(2001) - 1000;

        }
        return v;
    }

    /**
     * This method should sort the given random numbers
     *
     * @param randomNumbers numbers generated random
     * @return sorted int array
     */
    public static int[] getSortedNumbers(int[] randomNumbers) {
        int ok, i, aux;
        do {
            ok = 1;
            for (i = 0; i < randomNumbers.length - 1; i++)
                if (randomNumbers[i] > randomNumbers[i + 1]) {
                    ok = 0;
                    aux = randomNumbers[i];
                    randomNumbers[i] = randomNumbers[i + 1];
                    randomNumbers[i + 1] = aux;
                }
        }
        while (ok != 1);
        return randomNumbers;
    }

    public static void main(String[] args) {
        // display the random generated numbers
        int[] randomNumbers = generateRandomNumbers();
        System.out.println("The random generated numbers are:");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + ", ");
        }
        int[] sortedNumbers = getSortedNumbers(randomNumbers);
        // display the sorted numbers
        System.out.println("The sorted numbers are:");
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.print(sortedNumbers[i] + ", ");
        }
    }
}


