package MooCodeTest;

import org.openqa.selenium.By;
import org.testng.Assert;


public class ReferAFriend extends Utils {

    private By emailField = By.name("user_email");
    private By emailRecipientField = By.name("recipient_emails");
    private By checkBoxField = By.name("checkbox");
    private By sendEmailButtonField = By.cssSelector("button.extole-submit-button.extole-widget-button");
    private By sendingEmailActionText = By.xpath("//span[contains(.,'Sending')]");


    public void enterRequiredDetails() {
        //Enter user's email address
        Utils.typeText(emailField, "jfsjkfh@gmail.com");

        //Enter Recipient's email address
        Utils.typeText(emailRecipientField, "fcnnsdfv@gmail.com");

        //Click on Agree terms Checkbox
        Utils.clickOnElement(checkBoxField);

        //Click on 'Send email' button
        Utils.clickOnElement(sendEmailButtonField);

    }

    public void verifyEmailHasBeenSentSuccessfullly(){
        Utils.assertTrueByElementDisplayed(sendingEmailActionText);
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(driver.findElement(By.xpath("//button[@class='extole-submit-button extole-widget-button']")).isDisplayed());
    }

}