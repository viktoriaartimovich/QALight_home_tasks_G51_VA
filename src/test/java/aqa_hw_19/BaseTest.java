package aqa_hw_19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void driverInit() {
        driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @AfterMethod
    public void driverQuit() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}