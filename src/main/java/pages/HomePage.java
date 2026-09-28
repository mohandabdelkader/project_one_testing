package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // locators
    private final By formAuthLink = By.xpath("//a[@href=\"/login\"]");
    private final By forgetPasswordLink = By.linkText("Forgot Password");
    private final By checkBoxesLink = By.linkText("Checkboxes");
    private final By dynamicLoadingLink = By.partialLinkText("Loading");
    private final By dropDownListLink=By.linkText("Dropdown");

    // Action
    public LoginPage clickOnFormAuthLink() {
        driver.findElement(formAuthLink).click();
        return new LoginPage(driver);
    }

    public ForgetPasswordPage clickOnForgetPasswordLink() {
        driver.findElement(forgetPasswordLink).click();
        return new ForgetPasswordPage(driver);
    }

    public CheckBoxesPage clickOnCheckBoxesLink() {
        driver.findElement(checkBoxesLink).click();
        return new CheckBoxesPage(driver);
    }

    public DynamicLoadingPage clickOnDynamicLoadingLink() {
        driver.findElement(dynamicLoadingLink).click();
        return new DynamicLoadingPage(driver);
    }
    public DropDownPage clickOnDropDownLink(){
        driver.findElement(dropDownListLink).click();
        return new DropDownPage(driver);
    }
}
