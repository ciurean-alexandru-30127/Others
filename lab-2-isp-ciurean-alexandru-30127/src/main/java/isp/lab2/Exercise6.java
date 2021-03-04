package isp.lab2;

import java.util.Scanner;

public class Exercise6 {
    static int[] v;

    /**
     * This method should generate the required vector non-recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    public static int[] generateVector(int n) {
        int[] v = new int[n];
        v[0] = 1;
        v[1] = 2;
        for (int i = 2; i < n; i++) {
            v[i] = v[i - 1] * v[i - 2];
        }
        return v;
    }

    /**
     * This method should generate the required vector recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    public static int[] generateRandomVectorRecursively(int n) {
        if (v == null) {
            v = new int[n];
            v[0] = 1;
            v[1] = 2;
        }
        if (n > 2) {
            generateRandomVectorRecursively(--n);

        }
        v[n] = v[n - 1] * v[n - 2];
        return v;


    }

    public static void main(String[] args) {
        // TODO: print the vectors
        int[] a;
        int[] a_recursiv;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        n = scanner.nextInt();
        a = generateVector(n);
        a_recursiv = generateRandomVectorRecursively(n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(a_recursiv[i] + " ");
        }
    }
}