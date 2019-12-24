package Calculator.Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorDivTest extends AbstractBaseTest {
    @Test
    public void SimpleDivTest(){
        double actual = calculator.div(2.0,2.0);
        Assert.assertEquals(actual,1.0);
    }

    @DataProvider
    public Object [][] divPositiveTestDataProvider () {
        return new Object[][]{
                {2.0,2.0,1.0},
                {20.0,4.0,5.0}
        };
    }


    @DataProvider(name = "Negative Div Test Data")
    public Object [][] divNegativeTestDataProvider () {
        return new Object[][]{
                {2.0,2.0,5.0},
                {20.0,4.0,10.0}
        };
    }

    @Test(dataProvider = "divPositiveTestDataProvider")
    public void PositiveDataProviderDivTest(double a,double b, double expected){
        double actual = calculator.div(a, b);
        Assert.assertEquals(actual, expected);
    }


    @Test(dataProvider = "Negative Div Test Data")
    public void NegativeDataProviderDivTest(double a,double b, double expected){
        double actual = calculator.div(a, b);
        Assert.assertNotEquals(actual, expected);
    }
}
