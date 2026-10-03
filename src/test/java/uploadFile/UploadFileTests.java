package uploadFile;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UploadFilePage;

public class UploadFileTests extends Base {
    @Test
    public void testFileUpload() {
        String relativePath = "src/files/images.jfif";
        UploadFilePage uploadFilePage = homePage.clickOnFileUploadLink();
        uploadFilePage.uploadFile(relativePath);
        // Assert
        String actualResult = uploadFilePage.getValidationMessage();
        String expectedResult = "images.jfif";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
