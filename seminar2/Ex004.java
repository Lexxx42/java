package java_gb.seminar2;

// Напишите метод, который вернет содержимое текущей папки в виде массива строк.
// Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения,
// оно должно записаться в лог-файл.

import java.io.File;
import java.io.FileWriter;

public class Ex004 {
    static public void main(String[] args) {
        File dir = new File(System.getProperty("user.dir"));
        for (var item : dir.listFiles()) {
            System.out.printf("%s ", item.getName());
        }
    }

    private static void writeToFile(String[] mass) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");

            FileWriter fr = new FileWriter(pathFile);
            for (String el : mass) {
                fr.write(el + System.lineSeparator());
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }

}

