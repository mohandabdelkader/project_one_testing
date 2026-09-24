package login;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecurePage;

public class LoginTests extends Base {

    @Test(priority = 1)
    public void testValidData() {
        LoginPage loginPage = homePage.clickOnFormAuthLink();
        loginPage.insertUsername("tomsmith");
        loginPage.insertPassword("SuperSecretPassword!");
        SecurePage securePage = loginPage.clickOnLoginBtn();
        // Assert
        String actualResult = securePage.getValidationMessage();
        String expectedResult = "You logged into a secure area!";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(priority = 3)
    public void testUnValidUsername() {
        LoginPage loginPage = homePage.clickOnFormAuthLink();
        loginPage.insertUsername("tomsmith1");
        loginPage.insertPassword("SuperSecretPassword!");
        SecurePage securePage = loginPage.clickOnLoginBtn();

        // Assert
        String actualResult = securePage.getValidationMessage();
        String expectedResult = "Your username is invalid!";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(priority = 2)
    public void testUnValidPassword() {
        LoginPage loginPage = homePage.clickOnFormAuthLink();
        loginPage.insertUsername("tomsmith");
        loginPage.insertPassword("SuperSecretPassword!#");
        SecurePage securePage = loginPage.clickOnLoginBtn();

        // Assert
        String actualResult = securePage.getValidationMessage();
        String expectedResult = "Your password is invalid!";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}