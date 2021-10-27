package org.example.sandbox.stacks;

public class StackDriver {

    public static void main(String[] args) {

        Stack<String> stack = new ArrayListStack<>();

        stack.push("World!");
        stack.push("Hello");

        System.out.println(stack);

        System.out.println(stack.peek());

        stack.pop();
        stack.push("Howdy");

        System.out.println(stack);
    }
}
