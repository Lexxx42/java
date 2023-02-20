package java_gb.hw4;


import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class HeapSort {
    public void sort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    void heapify(int[] arr, int m, int k) {
        int largest = k; // Initialize largest as root
        int l = 2 * k + 1; // left = 2*i + 1
        int r = 2 * k + 2; // right = 2*i + 2

        if (l < m && arr[l] > arr[largest])
            largest = l;

        if (r < m && arr[r] > arr[largest])
            largest = r;

        if (largest != k) {
            int swap = arr[k];
            arr[k] = arr[largest];
            arr[largest] = swap;

            heapify(arr, m, largest);
        }
    }

    static void printArray(int[] array) {
        java_gb.hw4.MyLogger.writeLog(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] a1 = new int[]{1, 34, 3, 1, 90, 899, 23, 9000, 123, 321, 222, 2, 0, 76, 76};

        HeapSort ob = new HeapSort();
        ob.sort(a1);

        printArray(a1);
    }
}

class MyLogger {
    private MyLogger() {
        throw new IllegalStateException("Utility class");
    }

    private static final Logger log = Logger.getLogger("MyLogger");

    static {
        FileHandler fh;

        try {
            fh = new FileHandler("log.log", false);
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