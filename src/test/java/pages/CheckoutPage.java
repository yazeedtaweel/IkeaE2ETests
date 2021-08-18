package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static locators.Locators.*;

public class CheckoutPage {

    public static void emptyBasket(WebDriverWait wait){

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(emptyBasket_Xpath))).click();
    }

    public static void confirmClearProducts(WebDriverWait wait){

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(confirmEmptyBasket_Xpath))).click();
    }

    public static String getEmptyMessage(WebDriverWait wait){

        String emptyText = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(emptyMessage_Xpath))).getText();

        return emptyText;
    }
}
