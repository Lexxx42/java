package java_gb.lecture3;

import java.util.List;

public class Col7 {
    public static void main(String[] args) {
        Character value = null;
        List<Character> list1 =
                List.of('S', 'e', 'r', 'g', 'e', 'y');
        System.out.println(list1);
        // list1.remove(1); // java.lang.UnsupportedOperationException
        List<Character> list2 = List.copyOf(list1);
        // not null, immutable
    }
}

