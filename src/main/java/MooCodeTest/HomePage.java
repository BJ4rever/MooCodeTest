package MooCodeTest;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    private By _searchBoxField = By.cssSelector("#query");
    private By _searchButtonField = By.xpath("//button[contains(@class,'search__btn')]");
    private By  _businessCardLink = By.linkText("Business Cards");
    private By _referAFriendLink = By.linkText("Refer a Friend");


    public void userIsOnHomePage(){

        driver.get("https://www.moo.com/uk/");
    }

    public void searchProduct(String productName){
        //Entered search term into the search box
        Utils.typeText(_searchBoxField,productName);

        //Click on Search Button
        Utils.clickOnElement(_searchButtonField);
    }

    public void clickOnBusinessCardLink(){
        //Click on Business Cards link on home page
        Utils.clickOnElement(_businessCardLink);
    }

    public void navigateToReferAFriend() {
        // Click on refer a Friend link from home page
        Utils.clickOnElement(_referAFriendLink);
    }

}
