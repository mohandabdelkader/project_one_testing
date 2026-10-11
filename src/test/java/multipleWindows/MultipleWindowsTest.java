package multipleWindows;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MultipleWindowsPage;

public class MultipleWindowsTest extends Base {

    @Test
    public void testNewTabPage() {
        MultipleWindowsPage multipleWindowsPage = homePage.clickOnMultipleWindows();
        multipleWindowsPage.clickOnClickHereLink();
        multipleWindowsPage.switchNewTab();
// Assert
        String actualResult = multipleWindowsPage.getValidationMessage();
        String expectedResult = "New Window";
        Assert.assertEquals(actualResult, expectedResult, "actual result not match expected result");
        multipleWindowsPage.closeNewTabAndReturnToParent();
    }
}