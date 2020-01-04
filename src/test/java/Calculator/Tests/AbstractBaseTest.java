package Calculator.Tests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class AbstractBaseTest {
    protected Calculator calculator;

    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method");
        calculator = new Calculator();
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After Method");
        calculator=null;
    }
}
