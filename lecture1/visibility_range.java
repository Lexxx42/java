package java_gb.lecture1;

public class visibility_range {
    public static void main(String[] args) {
        {
            int i = 123;
            System.out.println(i);
        }
        //System.out.println(i); // error: cannot find symbol
    }
}
