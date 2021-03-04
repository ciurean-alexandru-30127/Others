package isp.lab2;

import java.util.Scanner;

public class Exercise2 {

    /**
     * This method should ask user to enter an int which represent
     * the number of points a team have
     *
     * @return the number of points entered by user
     */
    private static int readNumberOfPoints() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dati numarul de puncte:");
        int points = scanner.nextInt();
        return points;

    }

    /**
     * This method should return a message according with the specifications
     *
     * @param numberOfPoints the number of points entered by user
     * @return The appropriate message
     */
    public static String messageToUser(int numberOfPoints) {
        if (numberOfPoints == 49) return "CFR Cluj";
        if (numberOfPoints == 46) return "Universitatea Craiova";
        if (numberOfPoints == 43) return "FCSB";
        if (numberOfPoints == 42) return "FC Botosani";
        if (numberOfPoints == 40) return "Gaz Metan";
        if (numberOfPoints == 39) return "Astra Giurgiu";
        return "No team from Liga 1 have " + numberOfPoints + " points";

    }

    public static void main(String[] args) {
        System.out.println("The message to show to user is:");
        System.out.println(messageToUser(readNumberOfPoints()));
    }
}
