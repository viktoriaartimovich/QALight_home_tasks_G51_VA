package aqa_hw_2;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static java.lang.Thread.sleep;

public class WishPopUpVisibilityVerification  {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try{
            driver = new ChromeDriver();
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement wishlistButton = driver.findElement(By.xpath("//div[@class='popover my-lists'] //div[@class='button__icon flex']"));
            wishlistButton.click();

            sleep(3000);

            WebElement wishListPopUp = driver.findElement(By.xpath("//div[contains(@class,'my-lists__section')]"));
            Assert.assertTrue("Wish list popup isn't displayed", wishListPopUp.isDisplayed());

        } finally {
            driver.quit();
        }
    }
}
