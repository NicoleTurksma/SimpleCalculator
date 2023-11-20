public class SimpleCalculator {

    // Adds two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Subtracts second number from first
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplies two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divides first number by second
    public double divide(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return (double) a / b;
    }
}