package com.thomas.datastructures.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {

    @Test
    void newStackStartsEmpty() {
        ArrayStack<Integer> stack = new ArrayStack<>(5);

        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }

    @Test
    void pushIncreasesSize() {
        ArrayStack<Integer> stack = new ArrayStack<>(5);

        stack.push(10);

        assertEquals(1, stack.size());
        assertFalse(stack.isEmpty());
    }

    @Test
    void popReturnsLastElement() {
        ArrayStack<Integer> stack = new ArrayStack<>(5);

        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.pop());
        assertEquals(1, stack.size());
    }

    @Test
    void peekReturnsTopWithoutRemovingIt() {
        ArrayStack<Integer> stack = new ArrayStack<>(5);

        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.peek());
        assertEquals(2, stack.size());
    }

    @Test
    void popOnEmptyStackThrowsException() {
        ArrayStack<Integer> stack = new ArrayStack<>(5);

        assertThrows(IllegalStateException.class, stack::pop);
    }
}
