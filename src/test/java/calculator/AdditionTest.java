package calculator;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdditionTest {

    private Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void onePlusTwoTest() {
        long result = calculator.sum(1, 2);
        Assert.assertEquals(result, 3, "Incorrect result of addition");
    }

    @AfterClass
    public void tearDown() {
        calculator = null;
    }

}
