package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HoversPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public HoversPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    private By figureAvatars = By.className("figure");
    private By captionText = By.className("figcaption");

    public void hoverOverFigureByIndex(int index) {
        List<WebElement> figures = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(figureAvatars));
        WebElement targetFigure = figures.get(index);

        Actions actions = new Actions(driver);
        actions.moveToElement(targetFigure).perform();
    }


    public String getCaptionTextByIndex(int index) {
        List<WebElement> captions = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(captionText));
        return captions.get(index).getText();
    }
}