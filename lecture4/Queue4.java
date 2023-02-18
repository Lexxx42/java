package java_gb.lecture4;

import java.util.*;

public class Queue4 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        int item = queue.remove();
        queue.offer(2809);
        item = queue.poll();
        System.out.println(queue);
        queue.element();
        queue.peek();
    }
}
