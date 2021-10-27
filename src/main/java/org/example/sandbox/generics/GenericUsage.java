package org.example.sandbox.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericUsage {

    public static void main(String[] args) {

        List<String> numberList = new ArrayList<>();

        numberList.add("Hello");

        numberList.forEach(System.out::println);

    }
}
