package jsAlert;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertJSPage;

public class JsAlertTests extends Base {
    @Test
    public void testJSPrompt() {
        AlertJSPage alertPage = homePage.clickOnAlertJsLink();
        alertPage.clickJsPromptBtn();
        alertPage.sendTextToAlert("hello testing");

        //Assert
        String actualResult = alertPage.getValidationMessage();
        Assert.assertEquals(actualResult, "You entered: hello testing");
    }
}
