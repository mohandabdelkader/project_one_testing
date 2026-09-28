package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertJSPage {
    WebDriver driver;
    WebDriverWait wait;

    public AlertJSPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    private final By jsPromptBtn = By.xpath("//button[text()='Click for JS Prompt']");
    private final By validationMessage = By.id("result");

    // Actions
    public void clickJsPromptBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(jsPromptBtn)).click();
    }

    public void sendTextToAlert(String text) {
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();
    }

    public void acceptAlert() {
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    public void dismissAlert() {
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().dismiss();
    }

    public String getValidationMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(validationMessage)).getText();
    }
}
