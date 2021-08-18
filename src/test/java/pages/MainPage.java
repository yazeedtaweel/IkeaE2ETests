package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static locators.Locators.*;

public class MainPage {

    public static void ClickEnglishButton(WebDriverWait wait){

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(englishVersion_Xpath))).click();
    }

    public static void clickBuyOnlineProduct(WebDriverWait wait){

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(buyProductOnline_Xpath))).click();
    }

    public static void clickCheckout(WebDriverWait wait){

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(checkout_Xpath))).click();
    }
}
