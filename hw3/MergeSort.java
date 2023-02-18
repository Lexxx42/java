package java_gb.hw3;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MergeSort {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 34, 3, 1, 90, 899, 23, 1};
        int[] a2 = new int[]{9000, 123, 321, 222, 2, 0, 76, 76};
        java_gb.hw3.MyLogger.writeLog(Arrays.toString(mergeSort(a1, a2)));
    }

    public static int[] mergeSort(int[] a1, int[] a2) {
        int[] a3 = new int[a1.length + a2.length];
        a1 = Arrays.stream(a1).sorted().toArray();
        a2 = Arrays.stream(a2).sorted().toArray();

        int i = 0;
        int j = 0;

        for (int k = 0; k < a3.length; k++) {

            if (i > a1.length - 1) {
                int a = a2[j];
                a3[k] = a;
                j++;
            } else if (j > a2.length - 1 || a1[i] < a2[j]) {
                int a = a1[i];
                a3[k] = a;
                i++;
            } else {
                int b = a2[j];
                a3[k] = b;
                j++;
            }
        }
        return a3;
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
