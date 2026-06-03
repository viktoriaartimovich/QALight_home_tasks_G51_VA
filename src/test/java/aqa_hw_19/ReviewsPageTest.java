package aqa_hw_19;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReviewsPageTest extends BaseTest{

    @Epic("Hotline Website")
    @Feature("Reviews")
    @Story("User can open reviews page")
    @Description("Verify that reviews page contains product reviews and shop reviews tabs")
    @Link("https://hotline.ua/")
    @Issue("HW-19")
    @Test
    public void reviewsTabsAreDisplayedTest() {

        HomePage homePage = new HomePage(driver);
        ProductReviewsPage reviewsPage = new ProductReviewsPage(driver);

        homePage.openProductReviewsPage();

        Assert.assertTrue(reviewsPage.isProductReviewsTabDisplayed());
        Assert.assertTrue(reviewsPage.isShopReviewsTabDisplayed());
    }

}


