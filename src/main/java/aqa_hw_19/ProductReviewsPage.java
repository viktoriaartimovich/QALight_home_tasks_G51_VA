package aqa_hw_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductReviewsPage {

    WebDriver driver;

    public ProductReviewsPage(WebDriver driver) {
        this.driver = driver;
    }

    By productReviewsTab = By.xpath("//div[@class='tabs-item flex center-xs middle-xs active']");
    By shopReviewsTab = By.xpath("//div[@class='tabs-item flex center-xs middle-xs']");

    public boolean isProductReviewsTabDisplayed() {
        return driver.findElement(productReviewsTab).isDisplayed();
    }

    public boolean isShopReviewsTabDisplayed() {
        return driver.findElement(shopReviewsTab).isDisplayed();
    }
}
