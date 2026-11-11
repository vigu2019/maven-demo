
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testAddition() {
        assertEquals(30, App.add(10, 20));
    }

    @Test
    public void testAdditionWithZero() {
        assertEquals(10, App.add(10, 0));
    }

    @Test
    public void testAdditionWithNegative() {
        assertEquals(0, App.add(-10, 10));
    }
}
