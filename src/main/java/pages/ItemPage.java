package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage extends BasePage {
    public ItemPage(WebDriver driver) {
        super(driver);
    }

    private static class Labels {
        private final static String url = "https://shop.brave.ua/";
    }
    private static class Locators {
        private final static By popUpWindowCloseButton = By.cssSelector(".xIxPTwbq3Ybg19w1GGgL");
        private final static By loginInButtonOnTheMainPage = By.cssSelector("._OIGZoZGJV1FRVtcSlSn");
        private final static By emailField = By.xpath("//div[1]/div/input");
        private final static By passwordField = By.xpath("//div[2]/div/input");
        private final static By loginInButtonOnTheLoginPage = By.cssSelector(".vFhB6yaBSu_LOrFZyXUr");
        private final static By firstItemOnTheMainPage = By.xpath("//div[5]/div/ul/li[1]");
        private final static By firstItemNameOnTheMainPage = By.xpath("//li[@class=\"b-catalog__item\"][1]/div/div/div[1]/a");
        private final static By itemNameOnTheItemPage = By.cssSelector(".b-product__title");
        private final static By headerButtonArt = By.xpath("//div[@class='qwfqPNbGoqtKVuneeXzX _7mqI3tE0eGEqW1Xh4_Nw']/a[7]");
        private final static By firstItemOnTheArtPage = By.xpath("//div[@class='b-main__block']/ul[1]/li[1]");
        private final static By addToCartButton = By.xpath("//div[@class='B6MRIaaGm0TVg2S7sLWY']/button[2]");
        private final static By CartButton = By.xpath("//ul[@class='YCoeau7dm5cjXAcypFCA']/li[3]");
        private final static By numberOnTheCartIcon = By.cssSelector(".kaLVbMbN3EMBlafl2u_E");
        private final static By shoppingCartPopUpPage = By.xpath("//h4");
        private final static By shoppingCartPopUpPageDeleteButton = By.cssSelector(".h4LniKGYzSORWScn8x9t svg");
        private final static By emptyCartPage = By.cssSelector(".njvg48st8l9zOEBDwOLm.xHJQJ6q3NPqFn1ioi1kk");
        private final static By closePopUpWindowInTheItemPage = By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/span/div[2]/div/span");
        private final static By userConfigDropUp = By.cssSelector(".gY7k01psbG4v665ujxgw");
        private final static By logOutButtonInUserConfigDropUp = By.xpath("//div[@class='NvJ3GLaOnGKMP4jqptef dAP58z41qP08X8sPZ5qC']/a[4]");
        private final static By closeCartButton = By.cssSelector(".xIxPTwbq3Ybg19w1GGgL");
    }

    public void openPage() {
        driver.get(ItemPage.Labels.url);
    }

    public void closePopUpWindow() {
        BasePage.closePopUpWindow(ItemPage.Locators.popUpWindowCloseButton);
    }
    public void openLoginInPage() {
        elements.clickOnElement(Locators.loginInButtonOnTheMainPage);
    }
    public void clickOnTheLoginInButtonOnTheLoginPage(){
        elements.clickOnElement(Locators.loginInButtonOnTheLoginPage);
    }
    public void clickOnTheArtButtonInTheHeader(){
        elements.clickOnElement(Locators.headerButtonArt);
    }
    public void clickOnTheFirstItemOnTheMainPage(){
        elements.clickOnElement(Locators.firstItemOnTheMainPage);
    }
    public void clickOnTheFirstItemOnTheArtPage(){
        elements.clickOnElement(Locators.firstItemOnTheArtPage);
    }
    public void clickOnTheAddToCartButton(){
        elements.clickOnElement(Locators.addToCartButton);
    }
    public void clickOnTheShoppingCartPopUpPageDeleteButton(){
        elements.clickOnElement(Locators.shoppingCartPopUpPageDeleteButton);
    }
    public void clickToClosePopUpWindowInTheItemPage(){
        elements.clickOnElement(Locators.closePopUpWindowInTheItemPage);
    }
    public void sendKeysToTheEmailField(String text){
        elements.sendKeysToElement(Locators.emailField, text);
    }
    public void sendKeysToThePasswordField(String text){
        elements.sendKeysToElement(Locators.passwordField, text);
    }

    public String getTextFromFirstItemNameOnTheMainPage(){
        return elements.getTextOnElement(Locators.firstItemNameOnTheMainPage);

    }
    public String getTextFromItemNameOnTheItemPage(){
        return elements.getTextOnElement(Locators.itemNameOnTheItemPage);
    }

    public void openCart(){
        elements.clickOnElement(Locators.CartButton);
    }
    public String getTextFromCartIcon(){
       return elements.getTextOnElement(Locators.numberOnTheCartIcon);
    }
    public String getTextFromEmptyCart(){
        return elements.getTextOnElement(Locators.emptyCartPage);
    }

    public String getPageTitle(){
        return elements.getPageTitle(Locators.firstItemNameOnTheMainPage);
    }
    public String getTextFromCartPage(){
        return elements.getTextOnElement(Locators.shoppingCartPopUpPage);
    }
    public void assertCompareNameOfItemOpenedFromMainPage(String actual, String expected){
        assertions.equalsPageTitle(actual,expected);
    }
    public void assertCheckItemIsAddedToTheCart(String actual, String expected){
        assertions.equalsPageTitle(actual,expected);
    }
    public void assertCheckCartIsEmpty(String actual, String expected){
        assertions.equalsPageTitle(actual,expected);
    }
    public void assetCheckPopUpCartPageIsOpened(String actual, String expected){
        assertions.equalsPageTitle(actual,expected);
    }
    public void asserCheckLoginInWhoseSuccessful(String actual, String expected){
        assertions.equalsPageTitle(actual,expected);
    }
    public void openUserConfigDropUp(){
        elements.clickOnElement(Locators.userConfigDropUp);
    }
    public void clickOnLogOutButtonOnTheUserConfigDropUp(){
        elements.clickOnElement(Locators.logOutButtonInUserConfigDropUp);
    }
    public void clickOnTheCLoseCartButton(){
        elements.clickOnElement(Locators.closeCartButton);
    }

    public void assertUserIsLogged(){
        assertions.isDisplayed(Locators.userConfigDropUp);
    }





}
