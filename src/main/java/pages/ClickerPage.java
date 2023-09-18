package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickerPage extends BasePage {
    public ClickerPage(WebDriver driver) {
        super(driver);
    }

    private static class Labels {
        private final static String url = "https://www.clickspeedtester.com/click-counter/";
    }

    private static class Locators {
        private final static By cookiesButton = By.cssSelector(".fc-cta-consent");
        private final static By frameLocator = By.xpath("//iframe[@src='https://www.clickspeedtester.com/online-click-counter/']");
        private final static By plusButton = By.id("plus-btn");
        private final static By counterField = By.xpath("//div[@id='counter']/span");
    }

    public void acceptCookies() {
        BasePage.acceptCookies(Locators.cookiesButton);
    }

    public void switchToFrameWithClicker() {
        wait.switchToFrame(Locators.frameLocator);
    }

    public void clickOnPlusButton(int countOfclick) {
        for (int i = 0; i < countOfclick; i++) {
            elements.clickOnElement(Locators.plusButton);
        }
    }

    public void openPage() {
        driver.get(Labels.url);
    }

    public void assertCountOfClicks(int actual, int expected){
        assertions.equalsOfInt(actual, expected);
    }

    public int getCountOfClickFromField(){
        return Integer.parseInt(elements.getTextOnElement(Locators.counterField));
    }
}
