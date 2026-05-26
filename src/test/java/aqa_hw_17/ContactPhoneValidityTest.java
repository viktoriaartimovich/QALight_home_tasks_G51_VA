package aqa_hw_17;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class ContactPhoneValidityTest extends BaseTest {

    String expectedPhone = "0 800 20 27 27";

    @Test(groups = {"positive"})
    public void contactEmailIsCorrectTest() {

        WebElement informationButton =
                getDriver().findElement(By.xpath("//button[@data-testid='information-button']"));
        informationButton.click();

        WebElement contactsLink =
                getDriver().findElement(By.xpath("(//a[@href='/ua/info/contacts/'])[1]"));
        contactsLink.click();

        WebElement contactPhoneBlock =
                getDriver().findElement(By.xpath("//header[@class='_YTu7E9aA']//*[contains(text(),'Телефони Служби Підтримки')]"));
        contactPhoneBlock.click();

        WebElement contactPhone = getDriver().findElement(By.xpath("(//a[@class='_lEBYBl36'])[1]"));
        Assert.assertEquals(expectedPhone, contactPhone.getText());

    }
}
