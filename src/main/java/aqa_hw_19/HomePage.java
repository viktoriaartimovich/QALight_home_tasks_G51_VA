package aqa_hw_19;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By catalogButton = By.xpath("//div[@class='button-menu-main ']");
    By searchInput = By.xpath("//input[@type='text']");
    By searchButton = By.xpath("//button[@class='search__btn flex middle-xs center-xs']");
    By wishlistButton = By.xpath("(//div[@class='button__icon flex'])[2]");
    By wishlistLink = By.xpath("(//div[@class='profile-sidebar__section-child-container'])[1]");
    By reviewsLink = By.xpath("//a[@class='services-section__link link--black productReviews']");

    @Step("Click Catalog Button")
    public void clickCatalogButton() {
        driver.findElement(catalogButton).click();
    }

    @Step("Enter search product name and clock search button")
    public void searchProduct(String productName) {
        driver.findElement(searchInput).sendKeys(productName);
        driver.findElement(searchButton).click();
    }

    @Step("Click wishlist button")
    public void clickWishlistButton() {
        driver.findElement(wishlistButton).click();
    }

    @Step("Open wishlist page")
    public void openWishlistPage() {
        driver.findElement(wishlistLink).click();
    }

    public void openProductReviewsPage(){
        driver.findElement(reviewsLink).click();
    }
}
