package Calculator.Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorMultTest extends  AbstractBaseTest {

    @Test
    public void simpleMultTest(){
        double actual = calculator.mult(2.0,2.0);
        Assert.assertEquals(actual,4.0);
    }

    @DataProvider
    public Object [][] multPositiveTestDataProvider () {
        return new Object[][]{
                {2.0,2.0,4.0},
                {5.0,4.0,20.0}
        };
    }

    @DataProvider(name = "Negative Mult Test Data")
    public Object [][] multNegativeTestDataProvider () {
        return new Object[][]{
                {2.0,2.0,5.0},
                {5.0,4.0,10.0}
        };
    }

    @Test(dataProvider = "multPositiveTestDataProvider")
    public void positiveDataProviderMultTest(double a,double b, double expected){
        double actual = calculator.mult(a, b);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "Negative Mult Test Data")
    public void negativeDataProviderMultTest(double a,double b, double expected){
        double actual = calculator.mult(a, b);
        Assert.assertNotEquals(actual, expected);
    }
}
