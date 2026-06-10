package aqa_hw_19;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishlistPage {

    WebDriver driver;

    public WishlistPage(WebDriver driver) {
        this.driver = driver;
    }

    By wishlistEmptyMessage = By.xpath("//div[@class='profile-list-empty-message']");

    public boolean isWishlistEmptyMessageDisplayed() {
        return driver.findElement(wishlistEmptyMessage).isDisplayed();
    }

    @Step("Get empty wishlist message")
    public String getEmptyWishlistMessageText() {
        return driver.findElement(wishlistEmptyMessage).getText();
    }
}