package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementsClass {
    private final WebDriver driver;
    private final WaitersClass waiters;

    public ElementsClass(WebDriver driver) {
        this.driver = driver;
        waiters = new WaitersClass(driver);
    }

    public WebElement findElement(By by) {
        try {
            waiters.waitForVisabilityOfElement(by);
            return driver.findElement(by);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<WebElement> findElements(By by) {
        try {
            waiters.waitForVisabilityOfElement(by);
            return driver.findElements(by);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void clickOnElement(By by){
        findElement(by).click();
    }

    public String getTextOnElement(By by){
        return findElement(by).getText();
    }

    public int countElements (By by) {
         List<WebElement> numberOfElements = findElements(by);
        int numberOfElement;
        return numberOfElement = numberOfElements.size();
    }
}
