/**
 * This module is for calculation triangular number by given index from console.
 */

package java_gb.hw1;

import java.util.Scanner;

/**
 * Calculates triangular number by given index from console.
 */
public class triangularNumber {
    public static void main(String[] args) {
        int n = getInputFromConsole();
        int triangularNumber = nthTriangularNumberCalculation(n);
        printTriangularNumberInConsole(n, triangularNumber);
    }

    /**
     * Prints triangular number in console.
     *
     * @param num           - index of triangular number.
     * @param triangularNum - triangular number value.
     */
    public static void printTriangularNumberInConsole(int num, int triangularNum) {
        System.out.printf("%d-th triangular number is %d", num, triangularNum);
    }

    /**
     * Takes input data from console.
     *
     * @return valid index of a triangular number from console.
     */
    public static int getInputFromConsole() {
        System.out.print("Please enter n for a triangular number: ");
        return validateInputConsole();
    }

    /**
     * Calculates triangular number by given index.
     *
     * @param index - index of a triangular number from console.
     * @return triangular number.
     */
    public static int nthTriangularNumberCalculation(int index) {
        return (index + 1) * index / 2;
    }

    /**
     * Validates input data from console.
     * Value must be integer and equal or greater than zero.
     *
     * @return valid index of a triangular number from console.
     */
    public static int validateInputConsole() {
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            try {
                int number = iScanner.nextInt();
                if (number < 0) {
                    System.out.print("n number must be equal or greater than zero!\n");
                    continue;
                }
                iScanner.close();
                return number;

            } catch (Exception e) {
                System.out.println("Please enter a natural number.");
            }
        }
    }
}
