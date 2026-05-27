package aqa_hw_18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {

    WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    By searchResultsTitle = By.xpath("//div[@class='search__title']");
    By firstProduct = By.xpath("//div[contains(@class, 'list-item list-item--column')][1]");

    public boolean isSearchResultsTitleDisplayed() {
        return driver.findElement(searchResultsTitle).isDisplayed();
    }

    public String getSearchResultsTitleText() {
        return driver.findElement(searchResultsTitle).getText();
    }

    public void openFirstProduct() {
        driver.findElement(firstProduct).click();
    }
}

