package aqa_hw_19;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComparePageErrorTest extends BaseTest {

    @Epic("Hotline Website")
    @Feature("Compare")
    @Story("User cannot compare only one product")
    @Description("Verify that compare page displays validation message when only one product is added")
    @Link("https://hotline.ua/")
    @Test
    public void twoProductsCanBeAddedToCompareTest() {

        HomePage homePage = new HomePage(driver);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        ComparePage comparePage = new ComparePage(driver);

        homePage.searchProduct("iPhone");
        searchResultsPage.addFirstProductToCompare();
        searchResultsPage.clickOnMainCompareButton();
        searchResultsPage.openComparePage();

        Assert.assertTrue(comparePage.isComparePageTitleDisplayed());
        Assert.assertTrue(comparePage.getCompareErrorMessageText()
                .contains("вибрано менше 2 товарів для порівняння"));
    }
}