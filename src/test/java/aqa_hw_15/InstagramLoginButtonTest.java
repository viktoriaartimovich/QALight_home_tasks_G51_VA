package aqa_hw_15;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class InstagramLoginButtonTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement instagramLink = driver.findElement(By.xpath("//a[@title='Instagram']"));
            instagramLink.click();

            sleep(6000);

            String lastTabId = driver.getWindowHandles().stream().toList().get(1);
            driver.switchTo().window(lastTabId);

            sleep(6000);

            WebElement loginButton = driver.findElement(By.xpath("//div[@aria-label='Log In']"));
            Assert.assertTrue(loginButton.isDisplayed());
            Assert.assertEquals("true", loginButton.getAttribute("aria-disabled"));

        }finally {
            driver.quit();
        }

    }
}
