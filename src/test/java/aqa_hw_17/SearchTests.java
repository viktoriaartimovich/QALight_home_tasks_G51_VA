package aqa_hw_17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseTest {

    @Test (groups = {"positive"}, dataProvider = "searchData", dataProviderClass = ProvideData.class)
    public void searchValidProductsTest(String productName) {

        WebElement searchInput = getDriver().findElement(By.xpath("//input[@type='search']"));
        searchInput.sendKeys(productName);

        WebElement searchButton = getDriver().findElement(By.xpath("//button[@data-testid='search-button']"));
        searchButton.click();

        WebElement searchResultTitle = getDriver().findElement(By.xpath("//main//h1"));

        Assert.assertTrue(searchResultTitle.isDisplayed());
    }

    @Test(groups = {"negative"})
    public void searchInvalidProductTest() {

        String invalidSearchText = "qwerty123456789";

        WebElement searchInput = getDriver().findElement(By.xpath("//input[@type='search']"));
        searchInput.sendKeys(invalidSearchText);

        WebElement searchButton = getDriver().findElement(By.xpath("//button[@data-testid='search-button']"));
        searchButton.click();

        WebElement emptySearchResultMessage = getDriver().findElement(By.xpath("//div[@data-qa-no-search]"));

        String actualMessage = emptySearchResultMessage.getText();

        Assert.assertTrue(emptySearchResultMessage.isDisplayed());
        Assert.assertTrue(actualMessage.contains(invalidSearchText));
    }
}