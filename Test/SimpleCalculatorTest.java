import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SimpleCalculatorTest {

    @Test
    public void testAdd() {
        // Arrange
        SimpleCalculator calculator = new SimpleCalculator();
        int a = 10;
        int b = 20;
        int expectedResult = 30;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals("The add method should add two numbers", expectedResult, result);
    }

    @Test
    public void testSubtract() {
        // Arrange
        SimpleCalculator calculator = new SimpleCalculator();
        int a = 30;
        int b = 20;
        int expectedResult = 10;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals("The subtract method should subtract two numbers", expectedResult, result);
    }

    @Test
    public void testMultiply() {
        // Arrange
        SimpleCalculator calculator = new SimpleCalculator();
        int a = 10;
        int b = 5;
        int expectedResult = 50;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals("The multiply method should multiply two numbers", expectedResult, result);
    }

    @Test
    public void testDivide() {
        // Arrange
        SimpleCalculator calculator = new SimpleCalculator();
        int a = 10;
        int b = 2;
        double expectedResult = 5.0;

        // Act
        double result = calculator.divide(a, b);

        // Assert
        assertEquals("The divide method should divide two numbers", expectedResult, result, 0.0001);
    }

    @Test
    public void testDivideByZero() {
        // Arrange
        SimpleCalculator calculator = new SimpleCalculator();
        int a = 10;
        int b = 0;

        // Act and Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(a, b);
        });

        assertEquals("Divider cannot be zero", exception.getMessage());
    }
}
