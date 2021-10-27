package org.example.sandbox.collections;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        //Set<String> setOfStuff = new TreeSet<>();
        List<String> setOfStuff = new ArrayList<>();

        setOfStuff.add("Hi");
        setOfStuff.add("Hi");
        setOfStuff.add("Hi");
        setOfStuff.add("There");

        setOfStuff.forEach(System.out::println);

        Set<String> deduped = new TreeSet<>(setOfStuff);

        deduped.forEach(System.out::println);

        Queue<String> linkedList = new LinkedList<>();
        List<String> listLinkedList = new LinkedList<>();


    }
}
