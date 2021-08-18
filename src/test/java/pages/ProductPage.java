package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static locators.Locators.*;

public class ProductPage {

    public static String getItemPrice(WebDriverWait wait){

        String itemPrice = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(itemPriceMain_Xpath)))
                .getText();

        return itemPrice;
    }

    public static String getItemName(WebDriverWait wait){

        String itemName = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(itemNameMain_Xpath))).getText();

        return itemName;
    }

    public static void increaseProductCount(WebDriverWait wait){

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(increaseItem_Xpath))).click();
    }


    public static void addToCart(WebDriverWait wait){

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(addToBasket_Xpath))).click();
    }

}
