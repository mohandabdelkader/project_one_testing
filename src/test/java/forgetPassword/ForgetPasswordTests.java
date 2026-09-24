package forgetPassword;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.ForgetPasswordPage;

public class ForgetPasswordTests extends Base {
    @Test
public void forgetPasswordTest(){
        ForgetPasswordPage forgetPasswordPage=homePage.clickOnForgetPasswordLink();
        forgetPasswordPage.insertEmail("ahmed@gmail.com");
        forgetPasswordPage.clickOnRetrievePasswordBtn();
        //Assert
        String actualResult=forgetPasswordPage.getValidationMessage();
        String expectedResult="Internal Server Error";
        Assert.assertTrue(actualResult.contains(expectedResult));
}

}
