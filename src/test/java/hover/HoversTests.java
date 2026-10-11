package hover;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;

public class HoversTests extends Base {

    @Test
    public void testHoverAllUsersWithLoop() {
        HoversPage hoversPage = homePage.clickOnHoversLink();
        for (int i = 0; i < 3; i++) {
            hoversPage.hoverOverFigureByIndex(i);
            String caption = hoversPage.getCaptionTextByIndex(i);
            int expectedUserNumber = i + 1;
            Assert.assertTrue(caption.contains("user" + expectedUserNumber),
                    "Caption text is not correct for user index: " + i);
        }
    }
}