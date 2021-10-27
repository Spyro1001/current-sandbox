package org.example.sandbox.queues;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQueue<T> implements Queue<T> {

    List<T> queue;

    public ArrayListQueue() {
        queue = new ArrayList<>();
    }

    @Override
    public boolean offer(T t) {

        return this.queue.add(t);
    }

    @Override
    public T poll() {
        return this.queue.remove(0);
    }

    @Override
    public T peek() {
        return this.queue.get(0);
    }

    @Override
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ArrayListQueue{");
        sb.append("queue=")
          .append(queue);
        sb.append('}');
        return sb.toString();
    }
}
