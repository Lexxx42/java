package java_gb.seminar2;

// Напишите метод, который принимает на вход строку (String)
// и определяет является ли строка палиндромом (возвращает boolean значение).
public class Ex003 {
    public static void main(String[] args) {
        String inputStr = "1001";
        isPalindrom(inputStr);
    }

    public static void isPalindrom(String inputString) {
        StringBuilder stringBuild = new StringBuilder(inputString);
        stringBuild.reverse();
        if (inputString.equals(stringBuild.toString())) {
            System.out.println("is palindrome");
        } else {
            System.out.println("is not palindrome");
        }
    }
}
