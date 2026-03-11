package com.thomas.datastructures;

import com.thomas.datastructures.stack.ArrayStack;

public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top now: " + stack.peek());
        System.out.println("Size: " + stack.size());
    }
}