package hw5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ex1 extends AbctractClass{

    @Test
    public void openSitePageTest(){
        //шаг 1 "Открыть тестовый сайт"
        driver.get("http://users.bugred.ru/");

        //шаг 2 "Проверить название сайта"
        assertThat(driver.getTitle(), equalTo("Users"));

        //шаг 3  "Войти на сайт"
        driver.findElement(By.xpath("//a//span[text()='Войти']")).click();
        driver.findElement(By.name("login")).sendKeys("mariyavavilina@mail.ru");
        driver.findElement(By.name("password")).sendKeys("12345678");
        driver.findElement(By.xpath("//input[@value='Авторизоваться']")).click();

        //шаг 4 "Проверить имя пользователя в правом верхнем углу"
        assertThat(driver.findElement(By.id("fat-menu")).getText(), equalTo("mariya@"));
        driver.findElement(By.id("fat-menu")).click();

        //шаг 5 "Выполнить выход их системы"
        driver.findElement(By.xpath("//a[text()='Выход']")).click();

        //шаг 6 "Закрыть браузер"
        driver.close();
    }
}
