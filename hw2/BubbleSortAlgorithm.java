/**
 * This module is logging the bubble sort algorithm.
 * Print results in a console and a log file.
 */

package java_gb.hw2;


import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Creates array of random integers.
 * Creates new instance of BubbleSort obj.
 */
public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = new int[50];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = new Random().nextInt(1, 200);
        }
        BubbleSort bubblesort = new BubbleSort(arr);
        bubblesort.bubbleSort();
    }
}

/**
 * Logger.
 * Output logs in file.txt with 'w' method.
 */
class MyLogger {
    private static final Logger log = Logger.getLogger("MyLogger");

    static {
        FileHandler fh;

        try {
            fh = new FileHandler("file.txt", false);
            log.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (IOException e) {
            log.log(Level.SEVERE, e.getMessage());
        }
    }

    public static void writeLog(String message) {
        log.log(Level.INFO, message);
    }

    public static void writeLog(String message, Exception e) {
        log.log(Level.WARNING, message, e);
    }
}

/**
 * Class for BubbleSort algorithm.
 */
class BubbleSort {
    private int[] arr;

    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    public void bubbleSort() {
        int countStar = 0;
        int countEnd = 0;
        int countIter = 0;
        int temp = 0;
        boolean flag = true;
        while (flag) {
            for (int i = 0; i < arr.length - 1; i++) {
                MyLogger.writeLog(Arrays.toString(arr));
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    countEnd++;
                }
            }
            printArr();
            ++countIter;
            if (countStar == countEnd) {
                flag = false;
            } else {
                countEnd = 0;
            }
        }
        System.out.printf("Отсоратированно за %d проходов \n", countIter);
    }

    public void printArr() {
        System.out.println(Arrays.toString(arr));
    }

    public int[] getArr() {
        return arr;
    }
}
