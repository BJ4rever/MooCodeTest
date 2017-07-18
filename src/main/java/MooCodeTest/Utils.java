package MooCodeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Utils extends BasePage {

    //re-usable method for click on Element
    public static void clickOnElement(By by){

        driver.findElement(by).click();
    }

    // re-usable method for typing text into element (instead of sendKeys())
    public static void typeText(By by, String text){
        //clearing any existing text from the element
        driver.findElement(by).clear();
        //sending your text to the locator by
        driver.findElement(by).sendKeys(text);
    }

   public static void assertTrueByElementDisplayed(By by){
       Assert.assertTrue(driver.findElement(by).isDisplayed(), "No such element has been displayed");
   }

   public static void assertTrueByContainsString(String text){
        Assert.assertTrue(driver.getCurrentUrl().contains(text),"User not on "+text+" page");
    }
}
