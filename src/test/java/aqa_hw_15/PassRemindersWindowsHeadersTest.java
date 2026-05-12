package aqa_hw_15;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class PassRemindersWindowsHeadersTest {

    public static void main(String[] args) throws InterruptedException {
        String reminderWindowsHeader = "Зміна паролю";
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement userButton = driver.findElement(By.xpath("//div[@class='user-button__image flex middle-xs center-xs']"));
            userButton.click();

            sleep(3000);

            WebElement passReminderLink = driver.findElement(By.xpath("//a[@href='/ua/reminder/']"));
            passReminderLink.click();

            sleep(3000);

            String actualReminderWindowHeader = driver.findElement(By.xpath("//div[@class='h3 m_b-15']"))
                            .getText();
            Assert.assertEquals(reminderWindowsHeader,actualReminderWindowHeader);

        }finally {
            driver.quit();
        }

    }
}
