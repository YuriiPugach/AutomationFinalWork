package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
    private final WebDriver driver;
    private final WaitersClass waiters;
    private final ElementsClass elements;
    private final Actions actions;

    public ActionClass(WebDriver driver){
        this.driver = driver;
        waiters = new WaitersClass(driver);
        elements = new ElementsClass(driver);
        actions = new Actions(driver);
    }

    public void dragNdrop(By source, By target){
        actions.dragAndDrop(elements.findElement(source), elements.findElement(target)).perform();
    }
}
