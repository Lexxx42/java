package java_gb.seminar1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ex003 {
    public static void main(String[] args) {

        int[] mas1 = {1, 2, 45, 32, 90, 77};
        print_even(fill_even_array(mas1));
    }

    public static int[] fill_even_array(int[] args) {
        return IntStream.of(args).filter(item -> item % 2 == 0).toArray();
    }

    public static void print_even(int[] args) {
        int[] even = IntStream.of(args).filter(item -> item % 2 == 0).toArray();
        System.out.println(Arrays.toString(even));
    }
}
