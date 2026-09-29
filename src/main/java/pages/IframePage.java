package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IframePage {
    WebDriver driver;
    WebDriverWait wait;

    public IframePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    private final String iframeId = "mce_0_ifr";
    private final By increaseIndentBtn = By.cssSelector("button[title='Increase indent']");
    private final By textArea = By.cssSelector("#tinymce > p");

    // Actions


    public void switchToFrame() {
        driver.switchTo().frame(iframeId);
    }


    public void switchToParent() {
        driver.switchTo().parentFrame();
    }

    public void setIframeText(String text) {
        switchToFrame();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(textArea, "Your content goes here."));
        driver.findElement(textArea).clear();
        driver.findElement(textArea).sendKeys(text);
        switchToParent();
    }

    public String getIframeText() {
        switchToFrame();
        String text = driver.findElement(textArea).getText();
        switchToParent();
        return text;
    }

    public void clickIncreaseIndent() {
        driver.findElement(increaseIndentBtn).click();
    }
}