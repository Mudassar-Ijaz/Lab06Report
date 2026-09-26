package lab06;

import java.util.Arrays;

public class ArrayStack<T> implements Stack<T> {
    private Object[] data;
    private int top;

    public ArrayStack() {
        data = new Object[10];
        top = -1;
    }

    public void push(T item) {
        if (top + 1 == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[++top] = item;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T item = (T) data[top];
        data[top--] = null;
        return item;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return (T) data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}
