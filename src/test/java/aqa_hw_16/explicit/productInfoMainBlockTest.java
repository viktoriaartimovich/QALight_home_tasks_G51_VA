package aqa_hw_16.explicit;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class productInfoMainBlockTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(8));

        try {
            driver.get("https://epicentrk.ua/");
            driver.manage().window().maximize();

            WebElement searchInputField = driver.findElement(By.xpath("//input[@type='search']"));
            searchInputField.sendKeys("корм для котів");

            WebElement searchButton = driver.findElement(By.xpath("//button[@data-testid='search-button']"));
            searchButton.click();

            waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Корм для котів']")));

            WebElement firstProductLink = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@itemprop='item']//a)[1]")));
            firstProductLink.click();

            WebElement productInfoMainBlock =  waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main']")));
            Assert.assertTrue(productInfoMainBlock.isDisplayed());

        } finally {
            driver.quit();
        }
    }
}
