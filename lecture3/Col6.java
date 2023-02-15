package java_gb.lecture3;

import java.util.Arrays;
import java.util.List;

public class Col6 {
    public static void main(String[] args) {
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        StringBuilder[] date = {day, month, year};
        List<StringBuilder> d = Arrays.asList(date);
        System.out.println(d); // [29, 9, 1990]
        date[1] = new StringBuilder("09");
        System.out.println(d); // [29, 09, 1990]
    }
}

//clear() – очистка списка
//toString() – «конвертация» списка в строку
//Arrays.asList – преобразует массив в список
//containsAll(col) – проверяет включение всех элементов из col
//removeAll(col) – удаляет элементы, имеющиеся в col
//retainAll(col) – оставляет элементы, имеющиеся в col
//toArray() – конвертация списка в массив Object’ов
//toArray(type array) – конвертация списка в массив type
//List.copyOf(col) – возвращает копию списка на основе имеющегося
//List.of(item1, item2,...) – возвращает неизменяемый список