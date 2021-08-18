package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static locators.Locators.*;

public class DashboardPage {

    public static void clickCloseHintButton(WebDriverWait wait){

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(closeHintButton_Xpath))).click();
    }

    public static void clickSearchButton(WebDriverWait wait){

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(searchButton_Xpath))).click();
    }

    public static void typeProductName(WebDriverWait wait, String productName){

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(searchField_Xpath))).sendKeys(productName);
    }
}
