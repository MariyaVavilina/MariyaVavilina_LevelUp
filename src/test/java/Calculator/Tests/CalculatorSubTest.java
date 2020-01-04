package Calculator.Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorSubTest extends AbstractBaseTest {
    @Test
    public void SimpleSubTest(){
        double actual = calculator.sub(2.0,2.0);
        Assert.assertEquals(actual,0.0);
    }

    @DataProvider
    public Object [][] subPositiveTestDataProvider () {
        return new Object[][]{
                {2.0,2.0,0.0},
                {5.0,4.0,1.0}
        };
    }


    @DataProvider(name = "Negative Sub Test Data")
    public Object [][] subNegativeTestDataProvider () {
        return new Object[][]{
                {2.0,2.0,5.0},
                {5.0,4.0,10.0}
        };
    }

    @Test(dataProvider = "subPositiveTestDataProvider")
    public void PositiveDataProviderSubTest(double a,double b, double expected){
        double actual = calculator.sub(a, b);
        Assert.assertEquals(actual, expected);
    }


    @Test(dataProvider = "Negative Sub Test Data")
    public void NegativeDataProviderSubTest(double a,double b, double expected){
        double actual = calculator.sub(a, b);
        Assert.assertNotEquals(actual, expected);
    }
}
