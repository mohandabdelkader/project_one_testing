package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HorizontalSliderPage {
    WebDriver driver;
    WebDriverWait wait;

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    private final By slideContainer = By.xpath("//input[@type='range']");
    private final By rangeValue = By.id("range");

    // Actions
    public void setSliderValue(String targetValue) {
        var slider = wait.until(ExpectedConditions.elementToBeClickable(slideContainer));

        double target = Double.parseDouble(targetValue);
        while (!getRangeValue().equals(targetValue)) {
            double current = Double.parseDouble(getRangeValue());

            if (current < target) {
                slider.sendKeys(Keys.ARROW_RIGHT);
            } else if (current > target) {
                slider.sendKeys(Keys.ARROW_LEFT);
            }
        }
    }

    public String getRangeValue() {
        return driver.findElement(rangeValue).getText();
    }
}