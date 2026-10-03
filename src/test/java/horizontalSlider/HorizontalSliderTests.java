package horizontalSlider;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class HorizontalSliderTests extends Base {

    @Test
    public void testSliderToFour() {
        String expectedValue = "4";

        HorizontalSliderPage sliderPage = homePage.clickOnHorizontalSliderLink();
        sliderPage.setSliderValue(expectedValue);
        String actualValue = sliderPage.getRangeValue();
        Assert.assertEquals(actualValue, expectedValue, "The slider value does not match the expected target!");
    }
}