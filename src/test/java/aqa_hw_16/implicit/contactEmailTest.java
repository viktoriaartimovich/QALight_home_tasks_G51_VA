package aqa_hw_16.implicit;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class contactEmailTest {

    public static void main(String[] args)  {

        String expectedEmail = "info@on.epicentrk.ua";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

        try {
            driver.get("https://epicentrk.ua/");
            driver.manage().window().maximize();

            WebElement informationButton = driver.findElement(By.xpath("//button[@data-testid='information-button']"));
            informationButton.click();

            WebElement contactsLink = driver.findElement(By.xpath("(//a[@href='/ua/info/contacts/'])[1]"));
            contactsLink.click();

            WebElement contactEmailBlock =driver.findElement(By.xpath("//header[@class='_YTu7E9aA']//*[contains(text(),'Електронна пошта')]"));
            contactEmailBlock.click();

            WebElement contactEmail = driver.findElement(By.xpath("//a[@href='mailto:info@on.epicentrk.ua']"));
            Assert.assertEquals(expectedEmail, contactEmail.getText());

        } finally {
            driver.quit();
        }
    }
}
