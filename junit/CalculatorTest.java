package TestActivities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import Calculator.Calculator;

// The Test class should start or end with "Test"

import org.junit.jupiter.api.TestMethodOrder;
public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    @Order(2)
    @DisplayName("Simple multiplication should work")
    public void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5));
    }
    @Test
    @Order(1)
    @DisplayName("Simple add should work")
    public void testAdd() {
        assertEquals(9, calculator.add(4, 5));
    }
}