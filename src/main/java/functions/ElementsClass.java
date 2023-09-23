package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ElementsClass {
    private final WebDriver driver;
    private final WaitersClass waiters;
    static final Logger logger = LoggerFactory.getLogger(ElementsClass.class);

    public ElementsClass(WebDriver driver) {
        this.driver = driver;
        waiters = new WaitersClass(driver);
    }

    public WebElement findElement(By by) {
        try {
//            logger.info("Ожидаю элемент " + by);
            waiters.waitForVisabilityOfElement(by);
            return driver.findElement(by);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<WebElement> findElements(By by) {
        try {
            logger.info("Ищу элемент " + by);
            waiters.waitForVisabilityOfElement(by);
            return driver.findElements(by);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void clickOnElement(By by){
        logger.info("Кликаю на элемент " + by);
        findElement(by).click();
    }

    public String getTextOnElement(By by){
        logger.info("Забираю текст с элемента " + by);
        return findElement(by).getText();
    }

    public void sendKeysToElement(By by, String text){
        logger.info("Ищу элемент для отправки ключа " + by);
        findElement(by).sendKeys(text);}

    public String getPageTitle(By by){
        logger.info("Ищу страницу для взятия тайтла" + by);
        findElement(by);
        return driver.getTitle();
    }

    public int countElements (By by) {
        logger.info("Считаю количество элементов " + by);
         List<WebElement> numberOfElements = findElements(by);
        int numberOfElement;
        return numberOfElement = numberOfElements.size();
    }
}
