package MooCodeTest;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MyStepdefs extends BasePage {

    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();
    ReferAFriend referAFriend = new ReferAFriend();


    @Given("^User is on Moo home page$")
    public void userIsOnMooHomePage() {
        homePage.userIsOnHomePage();
    }

    @When("^User search for valid product as \"([^\"]*)\"on search box$")
    public void userSearchForValidProductAsOnSearchBox(String product) {
        homePage.searchProduct(product);
    }

    @Then("^User should able to view all related products as \"([^\"]*)\" in a search result successfully$")
    public void userShouldAbleToViewAllRelatedProductsAsInASearchResultSuccessfully(String product) {
        searchPage.verifyValidSearchResult(product);
    }

    @When("^User search for invalid product as \"([^\"]*)\"on search box$")
    public void userSearchForInvalidProductAsOnSearchBox(String product) {
        homePage.searchProduct(product);
    }

    @Then("^User should see meaningful message with no product displayed$")
    public void userShouldSeeMeaningfulMessageWithNoProductDisplayed() {
        searchPage.verifyInvalidSearchResult();
    }

    @When("^User navigate to Refer a Friend$")
    public void userNavigateToReferAFriend() {
        homePage.navigateToReferAFriend();
    }

    @And("^User enters all required details$")
    public void userEntersAllRequiredDetails() {
        referAFriend.enterRequiredDetails();
    }

    @Then("^User should able to successfully send a email to a friend$")
    public void userShouldAbleToSuccessfullySendAEmailToAFriend() {
        referAFriend.verifyEmailHasBeenSentSuccessfullly();
    }

    @When("^User clicks on Business Cards$")
    public void userClicksOnBusinessCards() {
        homePage.clickOnBusinessCardLink();
    }

    @Then("^User should able to successfully navigate to Business Cards page$")
    public void userShouldAbleToSuccessfullyNavigateToBusinessCardsPage() {
        Utils.assertTrueByContainsString("business-cards");
        //Assert.assertTrue(driver.getCurrentUrl().contains("business-cards"),"User not on Business Card page");
    }
}
