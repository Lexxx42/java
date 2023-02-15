package java_gb.lecture3;

import java.util.ArrayList;
import java.util.List;
public class Col3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(123);
        // list.add("string line");
        for (Object o : list) {
            System.out.println(o);
            // Проблема извлечения данных
        }
    }
}
//    Ошибки на этапе компиляции лучше ошибок времени
//        выполнения
//    Повторное использование кода

// add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
//get(pos) – возвращает элемент из списка по указанной позиции
//indexOf(item) – первое вхождение или -1
//lastIndexOf(item) – последнее вхождение или -1
//remove(pos) – удаление элемента на указанной позиции и его возвращение
//set(int pos, T item) – gjvtoftn значение item элементу, который находится
//на позиции pos
//void sort(Comparator) – сортирует набор данных по правилу
//subList(int start, int end) – получение набора данных от позиции start до end