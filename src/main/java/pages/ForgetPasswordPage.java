package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ForgetPasswordPage {
    WebDriver driver;
    public ForgetPasswordPage(WebDriver driver) {
        this.driver=driver;
    }

    // locators
    private final By emailInput=By.cssSelector("#email");
    private final By retrievePasswordBtn=By.xpath("//button[@type=\"submit\"]");
    private final By validationMessage=By.tagName("h1");
    // Actions
    public void insertEmail(String email){
        driver.findElement(emailInput).sendKeys(email);
    }
    public void clickOnRetrievePasswordBtn(){
        driver.findElement(retrievePasswordBtn).click();
    }
    public String getValidationMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(validationMessage)).getText();
    }
}
