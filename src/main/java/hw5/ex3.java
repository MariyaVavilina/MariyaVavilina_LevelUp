package hw5;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ex3 extends AbctractClass{

    @Test
    public void openSitePageTest(){
        //шаг 1 "Открыть тестовый сайт", добавлено в @BeforeMethod
        //driver.get("http://users.bugred.ru/");
        //шаг 2  "Войти на сайт"
        driver.findElement(By.xpath("//a//span[text()='Войти']")).click();
        driver.findElement(By.name("login")).sendKeys("mariyavavilina@mail.ru");
        driver.findElement(By.name("password")).sendKeys("12345678");
        driver.findElement(By.xpath("//input[@value='Авторизоваться']")).click();
        //шаг 3 "Нажать на кнопку «Компании»"
        driver.findElement(By.xpath("//a//span[text()='Компании']")).click();
        //при нажатии на кнопоку «Добавить компанию»" открывается пустое окно, дальнейшая работа невозможна
    }
}
