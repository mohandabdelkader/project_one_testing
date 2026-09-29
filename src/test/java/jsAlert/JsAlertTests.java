package jsAlert;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertJSPage;

public class JsAlertTests extends Base {
    @Test(priority = 1)
    public void testJSPrompt() {
        AlertJSPage alertPage = homePage.clickOnAlertJsLink();
        alertPage.clickJsPromptBtn();
        alertPage.sendTextToAlert("hello testing");

        //Assert
        String actualResult = alertPage.getValidationMessage();
        Assert.assertEquals(actualResult, "You entered: hello testing");
    }

    @Test(priority = 2)
    public void testCancelJsAlert() {
        AlertJSPage alertJSPage = homePage.clickOnAlertJsLink();
        alertJSPage.clickJsPromptBtn();
        alertJSPage.dismissAlert();
        //Assert
        String actualResult = alertJSPage.getValidationMessage();
        String expectedResult = "You entered: null";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(priority = 3)
    public void testAcceptedJsAlert() {
        AlertJSPage alertJSPage = homePage.clickOnAlertJsLink();
        alertJSPage.clickJsPromptBtn();
        alertJSPage.acceptAlert();
        //Assert
        String actualResult = alertJSPage.getValidationMessage();
        String expectedResult = "You entered:";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
