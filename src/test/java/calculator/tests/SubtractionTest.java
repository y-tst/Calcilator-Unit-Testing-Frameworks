package calculator.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubtractionTest extends GenericTestData {

    @Test(dataProvider = "Values for subtraction")
    public void differenceOfTwoNumbers(long minuend, long subtrahend, long expectedResult) {
        long actualResult = calculator.sub(minuend, subtrahend);
        Assert.assertEquals(actualResult, expectedResult, "Incorrect result of subtraction");
    }

    @DataProvider(name = "Values for subtraction")
    public Object[][] inputValuesForSubtraction() {
        return new Object[][]{
                {10, 3, 7},
                {-1, 5, -6},
                {5, -7, 12},
                {0, 0, 0},
        };
    }
}
