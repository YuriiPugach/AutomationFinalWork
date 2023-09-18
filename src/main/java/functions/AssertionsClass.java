package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AssertionsClass {
    private final WebDriver driver;
    private final WaitersClass waiters;
    private final ElementsClass elements;
    private final ActionClass actions;

    public AssertionsClass(WebDriver driver) {
        this.driver = driver;
        waiters = new WaitersClass(driver);
        elements = new ElementsClass(driver);
        actions = new ActionClass(driver);
    }

    public void equalsOfInt(int actual, int expected) {
        Assert.assertEquals(actual, expected,
                "Я ожидал получить число " + expected + ". А получил число " + actual + ".");
    }
    public void equalsOfButtons(String actual, String expected){
        Assert.assertEquals(actual,expected, "Я ожидал получить название кнопки " + expected + ". А получил название " + actual + "." );
    }
    public void equalsPageTitle(String actual, String expected){
        Assert.assertEquals(actual,expected, "Я ожидал получить название страницы " + expected + ". А получил название " + actual + ".");
    }
    public void equalsNumberOfElementsOnTheMainPage(int actual, int expected){
        Assert.assertEquals(actual,expected, "Я ожидал получить количество елементов " + expected + ". А получил количество " + actual + ".");
    }

    public void isDisplayed(By by){
        Assert.assertTrue(elements.findElement(by).isDisplayed());
    }
}
