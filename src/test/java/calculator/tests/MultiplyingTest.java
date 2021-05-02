package calculator.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplyingTest extends GenericTestData {

    @Test
    public void twoMultipleFive() {
        long actualResult = calculator.mult(2, 5);
        Assert.assertEquals(actualResult, 10, "Incorrect result of multiplying");
    }

}
