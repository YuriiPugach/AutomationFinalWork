package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage extends BasePage {
    public ItemPage(WebDriver driver) {
        super(driver);
    }

    private static class Labels {
        private final static String url = "https://shop.brave.ua/uk/";
    }

}
