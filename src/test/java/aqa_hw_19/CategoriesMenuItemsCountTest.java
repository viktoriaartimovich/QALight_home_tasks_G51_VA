package aqa_hw_19;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class CategoriesMenuItemsCountTest extends BaseTest {

        @Epic("Hotline Website")
        @Feature("Categories")
        @Story("User can open categories menu")
        @Description("Verify that categories menu contains expected number of category items")
        @Link("https://hotline.ua/")
        @Issue("Defect-N1")
        @Test
        public void categoriesMenuContainsExpectedNumberOfItemsTest() {

            HomePage homePage = new HomePage(driver);
            CategoriesPage categoriesPage = new CategoriesPage(driver);

            homePage.clickCatalogButton();

            int actualCount = categoriesPage.getCategoriesCount();

            Assert.assertEquals(actualCount, 24);
        }
    }
