package calculator.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdditionTest extends GenericTestData {

    @Test(dataProvider = "Values for addition")
    public void sumOfTwoNumbers(long firstTerm, long secondTerm, long expectedResult) {
        long actualResult = calculator.sum(firstTerm, secondTerm);
        Assert.assertEquals(actualResult, expectedResult, "Incorrect result of addition");
    }

    @DataProvider(name = "Values for addition")
    public Object[][] inputValuesForAddition() {
        return new Object[][]{
                {0, 0, 0},
                {5, 7, 12},
                {5, -8, -3},
                {-11, -22, -33}
        };
    }
}
