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
    private static class Locators {
        private final static By loginInButton = By.cssSelector("._OIGZoZGJV1FRVtcSlSn");
        private final static By emailField = By.xpath("//div[1]/div/input");
        private final static By passwordField = By.xpath("//div[2]/div/input");
        private final static By loginInButtonOnTheLoginPage = By.cssSelector(".vFhB6yaBSu_LOrFZyXUr");
        private final static By firstItemOnTheMainPage = By.xpath("//div[5]/div/ul/li[1]");
        private final static By firstItemNameOnTheMainPage = By.xpath("//li[@class=\"b-catalog__item\"][1]/div/div/div[1]/a");
        private final static By ItemNameOnTheItemPage = By.cssSelector(".b-product__title");
        private final static By headerButtonArt = By.xpath("//div[@class='qwfqPNbGoqtKVuneeXzX _7mqI3tE0eGEqW1Xh4_Nw']/a[7]");
        private final static By firstItemOnTheArtPage = By.xpath("//div[@class='b-main__block']/ul[1]/li[1]");
        private final static By addToCartButton = By.xpath("//div[@class='B6MRIaaGm0TVg2S7sLWY']/button[2]");
        private final static By numberOnTheCartIcon = By.xpath("//li[3]/button/span");
        private final static By shoppingCartPopUpPage = By.xpath("//h4/..");
        private final static By shoppingCartPopUpPageDeleteButton = By.cssSelector(".h4LniKGYzSORWScn8x9t svg");
    }
}
