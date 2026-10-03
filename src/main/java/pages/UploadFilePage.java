package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class UploadFilePage {
    WebDriver driver;
    WebDriverWait wait;

    public UploadFilePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    private final By chooseFileBtn = By.id("file-upload");
    private final By uploadBtn = By.id("file-submit");
    private final By uploadFileMessage = By.id("uploaded-files");

    // Actions
    public String getValidationMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(uploadFileMessage)).getText();
    }

    public void uploadFile(String relativePath) {
        File file = new File(relativePath);
        String absolutePath = file.getAbsolutePath();
        //
        var input = wait.until(ExpectedConditions.presenceOfElementLocated(chooseFileBtn));
        input.sendKeys(absolutePath);
        //
        wait.until(ExpectedConditions.elementToBeClickable(uploadBtn)).click();

    }

}
