package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static locators.Locators.givePermission_Id;

public class Permissions {

    public static void AllowLocationPermission(WebDriverWait wait){

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(givePermission_Id))).click();
    }
}
