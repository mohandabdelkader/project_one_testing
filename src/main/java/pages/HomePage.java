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
    private final By dropDownListLink = By.linkText("Dropdown");
    private final By statusCodeLink = By.linkText("Status Codes");
    private final By javascriptAlertsLink = By.cssSelector("a[href='/javascript_alerts']");
    private final By iframeLink = By.linkText("WYSIWYG Editor");
    private final By horizontalSliderLink = By.linkText("Horizontal Slider");
    private final By inputsLink = By.linkText("Inputs");
    private final By fileUploadLink = By.linkText("File Upload");

    // Action

    // Helper Method
    private void clickOnLink(By locator) {
        driver.findElement(locator).click();
    }

    public LoginPage clickOnFormAuthLink() {
        clickOnLink(formAuthLink);
        return new LoginPage(driver);
    }

    public ForgetPasswordPage clickOnForgetPasswordLink() {
        clickOnLink(forgetPasswordLink);
        return new ForgetPasswordPage(driver);
    }

    public CheckBoxesPage clickOnCheckBoxesLink() {
        clickOnLink(checkBoxesLink);
        return new CheckBoxesPage(driver);
    }

    public DynamicLoadingPage clickOnDynamicLoadingLink() {
        clickOnLink(dynamicLoadingLink);
        return new DynamicLoadingPage(driver);
    }

    public DropDownPage clickOnDropDownLink() {
        clickOnLink(dropDownListLink);
        return new DropDownPage(driver);
    }

    public StatusCodesPage clickOnStatusCodeLink() {
        clickOnLink(statusCodeLink);
        return new StatusCodesPage(driver);
    }

    public AlertJSPage clickOnAlertJsLink() {
        clickOnLink(javascriptAlertsLink);
        return new AlertJSPage(driver);
    }

    public IframePage clickOnIframeLink() {
        clickOnLink(iframeLink);
        return new IframePage(driver);
    }

    public HorizontalSliderPage clickOnHorizontalSliderLink() {
        clickOnLink(horizontalSliderLink);
        return new HorizontalSliderPage(driver);
    }

    public InputsPage clickOnInputsLink() {
        clickOnLink(inputsLink);
        return new InputsPage(driver);
    }

    public UploadFilePage clickOnFileUploadLink() {
        clickOnLink(fileUploadLink);
        return new UploadFilePage(driver);
    }

}
