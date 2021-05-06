package JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Test;
import org.testng.Assert;

public class SuiteCalculatorPowTest {

    @Test
    public void threePowThree() {
        Calculator calculator = new Calculator();
        long actualResult = (long) calculator.pow(3, 3);
        Assert.assertEquals(actualResult, 27, "Incorrect result of Pow operation");
    }

    @Test
    public void minusFivePowTwo() {
        Calculator calculator = new Calculator();
        long actualResult = (long) calculator.pow(-0.2, 3);
        Assert.assertEquals(actualResult, -0.8, "Incorrect result of Pow operation");
    }
}
