package iframe;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IframePage;

public class IframeTests extends Base {

    @Test
    public void testIframe() {
        IframePage iframePage = homePage.clickOnIframeLink();
        String textToSend = "hello testing";
        iframePage.setIframeText(textToSend);
        iframePage.clickIncreaseIndent();
        String actualResult = iframePage.getIframeText();
        Assert.assertEquals(actualResult, textToSend, "The iframe text does not match!");
    }
}