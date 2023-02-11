package java_gb.lecture2;

public class workWithStrings1 {
    static public void main(String[] args) {
        // Создать строку из 1 млн плюсиков. Как?
        String str = "";
        for (int i = 0; i < 1_000_000; i++) {
            str += "+";
        }
    }
}
