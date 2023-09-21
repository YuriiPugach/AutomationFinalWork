package pages;

import functions.ActionClass;
import functions.AssertionsClass;
import functions.ElementsClass;
import functions.WaitersClass;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected static WebDriver driver;
    static ActionClass action;
    static AssertionsClass assertions;
    static ElementsClass elements;
    static WaitersClass wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        action = new ActionClass(driver);
        assertions = new AssertionsClass(driver);
        elements = new ElementsClass(driver);
        wait = new WaitersClass(driver);
    }


    public static void closePopUpWindow(By by) {
        try {
            wait.waitForVisabilityOfElementAndReturn(by).click();
        } catch (
                Exception e) {
            e.printStackTrace();
        }
    }
}
