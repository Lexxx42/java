package java_gb.hw3;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MergeSort {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 34, 3, 1, 90, 899, 23, 9000, 123, 321, 222, 2, 0, 76, 76};
        mergeSort(a1, a1.length);
        java_gb.hw3.MyLogger.writeLog(Arrays.toString(a1));
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2)
            return;
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        if (n - mid >= 0) System.arraycopy(a, mid, r, 0, n - mid);
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left && j < right) {

            if (l[i] <= r[j])
                a[k++] = l[i++];
            else
                a[k++] = r[j++];

        }

        while (i < left)
            a[k++] = l[i++];

        while (j < right)
            a[k++] = r[j++];
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
