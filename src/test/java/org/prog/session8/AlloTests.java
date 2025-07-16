package org.prog.session8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.prog.session8.page.AlloPage;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlloTests {
    private WebDriver driver;
    private AlloPage alloPage;

    @BeforeSuite
    public void initWebDriver() {
        driver = new FirefoxDriver();
        alloPage = new AlloPage(driver);
    }

    @Test
    public void priceCurrencySymbolTest() {
        // Arrange
        String productToSearch = "iPhone 16";
        String expectedCurrency = "₴";

        // Act
        alloPage.loadPage();
        alloPage.searchForProduct(productToSearch);

        var products = alloPage.getProducts();
        String productPrice = alloPage.getProductPrice(products.get(0));

        // Assert
        Assert.assertTrue(productPrice.endsWith(expectedCurrency));
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
