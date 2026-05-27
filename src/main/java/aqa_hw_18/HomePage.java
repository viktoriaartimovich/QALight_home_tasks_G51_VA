package aqa_hw_18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By searchInputField = By.xpath("//input[@type='text']");
    By searchButton = By.xpath("//button[@class='search__btn flex middle-xs center-xs']");
    By loginButton = By.xpath("//a[contains(@class, 'login-button')]");

    public void searchProduct(String productName) {
        WebElement input = driver.findElement(searchInputField);
        input.sendKeys(productName);

        WebElement button = driver.findElement(searchButton);
        button.click();
    }

    public void openLogin() {
        driver.findElement(loginButton).click();
    }
}
