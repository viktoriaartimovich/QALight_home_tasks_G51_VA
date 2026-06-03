package aqa_hw_19;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComparePage {

    WebDriver driver;

    public ComparePage(WebDriver driver) {
        this.driver = driver;
    }

    By comparePageTitle = By.xpath("//p[@class='error-text-block__title m_b-10']");

    public boolean isComparePageTitleDisplayed() {
        return driver.findElement(comparePageTitle).isDisplayed();
    }

    @Step("Get actual error message")
    public String getCompareErrorMessageText() {
        return driver.findElement(comparePageTitle).getText();
    }
}