package isp.lab2;

import java.util.Scanner;

public class Exercise7 {

    /**
     * This method should generate a random number which
     * represent the position in the given arrays,so
     * the random should be between 0 and 7
     *
     * @return the generated random
     */
    public static int generateARandom() {
        int n = (int) (Math.random() * (7));

        return n;
    }

    public static void main(String[] args) {
        int[] ucl = new int[]{1, 2, 3, 4, 5, 6, 7, 13};
        int[] answers = new int[]{10, 4, 2, 1, 2, 1, 1, 1};
        int times = generateARandom();
        int suma = 0;
        int tries = 2;
        System.out.println("numar generat " + times);

        suma = 0;
        for (int j = 0; j < ucl.length; j++) {
            if (ucl[j] >= times) {
                System.out.println(ucl[j] + " la pozitia " + j);

                suma = suma + answers[j];
            }
        }
        System.out.println("Raspuns corect = " + suma);


        Scanner scanner = new Scanner(System.in);
        int userInput;
        for (int i = 0; i < tries; i++) {
            System.out.print("Introduceti numarul: ");
            userInput = scanner.nextInt();

            if (userInput < suma) {
                System.out.println("Numarul introdus este prea mic");
            } else if (userInput > suma) {
                System.out.println("Numarul introdus este prea mare");
            } else if (userInput == suma) {
                System.out.println("Raspuns corect");
                break;
            }


        }
    }
}
