package org.example;

import static org.junit.Assert.*;

public class AdditionTest {

    @org.junit.Test
    public void add() {
        Addition a = new Addition();
        int result = a.add(2,3);
        assertEquals(5 , result);
    }
}