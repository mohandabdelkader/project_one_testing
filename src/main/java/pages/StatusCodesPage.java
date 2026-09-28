package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodesPage {
    WebDriver driver;

    public StatusCodesPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private final By statusCode200Link = By.linkText("200");
    private final By statusCode301Link = By.linkText("301");
    private final By statusCode404Link = By.linkText("404");
    private final By statusCode500Link = By.linkText("500");

    //Actions
    public StatusCodeResultPage clickOnStatusCode(String code) {
        driver.findElement(By.linkText(code)).click();
        return new StatusCodeResultPage(driver);
    }
}
