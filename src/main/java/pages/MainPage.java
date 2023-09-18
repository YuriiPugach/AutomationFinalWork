package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    private static class Labels {
        private final static String url = "https://shop.brave.ua/uk/";
    }

    private static class Locators {
        private final static By headerButtons = By.cssSelector(".qwfqPNbGoqtKVuneeXzX");
        private final static By popUpWindowCloseButton = By.cssSelector(".xIxPTwbq3Ybg19w1GGgL");
        private final static By headerButtonCatalog = By.cssSelector(".qZ9yxGUXpFMxAfv7nWsx");
        private final static By headerButtonBraveMerch = By.xpath("//div[@class='qwfqPNbGoqtKVuneeXzX _7mqI3tE0eGEqW1Xh4_Nw']/a[1]");
        private final static By headerButtonCloth = By.xpath("//div[@class='qwfqPNbGoqtKVuneeXzX _7mqI3tE0eGEqW1Xh4_Nw']/a[2]");
        private final static By headerButtonHome = By.xpath("//div[@class='qwfqPNbGoqtKVuneeXzX _7mqI3tE0eGEqW1Xh4_Nw']/a[3]");
        private final static By headerButtonBeauty = By.xpath("//div[@class='qwfqPNbGoqtKVuneeXzX _7mqI3tE0eGEqW1Xh4_Nw']/a[4]");
        private final static By headerButtonForKids = By.xpath("//div[@class='qwfqPNbGoqtKVuneeXzX _7mqI3tE0eGEqW1Xh4_Nw']/a[5]");
        private final static By headerButtonSport = By.xpath("//div[@class='qwfqPNbGoqtKVuneeXzX _7mqI3tE0eGEqW1Xh4_Nw']/a[6]");
        private final static By headerButtonArt = By.xpath("//div[@class='qwfqPNbGoqtKVuneeXzX _7mqI3tE0eGEqW1Xh4_Nw']/a[7]");
        private final static By headerButtonFood = By.xpath("//div[@class='qwfqPNbGoqtKVuneeXzX _7mqI3tE0eGEqW1Xh4_Nw']/a[8]");
        private final static By titleOfTheOpenedPageBraveMerch = By.xpath("//h2/span");
        private final static By titleOfTheOpenedPageFrom3To9 = By.xpath("//h1");
        private final static By changeLanguageToEngButton  = By.xpath("//section[2]/div/form");
        private final static By itemsOnTheMainPage = By.cssSelector(".b-tile-item");
        private final static By buttonInTheHeader = By.cssSelector(".rJeIDPixQD5jhGnvLD4w.rktKyw1UwOt1CeBHTbS7.LipINVGp9LVIiXcxxJau");
    }

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(MainPage.Labels.url);
    }

    public void closePopUpWindow() {
        BasePage.closePopUpWindow(Locators.popUpWindowCloseButton);
    }

    public String getButtonName1() {
        return elements.getTextOnElement(Locators.headerButtonCatalog);
    }

    public String getButtonName2() {
        return elements.getTextOnElement(Locators.headerButtonBraveMerch);
    }

    public String getButtonName3() {
        return elements.getTextOnElement(Locators.headerButtonCloth);
    }

    public String getButtonName4() {
        return elements.getTextOnElement(Locators.headerButtonHome);
    }

    public String getButtonName5() {
        return elements.getTextOnElement(Locators.headerButtonBeauty);
    }

    public String getButtonName6() {
        return elements.getTextOnElement(Locators.headerButtonForKids);
    }

    public String getButtonName7() {
        return elements.getTextOnElement(Locators.headerButtonSport);
    }

    public String getButtonName8() {
        return elements.getTextOnElement(Locators.headerButtonArt);
    }

    public String getButtonName9() {
        return elements.getTextOnElement(Locators.headerButtonFood);
    }

    public void openPageFromTheHeaderButton2() {
        elements.clickOnElement(Locators.headerButtonBraveMerch);
    }

    public void openPageFromTheHeaderButton3() {
        elements.clickOnElement(Locators.headerButtonCloth);
    }

    public void openPageFromTheHeaderButton4() {
        elements.clickOnElement(Locators.headerButtonHome);
    }

    public void openPageFromTheHeaderButton5() {
        elements.clickOnElement(Locators.headerButtonBeauty);
    }

    public void openPageFromTheHeaderButton6() {
        elements.clickOnElement(Locators.headerButtonForKids);
    }

    public void openPageFromTheHeaderButton7() {
        elements.clickOnElement(Locators.headerButtonSport);
    }

    public void openPageFromTheHeaderButton8() {
        elements.clickOnElement(Locators.headerButtonArt);
    }

    public void openPageFromTheHeaderButton9() {
        elements.clickOnElement(Locators.headerButtonFood);
    }
    public void changeLanguageToEng(){
        elements.clickOnElement(Locators.changeLanguageToEngButton);
    }

    public void assertCompareButtonsNames(String actual, String expected) {
        assertions.equalsOfButtons(actual, expected);
    }

    public void assertCheckTitlePage(String actual, String expected) {
        assertions.equalsPageTitle(actual, expected);
    }

    public void assertCompareNumberOfItemsOnTheMainPage (int actual, int expected){
        assertions.equalsNumberOfElementsOnTheMainPage(actual, expected);
    }

    public void assertCompareNumberOfButtonsInTheHeader (int actual, int expected){
        assertions.equalsNumberOfElementsOnTheMainPage(actual, expected);
    }

    public int getNumbersOfItemsOnTheMainPage(){
       return elements.countElements(Locators.itemsOnTheMainPage);
    }

    public int getNumberOfButtonsInTheHeader(){
        return elements.countElements(Locators.buttonInTheHeader);
    }

    public String getPageTitleBraveMerch(){
        return elements.getTextOnElement(Locators.titleOfTheOpenedPageBraveMerch);
    }
    public String getPageTitleFromPage3to9(){
        return elements.getTextOnElement(Locators.titleOfTheOpenedPageFrom3To9);
    }



}
