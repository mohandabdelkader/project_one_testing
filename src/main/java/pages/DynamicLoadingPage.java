package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    WebDriver driver;

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private final By elementOneLink = By.xpath("//a[@href=\"/dynamic_loading/1\"]");

    // Actions
    public DynamicLoadingPageOne clickOnElementOneLink() {
        driver.findElement(elementOneLink).click();
        return new DynamicLoadingPageOne(driver);
    }

}
