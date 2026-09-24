package checkBoxes;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckBoxesPage;

public class CheckBoxesTests extends Base {


    @Test(priority = 1, description = "Verify Checkbox 1 can be selected")
    public void testSelectCheckBoxOne() {
        CheckBoxesPage checkBoxesPage = homePage.clickOnCheckBoxesLink();

        if (!checkBoxesPage.isCheckBoxOneSelected()) {
            checkBoxesPage.clickOnCheckBoxOne();
        }

        Assert.assertTrue(checkBoxesPage.isCheckBoxOneSelected(), "Checkbox 1 should be selected!");
    }
    @Test(priority = 2, description = "Verify Checkbox 2 can be unselected")
    public void testUnselectCheckBoxTwo() {
        CheckBoxesPage checkBoxesPage = homePage.clickOnCheckBoxesLink();

        if (checkBoxesPage.isCheckBoxTwoSelected()) {
            checkBoxesPage.clickOnCheckBoxTwo();
        }

        Assert.assertFalse(checkBoxesPage.isCheckBoxTwoSelected(), "Checkbox 2 should be unselected!");
    }
}
