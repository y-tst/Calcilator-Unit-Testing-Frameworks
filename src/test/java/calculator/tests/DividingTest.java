package calculator.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DividingTest extends GenericTestData {

    @Test
    public void fiveMinusThree() {
        long result = calculator.div(6, 2);
        Assert.assertTrue(result == 3, "Incorrect result of dividing");
    }
}
