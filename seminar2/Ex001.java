package java_gb.seminar2;

// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N,
// которая состоит из чередующихся символов c1 и c2, начиная с c1.
public class Ex001 {
    static public void main(String[] args) {
        int num = 6;
        char sym1 = 'h';
        char sym2 = 'i';

        System.out.println(makeString(num, sym1, sym2));
    }

    static public String makeString(int num, char c1, char c2) {
        String result = "";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < num / 2; i++) {
            stringBuilder.append(c1).append(c2);
        }
        return stringBuilder.toString();
    }
}
