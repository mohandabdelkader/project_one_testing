package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StatusCodeResultPage {
    WebDriver driver;
    WebDriverWait wait;

    public StatusCodeResultPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    private final By validationMessage = By.cssSelector(".example>p");
    private final By backLink = By.linkText("here");

    // Actions
    public String getValidationMessage() {

        return wait.until(ExpectedConditions.visibilityOfElementLocated(validationMessage)).getText();

    }

    public StatusCodesPage clickOnBackLink() {
        driver.findElement(backLink).click();
        return new StatusCodesPage(driver);
    }
}
