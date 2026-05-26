package aqa_hw_17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void driverInit() {
        driver = new ChromeDriver();
        driver.get("https://epicentrk.ua/ua/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterMethod(alwaysRun = true)
    public void driverQuit() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}