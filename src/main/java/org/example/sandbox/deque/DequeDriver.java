package org.example.sandbox.deque;

public class DequeDriver {

    public static void main(String[] args) {

        Deque<String> deque = new ArrayListDeque<>();

        deque.offerFirst("first");
        deque.offerFirst("second");
        deque.offerFirst("third");
        deque.offerLast("fourth");
        deque.offerLast("fifth");

        System.out.println(deque);

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        deque.pollLast();
        deque.pollLast();
        deque.pollLast();
        deque.pollFirst();

        System.out.println(deque);
    }
}
