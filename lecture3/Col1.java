package java_gb.lecture3;

import java.util.ArrayList;
import java.util.List;

public class Col1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(2809);
        //list.add("string line");
        for (Object o : list) {
            System.out.println(o);
            // Проблема извлечения данных
        }
    }
}


//    ArrayList<Integer> list1 = new ArrayList<Integer>();
//    ArrayList<Integer> list2 = new ArrayList<>();
//    ArrayList<Integer> list3 = new ArrayList<>(10);
//    ArrayList<Integer> list4 = new ArrayList<>(list3);

//List – пронумерованный набор элементов.
//        Пользователь этого интерфейса имеет точный контроль над тем,
//        где в списке вставляется каждый элемент.
//        Пользователь может обращаться к элементам по их целочисленному
//        индексу (позиции в списке) и искать элементы в списке.
//        URL
//        ArrayList, LinkedList (Vector, Stack – устаревшие)