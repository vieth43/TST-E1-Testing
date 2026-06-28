package de.vieth.tst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @Test
    void addiertZweiZahlen() {
        Calculator calculator = new Calculator();

        int result = calculator.add(2, 3);

        assertEquals(5, result);
    }

    @Test
    void dividiertZweiZahlen() {
        Calculator calculator = new Calculator();

        int result = calculator.divide(10, 2);

        assertEquals(5, result);
    }

    @Test
    void wirftExceptionBeiDivisionDurchNull() {
        Calculator calculator = new Calculator();

        assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(10, 0));
    }
}