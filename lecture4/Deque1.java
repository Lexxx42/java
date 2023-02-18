package java_gb.lecture4;

import java.util.*;

public class Deque1 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        System.out.println(deque);
        //deque.removeLast();
        System.out.println(deque.offerFirst(1));
        System.out.println(deque.offerLast(2));
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        deque.getFirst();
        deque.getLast();
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
    }
}

