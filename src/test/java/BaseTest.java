import driver.DriverFactory;
import functions.ActionClass;
import functions.AssertionsClass;
import functions.ElementsClass;
import functions.WaitersClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import pages.*;
import utils.TestResultListeners;

@Listeners(TestResultListeners.class)
public class BaseTest {
    protected WebDriver driver = DriverFactory.startChromeDriver();

    protected ActionClass action = new ActionClass(driver);
    protected AssertionsClass assertions = new AssertionsClass(driver);
    protected ElementsClass elements = new ElementsClass(driver);
    protected WaitersClass waiters = new WaitersClass(driver);

    protected BasePage basePage = new BasePage(driver);
    protected ClickerPage clickerPage = new ClickerPage(driver);
    protected DragNDropPage dragNDropPage = new DragNDropPage(driver);
    protected MainPage mainPage = new MainPage(driver);
    protected ItemPage itemPage = new ItemPage(driver);

    @AfterSuite
    public void closeDriver(){
        driver.quit();
    }

    @BeforeSuite

    public void startDriver(){
        driver = DriverFactory.startChromeDriver();
    }

}
