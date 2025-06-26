package org.example;

public class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public void decrement() {
        if (count > 0) count--;
    }

    public int getCount() {
        return count;
    }

    public void reset() {
        count = 0;
    }
}
