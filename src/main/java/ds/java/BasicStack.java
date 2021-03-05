package ds.java;

import java.util.Arrays;

public class BasicStack<X> implements Stack<X> {
    private int stackPointer;
    final private X[] elements;

    public BasicStack() {
        elements = (X[]) new Object[1000];
        stackPointer = 0;
    }

    @Override
    public void push(X x) {
        elements[stackPointer++] = x;
    }

    @Override
    public X pop() {
        if (stackPointer <= 0) {
            throw new IllegalStateException("Stack is Empty");
        }
        return elements[--stackPointer];
    }

    @Override
    public X access(X x) {
        for (int i = 0; i < elements.length; i++) {
            X temp = pop();
            if (temp.equals(x)) {
                return temp;
            }
        }
        throw new IllegalArgumentException("Element Not Present");
    }

    @Override
    public boolean contains(X x) {
        return Arrays.stream(elements).anyMatch(e -> e.equals(x));
    }

    @Override
    public int size() {
        return stackPointer;
    }
}
