import org.example.Calculator;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void add() {
        Calculator calcuator = new Calculator();
        assertEquals("2.0", calcuator.addition(1.0, 1.0));
    }

    @Test
    public void subtract() {
        Calculator calculator = new Calculator();
        assertEquals("2.0", calculator.subtraction(3.0, 1.0));
    }

    @Test
    public void multiplication() {
        Calculator calculator = new Calculator();
        assertEquals("25.0", calculator.multiplication(5.0, 5.0));
    }

    @Test
    public void division() {
        Calculator calculator = new Calculator();
        assertEquals("5.0", calculator.division(25.0, 5.0));
    }

    public void divisionZero() {
        Calculator calculator = new Calculator();
        assertEquals("Cannot divide by 0", calculator.division(5.0, 0.0));
    }

    @Test
    public void squareRoot() {
        Calculator calculator = new Calculator();
        assertEquals("5.0", calculator.squareRoot(25.0));
    }

    @Test
    public void squareRootNegative() {
        Calculator calculator = new Calculator();
        assertEquals("Number cannot be negative for square root", calculator.squareRoot(-25.0));
    }

    @Test
    public void factorial() {
        Calculator calculator = new Calculator();
        assertEquals("120", calculator.factorial(5));
    }

    @Test
    public void factorialNegative() {
        Calculator calculator = new Calculator();
        assertEquals("Number cannot be negative for factorial", calculator.factorial(-3));
    }
}
