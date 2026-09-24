package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPageOne {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public DynamicLoadingPageOne(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    private final By startBtn = By.cssSelector("#start > button");
    private final By validationMessage = By.cssSelector("#finish > h4");

    // Actions
    public void clickOnStartBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(startBtn)).click();
    }

    public String getValidationMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(validationMessage)).getText();
    }
}