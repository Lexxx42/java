package java_gb.lecture2;

public class workWithStrings2 {
    static public void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
        }

    }
}
