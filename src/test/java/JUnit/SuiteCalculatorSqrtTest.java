package JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Test;
import org.testng.Assert;

public class SuiteCalculatorSqrtTest {

    @Test
    public void sqrtOfFour() {
        Calculator calculator = new Calculator();
        long actualResult = (long) calculator.sqrt(4);
        Assert.assertEquals(actualResult, 2, "Incorrect result of Sqrt operation");
    }

    @Test(expected = ArithmeticException.class)
    public void sqrtOfMinusNine() {
        Calculator calculator = new Calculator();
        long actualResult = (long) calculator.sqrt(-9);
    }
}
