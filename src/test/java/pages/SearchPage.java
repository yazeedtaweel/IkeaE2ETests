package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static locators.Locators.*;

public class SearchPage {

    public static String getFirstItemPrice(WebDriverWait wait){

        String itemPrice = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(firstItemPrice_Xpath)))
                .getText();

        return itemPrice;
    }

    public static String getFirstItemName(WebDriverWait wait){

        String itemName = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(firstItemName_Xpath))).getText();

        return itemName;
    }

    public static void ClickFirstItem(WebDriverWait wait){

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(firstItem_Xpath))).click();
    }
}
