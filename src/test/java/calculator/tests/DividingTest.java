package calculator.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DividingTest extends GenericTestData {

    @Test
    public void sixDivideTwo() {
        long actualResult = calculator.div(6, 2);
        Assert.assertEquals(actualResult, 3, "Incorrect result of dividing");
    }
}
