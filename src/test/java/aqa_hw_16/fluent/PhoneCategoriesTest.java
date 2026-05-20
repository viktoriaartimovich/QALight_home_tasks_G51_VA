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

public class PhoneCategoriesTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        FluentWait<WebDriver> waiter = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(6))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        try {
            driver.get("https://epicentrk.ua/");
            driver.manage().window().maximize();

            WebElement catalogueButton =
                    waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid='product-catalogue-dropdown-button']")));
            catalogueButton.click();

            WebElement catalogueLinkElectronics =
                    waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-testid='catalog-categories-of-items' and @title='Електроніка']")));
            catalogueLinkElectronics.click();

            WebElement catalogueLinkMobDetails =
                    waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/ua/shop/mobilnyye-telefony/']")));
            catalogueLinkMobDetails.click();

            List<WebElement> phoneCategories = driver.findElements(By.xpath("//ul[@class='_Cs4fY2i0 _w5AHuetJ _DUf7Or9H _L748Za6T _eroRTvq0']"));

            for (WebElement element : phoneCategories){
                Assert.assertTrue(element.isDisplayed());
                Assert.assertTrue(element.isEnabled());
            }

        } finally {
            driver.quit();
        }
    }
}
