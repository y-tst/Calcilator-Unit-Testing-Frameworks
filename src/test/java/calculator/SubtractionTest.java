package calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractionTest extends GenericTestData {

    @Test
    public void fiveMinusThree() {
        long result = calculator.sub(5, 3);
        Assert.assertTrue(result == 2, "Incorrect result of subtraction");
    }
}
