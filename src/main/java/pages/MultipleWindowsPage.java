package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class MultipleWindowsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private String parentWindow;


    public MultipleWindowsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    private final By clickHereLink = By.linkText("Click Here");
    private final By newWindowHeader = By.tagName("h3");

    // Actions
    public void clickOnClickHereLink() {
        wait.until(ExpectedConditions.elementToBeClickable(clickHereLink)).click();
    }

    public void switchNewTab() {
        parentWindow = driver.getWindowHandle();// "1"
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> allWindow = driver.getWindowHandles(); // "1" "2" "3"
        for (String window : allWindow) {
            if (window.equals(parentWindow)) {

                continue;
            }
            driver.switchTo().window(window);

            break;

        }

    }


    public String getValidationMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(newWindowHeader)).getText();
    }

    public void closeNewTabAndReturnToParent() {
        driver.close();
        driver.switchTo().window(parentWindow);

    }


}