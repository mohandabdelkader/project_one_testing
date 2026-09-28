package dropDownList;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;

public class DropDownListTests extends Base {
    @Test
    public void testDropDownList(){
        DropDownPage dropDownPage=homePage.clickOnDropDownLink();
        dropDownPage.selectOnDropDown("Option 1");
        // Assert
        String actualResult=dropDownPage.getSelectOption();
        String expectedResult="Option 1";
        Assert.assertEquals(actualResult,expectedResult,"actualResult not Match ExpectedResult");
    }


}
