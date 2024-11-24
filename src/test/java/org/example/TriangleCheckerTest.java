package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TriangleCheckerTest {

    private final int a;
    private final int b;
    private final int c;
    private final String expected;

    public TriangleCheckerTest(int a, int b, int c, String expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {3, 3, 3, "Равносторонний треугольник"},
                {3, 3, 4, "Равнобедренный треугольник"},
                {3, 4, 5, "Разносторонний треугольник"},
                {1, 2, 3, "Не является треугольником"},
                {0, 0, 0, "Не является треугольником"}
        });
    }

    @Test
    public void testCheckTriangle() {
        assertEquals(expected, TriangleChecker.checkTriangle(a, b, c));
    }
}
