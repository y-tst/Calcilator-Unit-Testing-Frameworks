package calculator.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplyingTest extends GenericTestData {

    @Test
    public void twoMultipleFive() {
        long result = calculator.mult(2, 5);
        Assert.assertEquals(result, 10, "Incorrect result of multiplying");
    }

}
