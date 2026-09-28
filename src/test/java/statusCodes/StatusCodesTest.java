package statusCodes;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.StatusCodeResultPage;
import pages.StatusCodesPage;

public class StatusCodesTest extends Base {
    @Test(priority = 1)
    public void testStatusCode200() {
        StatusCodesPage statusCodesPage = homePage.clickOnStatusCodeLink();
        StatusCodeResultPage statusCodeResultPage = statusCodesPage.clickOnStatusCode("200");
        String actualResult = statusCodeResultPage.getValidationMessage();
        String expectedResult = "This page returned a 200 status code.";
        Assert.assertTrue(actualResult.contains(expectedResult), "actual result not match expected result");

    }

    @Test(priority = 2)
    public void testStatusCode301() {
        StatusCodesPage statusCodesPage = homePage.clickOnStatusCodeLink();
        StatusCodeResultPage statusCodeResultPage = statusCodesPage.clickOnStatusCode("301");
        String actualResult = statusCodeResultPage.getValidationMessage();
        String expectedResult = "This page returned a 301 status code.";
        Assert.assertTrue(actualResult.contains(expectedResult), "actual result not match expected result");
    }

    @Test(priority = 3)
    public void testStatusCode404() {
        StatusCodesPage statusCodesPage = homePage.clickOnStatusCodeLink();
        StatusCodeResultPage statusCodeResultPage = statusCodesPage.clickOnStatusCode("404");
        String actualResult = statusCodeResultPage.getValidationMessage();
        String expectedResult = "This page returned a 404 status code.";
        Assert.assertTrue(actualResult.contains(expectedResult), "actual result not match expected result");
    }

    @Test(priority = 4)
    public void testStatusCode500() {
        StatusCodesPage statusCodesPage = homePage.clickOnStatusCodeLink();
        StatusCodeResultPage statusCodeResultPage = statusCodesPage.clickOnStatusCode("500");
        String actualResult = statusCodeResultPage.getValidationMessage();
        String expectedResult = "This page returned a 500 status code.";
        Assert.assertTrue(actualResult.contains(expectedResult), "actual result not match expected result");
    }


}
