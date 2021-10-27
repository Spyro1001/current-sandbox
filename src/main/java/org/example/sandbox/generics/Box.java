package org.example.sandbox.generics;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Crate> {

    private T value1;

    public Box() {

    }

    public Box(T value1) {
        this.value1 = value1;
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Box{");
        sb.append("value1=")
          .append(value1);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();

        list.add(Integer.valueOf(1));
        list.add(Double.valueOf(1.0));


    }
}
