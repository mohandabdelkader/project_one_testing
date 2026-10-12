package geolocation;

import base.Base;
import org.testng.annotations.Test;
import pages.GeolocationPage;

public class GeolocationTests extends Base {
    @Test
    public void testGeolocationAllow() {
        GeolocationPage geolocationPage = homePage.clickOnGeolocationLink();
        geolocationPage.clickOnLocationBtn();
    }


}
