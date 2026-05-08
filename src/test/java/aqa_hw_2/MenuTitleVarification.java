package aqa_hw_2;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class MenuTitleVarification {

    public static void main(String[] args) throws InterruptedException {

        String searchTitle = "Дача, сад";
        WebDriver driver = new ChromeDriver();

        try {
            driver = new ChromeDriver();
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement mainMenuButton = driver.findElement(By.xpath("//div[@class='button-menu-main ']"));
            mainMenuButton.click();

            sleep(3000);

            WebElement mainMenuItem = driver.findElement(By.xpath("//a[@class='menu-main__item-link' and @href='/ua/dacha_sad/']"));
            mainMenuItem.click();

            sleep(3000);

            WebElement menuTitle = driver.findElement(By.xpath("//h1[(@class='title-page flex middle-xs section-title')]"));
            String menuTitleText = menuTitle.getText();

            String errorMessage = format("Title page is incorrect. It doesn't contains <%s>", searchTitle);
            Assert.assertTrue(errorMessage, menuTitleText.contains(searchTitle));

        } finally {
            driver.quit();
        }
    }
}
