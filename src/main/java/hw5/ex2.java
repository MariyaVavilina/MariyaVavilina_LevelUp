package hw5;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ex2 extends AbctractClass{

    @Test
    public void openSitePageTest(){
        //шаг 1 "Открыть тестовый сайт", добавлено в @BeforeMethod
        //driver.get("http://users.bugred.ru/");
        //шаг 2  "Войти на сайт"
        driver.findElement(By.xpath("//a//span[text()='Войти']")).click();
        driver.findElement(By.name("login")).sendKeys("mariyavavilina@mail.ru");
        driver.findElement(By.name("password")).sendKeys("12345678");
        driver.findElement(By.xpath("//input[@value='Авторизоваться']")).click();
        //шаг 3 Нажать на кнопку "Добавить пользователя"
        driver.findElement(By.xpath("//a[@class='btn btn-danger']")).click();
        // Ввести имя, email и пароль, нажать на кнопку "Добавить пользователя"
        driver.findElement(By.name("noibiz_name")).sendKeys("M&N");
        driver.findElement(By.name("noibiz_email")).sendKeys("M&N@mail.ru");
        driver.findElement(By.name("noibiz_password")).sendKeys("M&N");
        driver.findElement(By.xpath("//input[@value='Добавить пользователя']")).click();
        // проверить, есть ли строчка с новым именем пользователя
        driver.findElement(By.xpath("//td[contains(text(),'M&N')]"));
    }
}
