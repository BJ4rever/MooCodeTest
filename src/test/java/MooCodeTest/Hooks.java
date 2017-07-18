package MooCodeTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.testng.ITestResult;


import java.util.concurrent.TimeUnit;

/**
 * Created by Gamita on 04/07/2017.
 */
public class Hooks extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void openBrowser(){
        browserSelector.selectBrowser();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void closeBrowser(){

        driver.quit();

    }
}
