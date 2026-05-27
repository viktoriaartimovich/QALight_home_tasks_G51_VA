package aqa_hw_18;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    By productTitle = By.xpath("//div[@class='title']");
    By productPriceDetails = By.xpath("//div[@class='price__container flex flex-wrap bottom-xs m_b-10']");

    public boolean isProductTitleDisplayed() {
        return driver.findElement(productTitle).isDisplayed();
    }

    public String getProductTitleText() {
        return driver.findElement(productTitle).getText();
    }

    public boolean isProductPriceDisplayed() {
        return driver.findElement(productPriceDetails).isDisplayed();
    }
}
