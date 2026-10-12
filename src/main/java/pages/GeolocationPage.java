package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GeolocationPage {
    WebDriverWait wait;
    WebDriver driver;

    public GeolocationPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    private final By locationBtn = By.xpath("// button[@ onclick=\"getLocation()\"]");

    // Actions
    public void clickOnLocationBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(locationBtn)).click();
    }
}
