package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchField extends BasePage {
    public SearchField(WebDriver driver) {
        super(driver);
    }
    private static class Labels {
        private final static String url = "https://shop.brave.ua/uk/";
    }
    private static class Locators {
        private final static By searachField = By.cssSelector(".XVTi12K1x5WssFNE5gFg");
        private final static By nameOfItemAfterSearch = By.xpath("//div[@class='b-tile-item__info'][1]/a");
        private final static By searchButton = By.cssSelector(".vGV1sm119H7YbusRTE_q");
        private final static By searchCantFindItemText = By.xpath("//h3");
        private final static By typeOfCatalog = By.xpath("//h1");
        private final static By openDropUpInTheSearchField = By.xpath("//div[@class=' css-1wy0on6']");

    }
}
