package org.prog.session7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AlloTest {
    private WebDriver driver;

    @BeforeSuite
    public void initWebDriver(){
        driver = new FirefoxDriver();
    }

    @Test
    public void searchProduct() {
        driver.get("https://allo.ua/");
        WebElement search = driver.findElement(By.name("search"));
        search.sendKeys("iPhone");
        search.sendKeys(Keys.ENTER);
        driver.quit();
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
