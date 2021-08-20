package tests;

import com.google.common.collect.ImmutableMap;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class Test_Remove_From_Cart extends Base{


    @Test
    public void add_two_quantities_of_a_product_to_cart_and_remove_from_cart_while_checkout()
    {
        test =  extent.startTest("add_two_quantities_of_a_product_to_cart_and_remove_from_cart_while_checkout");
        WebDriverWait wait = new WebDriverWait(appiumDriver, 50);

        // Click on the allow access location
        Permissions.AllowLocationPermission(wait);

        // Click on the english language button
        MainPage.ClickEnglishButton(wait);

        // Click on the buy products button
        MainPage.clickBuyOnlineProduct(wait);

        // Click on the close hint button
        DashboardPage.clickCloseHintButton(wait);

        // Click on the search icon
        DashboardPage.clickSearchButton(wait);

        // Type the product name in the search field
        DashboardPage.typeProductName(wait, "table");

        // Perform search
        appiumDriver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "done"));

        // Get first item info
        String firstItemName = SearchPage.getFirstItemName(wait);
        String firstItemPrice = SearchPage.getFirstItemPrice(wait);

        // Click on the first item
        SearchPage.ClickFirstItem(wait);

        // Get item info
        String itemPrice = ProductPage.getItemPrice(wait);
        String itemName = ProductPage.getItemName(wait);

        // Assert the name and the price
        Assert.assertEquals(itemName, firstItemName, "Item name doesn't match the name in the product page");
        Assert.assertEquals(itemPrice, firstItemPrice, "Item price doesn't match the price in the product page");

        // Add 2 quantity of the product
        ProductPage.increaseProductCount(wait);

        // Add to cart button
        ProductPage.addToCart(wait);

        // Go back twice to the home page
        appiumDriver.navigate().back();
        appiumDriver.navigate().back();

        // Click on the checkout
        MainPage.clickCheckout(wait);

        // empty the basket
        CheckoutPage.emptyBasket(wait);

        // Confirm empty
        CheckoutPage.confirmClearProducts(wait);

        // Assert the empty message
        String emptyMessage = CheckoutPage.getEmptyMessage(wait);
        Assert.assertEquals(emptyMessage, "There are no items in your basket!",
                "Empty message is incorrect!");

        test.log(LogStatus.PASS, "Test is passed");

    }
}
