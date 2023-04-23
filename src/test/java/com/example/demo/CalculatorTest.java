package com.example.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private static int x;
    private static int y;
    static Calculator calculator;

    @BeforeAll
    private static void initParams() {
        System.out.println("Старт тест");
        x = 10;
        y = 5;
        calculator = new Calculator();
    }

    @AfterAll
    private static void shouldDoAfterAll() {
        System.out.println("Финал тест ");
    }

    @Test
    void shouldGetSum() {
        Assertions.assertEquals(15, calculator.getSum(x, y));
    }

    @Test
    void shouldGetDivide() {
        Assertions.assertEquals(2, calculator.getDivide(x, y));
    }

    @Test
    void shouldExceptionGetDivide() {
        int y = 0;
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.getDivide(x, y));
    }

    @Test
    void shouldGetMultiple() {
        Assertions.assertEquals(50, calculator.getMultiple(x, y));
    }
}
