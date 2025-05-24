package Collections.List;

import java.util.LinkedList;

public class ExLinkedList {
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.add("One");
        a.add("Two");
        a.add("Three");
        a.add("Four");
        a.add("Five");

        System.out.println("a.size() = " + a.size());
        
        a.addFirst("Zero");
        a.addLast("Six");

        System.out.println("a = " + a);
        System.out.println("a.peekFirst() = " + a.peekFirst());

        a.removeFirst();
        a.removeLast();
        System.out.println("a = " + a);
    }
}
