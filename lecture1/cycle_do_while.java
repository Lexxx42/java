package java_gb.lecture1;

public class cycle_do_while {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;
        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);
    }
}
