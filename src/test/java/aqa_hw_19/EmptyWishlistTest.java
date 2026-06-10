package aqa_hw_19;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmptyWishlistTest extends BaseTest {

    @Epic("Hotline Website")
    @Feature("Wishlist")
    @Story("User can open wishlist page")
    @Description("Verify that user can open wishlist page and see empty state message")
    @Link("https://hotline.ua/")
    @Test
    public void wishlistPageShowsEmptyStateTest() {

        HomePage homePage = new HomePage(driver);
        WishlistPage wishlistPage = new WishlistPage(driver);

        homePage.clickWishlistButton();
        homePage.openWishlistPage();

        Assert.assertTrue(wishlistPage.isWishlistEmptyMessageDisplayed());
        Assert.assertTrue(wishlistPage.getEmptyWishlistMessageText().contains("Список порожній")
        );
    }
}
