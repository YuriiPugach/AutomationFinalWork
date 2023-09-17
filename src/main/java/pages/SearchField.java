package pages;

import org.openqa.selenium.WebDriver;

public class SearchField extends BasePage {
    public SearchField(WebDriver driver) {
        super(driver);
    }
    private static class Labels {
        private final static String url = "https://shop.brave.ua/uk/";
    }
}
