package aqa_hw_17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ProductTests extends BaseTest {

    @Test(priority = 2, groups = {"positive"})
    public void openFirstProductTest() {

        WebElement searchInput = getDriver().findElement(By.xpath("//input[@type='search']"));
        searchInput.sendKeys("корм для котів");

        WebElement searchButton = getDriver().findElement(By.xpath("//button[@data-testid='search-button']"));
        searchButton.click();

        WebElement firstProduct = getDriver().findElement(By.xpath("(//li[@data-test-small-card='1']//a[contains(@href,'/ua/shop/')]) [1]"));
        firstProduct.click();

        WebElement productTitle = getDriver().findElement(By.xpath("//h1"));

        Assert.assertTrue(productTitle.isDisplayed());
        Assert.assertFalse(productTitle.getText().isEmpty());
    }

    @Test(priority = 1, groups = {"positive"})
    public void buyButtonIsDisplayedTest() {

        WebElement searchInput = getDriver().findElement(By.xpath("//input[@type='search']"));
        searchInput.sendKeys("корм для котів");

        WebElement searchButton = getDriver().findElement(By.xpath("//button[@data-testid='search-button']"));
        searchButton.click();

        List<WebElement> productsCards = getDriver().findElements(By.xpath("//li[@data-test-small-card]"));

        for (WebElement card : productsCards){
            WebElement buyButton = getDriver().findElement(By.xpath("//button[@data-testid='small-cart-item-buy-button']"));

            Assert.assertTrue(buyButton.isDisplayed());
            Assert.assertTrue(buyButton.isEnabled());
        }
    }
}