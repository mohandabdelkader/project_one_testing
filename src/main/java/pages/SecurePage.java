package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage {
    WebDriver driver;
    public SecurePage(WebDriver driver) {
        this.driver=driver;
    }
    // locators
    private final By validMessage=By.cssSelector("#flash");
    //Actions
    public String getValidationMessage(){
        return driver.findElement(validMessage).getText();
    }
}
