package MooCodeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

/**
 * Created by E7440 on 04/07/2017.
 */
public class SearchPage extends Utils {

    SoftAssert softAssert = new SoftAssert();

    private By _searchBoxField = By.cssSelector("#query");
    private By _webResultField = By.xpath("//*[@id=\"___gcse_0\"]/div/div/div/div[5]/div[2]/div/div/div[1]");
    private By _productListField = By.xpath("//div[@id='___gcse_0']/div/div/div/div[5]/div[2]/div/div/div[2]/div");


    public void verifyValidSearchResult(String product) {

        String firstProduct=driver.findElement(_webResultField).getText();
        softAssert.assertTrue(firstProduct.toLowerCase().contains(product.toLowerCase()),firstProduct +"is wrong search result");

        List<WebElement> prList =driver.findElements(By.xpath(".//div[@id=\"___gcse_0\"]/div/div/div/div[5]/div[2]/div/div/div[2]/div/div[1]/div[1]/div/a"));

        for (int i = 1; i <=prList.size() ; i++)
        {
              String productText=driver.findElement(By.xpath(".//div[@id=\"___gcse_0\"]/div/div/div/div[5]/div[2]/div/div/div[2]/div["+i+"]")).getText();

              softAssert.assertTrue(productText.toLowerCase().contains(product.toLowerCase()),productText + "is wrong search result\n");

        }
        softAssert.assertAll();
    }

    public void verifyInvalidSearchResult(){

        //driver.findElement(_searchBoxField).sendKeys(inValidProduct);
        //driver.findElement(By.xpath("//*[@id=\"search\"]/div/button")).click();

        String resultMessageExpected = "Sorry we couldn’t find anything. Please check the spelling or alternatively chat to our friendly customer services team using the chat below.";
        String resultMessageActual = driver.findElement(By.xpath("//*[@id=\"___gcse_0\"]/div/div/div/div[5]/div[2]/div/div/div[1]/div")).getText();
        softAssert.assertEquals(resultMessageActual, resultMessageExpected);
        softAssert.assertAll();
    }
}
