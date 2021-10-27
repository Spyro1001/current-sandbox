package org.example.sandbox.factory;

import org.example.sandbox.generics.Box;

public class Factory {

    public static <T> T getInstance(Class<T> clazz) throws Exception {
        return clazz.getConstructor().newInstance();
    }

    public static void main(String[] args) throws Exception {

        Box box = Factory.getInstance(Box.class);
        System.out.println(box);

    }
}
