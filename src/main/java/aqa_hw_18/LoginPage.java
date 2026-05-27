package aqa_hw_18;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By registrationTab = By.xpath("//a[@href='/ua/register/']");
    By registrationEmailInput = By.xpath("//input[@inputmode='email']");
    By registrationNameInput = By.xpath("//input[@id='name']");
    By registrationPasswordInput = By.xpath("//input[@type='password']");

    public void openRegistrationTab() {
        driver.findElement(registrationTab).click();
    }

    public boolean isRegistrationEmailInputDisplayed() {
        return driver.findElement(registrationEmailInput).isDisplayed();
    }

    public boolean isRegistrationNameInputDisplayed() {
        return driver.findElement(registrationNameInput).isDisplayed();
    }

    public boolean isRegistrationPasswordInputDisplayed() {
        return driver.findElement(registrationPasswordInput).isDisplayed();
    }
}
