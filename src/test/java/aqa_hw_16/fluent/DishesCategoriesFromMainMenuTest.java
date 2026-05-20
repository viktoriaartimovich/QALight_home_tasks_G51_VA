package aqa_hw_16.fluent;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class DishesCategoriesFromMainMenuTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        FluentWait<WebDriver> waiter = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(6))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        try {
            driver.get("https://epicentrk.ua/");
            driver.manage().window().maximize();

            WebElement mainPageMenuItem =
                    waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@href='/ua/shop/dom-i-interer/'])[2]")));
            mainPageMenuItem.click();

            WebElement catalogueLinkDishes =
                    waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/ua/shop/posuda/']")));
            catalogueLinkDishes.click();


            waiter.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//nav[@class='_yM8Rtc1u']"),16));
            List<WebElement> dishesCategories =driver.findElements(By.xpath("//nav[@class='_yM8Rtc1u']"));

            for (WebElement element : dishesCategories){
                Assert.assertTrue(element.isDisplayed());
                Assert.assertTrue(element.isEnabled());
            }

        } finally {
            driver.quit();
        }
    }
}
