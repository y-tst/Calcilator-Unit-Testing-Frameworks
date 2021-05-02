package calculator.tests;

import org.testng.annotations.Test;

public class DividingByZeroTest extends GenericTestData {

    @Test(expectedExceptions = NumberFormatException.class)
    public void testDivideByZero() {
        long x = calculator.div(5, 0);
    }
}
