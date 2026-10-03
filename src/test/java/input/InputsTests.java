package input;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InputsPage;

public class InputsTests extends Base {
    private InputsPage inputsPage;

    @Test
    public void testInputs() throws InterruptedException {
        InputsPage inputsPage = homePage.clickOnInputsLink();
        String inputNumber = "40";

        inputsPage.insertNumber(inputNumber);
        inputsPage.incrementNumber(2);
        String actualValue = inputsPage.getInputValue();
        Assert.assertEquals(actualValue, "42", "The input value after increment does not match!");
    }

}
