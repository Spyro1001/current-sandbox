package org.example.sandbox.queues;

public class QueueDriver {

    public static void main(String[] args) {
        Queue<String> queue = new ArrayListQueue<>();

        queue.offer("Hello");
        queue.offer("World");

        System.out.println(queue);

        System.out.println(queue.peek());

        queue.poll();

        System.out.println(queue);
    }
}
