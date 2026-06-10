package aqa_hw_19;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoriesPage {

    WebDriver driver;

    public CategoriesPage(WebDriver driver) {
        this.driver = driver;
    }

    By categoryMenuItem = By.xpath("//li[@class='menu-main__item']");

    @Step("Find categories count")
    public int getCategoriesCount() {
        return driver.findElements(categoryMenuItem).size();
    }
}