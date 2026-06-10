package aqa_hw_19;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {

    WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    By firstProductCompareButton = By.xpath("(//button[@title='Додати товар у порівняння'])[1]");
    By mainCompareButton = By.xpath("(//div[@class='button__icon flex'])[1]");
    By linkToComparePage = By.xpath("//div[@class='profile-sidebar__section-child-container']");

    @Step("Add first product to the compare list")
    public void addFirstProductToCompare() {
        driver.findElement(firstProductCompareButton).click();
    }

    @Step("Click on compare button on pages header")
    public void clickOnMainCompareButton() {
        driver.findElement(mainCompareButton).click();
    }

    @Step("Open compare page by clicking the link")
    public void openComparePage() {
        driver.findElement(linkToComparePage).click();
    }
}

