package java_gb.seminar2;

// Напишите метод, который сжимает строку.
// Пример: вход aaaabbbcdd.
public class Ex002 {
    public static String encoding(String str) {
        StringBuilder strBuilder = new StringBuilder();
        int count = 1;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            while (i + 1 < chars.length && c == chars[i + 1]) {
                count++;
                i++;
            }
            strBuilder.append(c).append(count);
            count = 1;
        }
        return strBuilder.toString();
    }

//    public static String encoding(String str) {
//        StringBuilder stringBuilder = new StringBuilder();
//        int sum = 0;
//        for (int i = 0; i < str.length() - 1; i++) {
//            if (str.charAt(i) == str.charAt(i + 1)) {
//                sum++;
//            } else {
//                stringBuilder.append(sum).append(str.charAt(i));
//            }
//        }
//        return stringBuilder.toString();
//    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        String str = "aaaabbbcdd";
        System.out.println(encoding(str));
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}
