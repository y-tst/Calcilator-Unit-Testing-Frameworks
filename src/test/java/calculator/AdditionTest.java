package calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionTest extends GenericTestData {

    @Test
    public void onePlusTwoTest() {
        long result = calculator.sum(1, 2);
        Assert.assertEquals(result, 3, "Incorrect result of addition");
    }
}
