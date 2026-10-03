package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InputsPage {
    WebDriver driver;
    WebDriverWait wait;

    public InputsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    private final By numberInput = By.xpath("//input[@type=\"number\"]");

    //Actions
    public void insertNumber(String number) {
        var inputElement = wait.until(ExpectedConditions.elementToBeClickable(numberInput));
        inputElement.clear();
        inputElement.sendKeys(number);
    }

    public void incrementNumber(int steps) {
        var inputElement = wait.until(ExpectedConditions.elementToBeClickable(numberInput));
        inputElement.click();
        for (int i = 0; i < steps; i++) {
            inputElement.sendKeys(Keys.ARROW_UP);
        }

    }

    public void decrementNumber(int steps) {
        var inputElement = wait.until(ExpectedConditions.elementToBeClickable(numberInput));
        for (int i = 0; i < steps; i++) {
            inputElement.sendKeys(Keys.ARROW_DOWN);
        }
    }

    public String getInputValue() {
        return driver.findElement(numberInput).getAttribute("value");
    }
}
