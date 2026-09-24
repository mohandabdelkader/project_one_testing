package wait;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import pages.DynamicLoadingPageOne;

public class DynamicLoadingTests extends Base {
    @Test
    public void testDynamicLoading() {
        DynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynamicLoadingLink();
        DynamicLoadingPageOne dynamicLoadingPageOne = dynamicLoadingPage.clickOnElementOneLink();
        dynamicLoadingPageOne.clickOnStartBtn();
        //Assert
        String actualResult = dynamicLoadingPageOne.getValidationMessage();
        String expectedResult = "Hello World!";
        Assert.assertEquals(actualResult, expectedResult, "Validation message text does not match!");

    }
}
