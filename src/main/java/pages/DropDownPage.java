package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
    Select select;
    WebDriver driver;

    public DropDownPage(WebDriver driver) {
        this.driver = driver;

    }

    // Locators
    private final By dropdown = By.id("dropdown");

    //Actions

// Helper Method
    private Select findSelectElement() {
        return select = new Select(driver.findElement(dropdown));
    }

    public void selectOnDropDown(String visibleText) {
        findSelectElement().selectByVisibleText(visibleText);

    }

    public String getSelectOption() {
        return findSelectElement().getFirstSelectedOption().getText();
    }


}
