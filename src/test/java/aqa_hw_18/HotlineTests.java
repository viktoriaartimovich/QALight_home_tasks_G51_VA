package aqa_hw_18;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HotlineTests extends BaseTest {

    @Test
    public void searchProductTest() {
        HomePage homePage = new HomePage(driver);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);

        homePage.searchProduct("iphone");

        Assert.assertTrue(searchResultsPage.isSearchResultsTitleDisplayed());
        Assert.assertTrue(searchResultsPage.getSearchResultsTitleText().contains("iphone"));
    }

    @Test
    public void openFirstProductCardTest() {
        HomePage homePage = new HomePage(driver);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        ProductPage productPage = new ProductPage(driver);

        homePage.searchProduct("samsung");
        searchResultsPage.openFirstProduct();

        Assert.assertTrue(productPage.isProductTitleDisplayed());
        Assert.assertFalse(productPage.getProductTitleText().isEmpty());
        Assert.assertTrue(productPage.isProductPriceDisplayed());
    }

    @Test
    public void registrationFieldsAreDisplayedTest() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.openLogin();
        loginPage.openRegistrationTab();

        Assert.assertTrue(loginPage.isRegistrationEmailInputDisplayed());
        Assert.assertTrue(loginPage.isRegistrationNameInputDisplayed());
        Assert.assertTrue(loginPage.isRegistrationPasswordInputDisplayed());
    }
}
