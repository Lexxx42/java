package java_gb.lecture2;

public class workWithStrings3 {
    static public void main(String[] args) {
        var s = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("+".repeat(1_000_000));
        System.out.println(System.currentTimeMillis() - s);
    }
}
