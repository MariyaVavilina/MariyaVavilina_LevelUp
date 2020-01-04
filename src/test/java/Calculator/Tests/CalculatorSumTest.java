package Calculator.Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorSumTest extends AbstractBaseTest{

    @Test
    public void simpleSumTest() {
        double actual = calculator.sum(2.0, 2.0);
        Assert.assertEquals(actual, 4.0);
    }

    @DataProvider
    public Object[][] sumPositiveTestDataProvider() {
        return new Object[][]{
                {2.0, 2.0, 4.0},
                {4.0, 5.0, 9.0}
        };
    }

    @DataProvider(name = "Negative Sum Test Data")
    public Object[][] sumNegativeTestDataProvider() {
        return new Object[][]{
                {2.0, 2.0, 5.0},
                {4.0, 5.0, 10.0}
        };
    }

    @Test(dataProvider = "sumPositiveTestDataProvider")
    public void positiveDataProviderSumTest(double a, double b, double expected) {
        double actual = calculator.sum(a, b);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "Negative Sum Test Data")
    public void negativeDataProviderSumTest(double a, double b, double expected) {
        double actual = calculator.sum(a, b);
        Assert.assertNotEquals(actual, expected);
    }

}
