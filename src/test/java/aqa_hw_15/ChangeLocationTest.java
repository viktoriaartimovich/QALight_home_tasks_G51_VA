package aqa_hw_15;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class ChangeLocationTest {

    public static void main(String[] args) throws InterruptedException {
        String locationToChoose = "Львів";
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement locationButton = driver.findElement(By.xpath("//div[@class='header__location-button hidden-below-xl']"));
            locationButton.click();

            sleep(4000);

            WebElement locationInputField = driver.findElement(By.xpath("//input[@type='text' and @placeholder='Почніть вводити назву']"));
            locationInputField.sendKeys("Львів");

            sleep(2000);

            WebElement lvivOption = driver.findElement(By.xpath("//*[contains(text(),'Львів, Львівська область')]"));
            lvivOption.click();

            sleep(3000);

            String actualLocationCity = driver.findElement(By.xpath("//div[@class='location__city']"))
                            .getText();
            Assert.assertEquals(locationToChoose,actualLocationCity);

        }finally {
            driver.quit();
        }

    }
}
