package calculator.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Math.round;

public class SinusTest extends GenericTestData {

    @Test(groups = "Main Group")
    public void sin0() {
        double result = calculator.sin(0);
        Assert.assertEquals(result, 0.0);
    }

    @Test(groups = "Secondary group", dependsOnMethods = {"sin45"}, alwaysRun = true)
    public void sin30() {
        double result = round(calculator.sin(Math.PI / 6));
        Assert.assertEquals(result, 0.5);
    }

    @Test(groups = "Main Group")
    public void sin45() {
        double result = round(calculator.sin(Math.PI / 4));
        Assert.assertEquals(result, 0.7072);
    }
}
