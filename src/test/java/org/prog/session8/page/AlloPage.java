package org.prog.session8.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AlloPage {
    private final WebDriver driver;

    public AlloPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loadPage() {
        driver.get("https://allo.ua/");
    }

    public void searchForProduct(String productName) {
        WebElement search = driver.findElement(By.name("search"));
        search.sendKeys(productName);
        search.sendKeys(Keys.ENTER);
    }

    public List<WebElement> getProducts() {
        var wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("products-layout__item")));
    }

    public String getProductPrice(WebElement product) {
        return product.findElement(By.className("v-pb__cur")).getText();
    }
}
