package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxesPage {
    WebDriver driver;
    public CheckBoxesPage(WebDriver driver) {
        this.driver=driver;
    }
    // Locators
    private final By checkBoxOne=By.xpath("//input[@type=\"checkbox\"][1]");
    private final By checkBoxTwo=By.xpath("//input[@type=\"checkbox\"][2]");
    //Actions
    public void clickOnCheckBoxOne(){
        driver.findElement(checkBoxOne).click();
    }  public void clickOnCheckBoxTwo(){
        driver.findElement(checkBoxTwo).click();
    }
    public boolean isCheckBoxOneSelected() {
        return driver.findElement(checkBoxOne).isSelected();
    }

    public boolean isCheckBoxTwoSelected() {
        return driver.findElement(checkBoxTwo).isSelected();
    }
}
