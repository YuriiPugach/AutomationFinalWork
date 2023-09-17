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
        private final static By headerButton1 = By.cssSelector(".qZ9yxGUXpFMxAfv7nWsx");
        private final static By headerButton2 = By.xpath("//div[@class='qwfqPNbGoqtKVuneeXzX _7mqI3tE0eGEqW1Xh4_Nw']/a[1]");
        private final static By headerButton3 = By.xpath("//div[@class='qwfqPNbGoqtKVuneeXzX _7mqI3tE0eGEqW1Xh4_Nw']/a[2]");
        private final static By headerButton4 = By.xpath("//div[@class='qwfqPNbGoqtKVuneeXzX _7mqI3tE0eGEqW1Xh4_Nw']/a[3]");
        private final static By headerButton5 = By.xpath("//div[@class='qwfqPNbGoqtKVuneeXzX _7mqI3tE0eGEqW1Xh4_Nw']/a[4]");
        private final static By headerButton6 = By.xpath("//div[@class='qwfqPNbGoqtKVuneeXzX _7mqI3tE0eGEqW1Xh4_Nw']/a[5]");
        private final static By headerButton7 = By.xpath("//div[@class='qwfqPNbGoqtKVuneeXzX _7mqI3tE0eGEqW1Xh4_Nw']/a[6]");
        private final static By headerButton8 = By.xpath("//div[@class='qwfqPNbGoqtKVuneeXzX _7mqI3tE0eGEqW1Xh4_Nw']/a[7]");
        private final static By headerButton9 = By.xpath("//div[@class='qwfqPNbGoqtKVuneeXzX _7mqI3tE0eGEqW1Xh4_Nw']/a[8]");
        private final static By titleOfTheOpenedPageBraveMerch = By.xpath("//h2/span");
        private final static By titleOfTheOpenedPageFrom3To9 = By.xpath("//h1");
        private final static By changeLanguageToEngButton  = By.xpath("//section[2]/div/form");
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
        return elements.getTextOnElemnt(Locators.headerButton1);
    }

    public String getButtonName2() {
        return elements.getTextOnElemnt(Locators.headerButton2);
    }

    public String getButtonName3() {
        return elements.getTextOnElemnt(Locators.headerButton3);
    }

    public String getButtonName4() {
        return elements.getTextOnElemnt(Locators.headerButton4);
    }

    public String getButtonName5() {
        return elements.getTextOnElemnt(Locators.headerButton5);
    }

    public String getButtonName6() {
        return elements.getTextOnElemnt(Locators.headerButton6);
    }

    public String getButtonName7() {
        return elements.getTextOnElemnt(Locators.headerButton7);
    }

    public String getButtonName8() {
        return elements.getTextOnElemnt(Locators.headerButton8);
    }

    public String getButtonName9() {
        return elements.getTextOnElemnt(Locators.headerButton9);
    }

    public void openPageFromTheHeaderButton2() {
        elements.clickOnElement(Locators.headerButton2);
    }

    public void openPageFromTheHeaderButton3() {
        elements.clickOnElement(Locators.headerButton3);
    }

    public void openPageFromTheHeaderButton4() {
        elements.clickOnElement(Locators.headerButton4);
    }

    public void openPageFromTheHeaderButton5() {
        elements.clickOnElement(Locators.headerButton5);
    }

    public void openPageFromTheHeaderButton6() {
        elements.clickOnElement(Locators.headerButton6);
    }

    public void openPageFromTheHeaderButton7() {
        elements.clickOnElement(Locators.headerButton7);
    }

    public void openPageFromTheHeaderButton8() {
        elements.clickOnElement(Locators.headerButton8);
    }

    public void openPageFromTheHeaderButton9() {
        elements.clickOnElement(Locators.headerButton9);
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
    public String getPageTitleBraveMerch(){
        return elements.getTextOnElemnt(Locators.titleOfTheOpenedPageBraveMerch);
    }
    public String getPageTitleFromPage3to9(){
        return elements.getTextOnElemnt(Locators.titleOfTheOpenedPageFrom3To9);
    }



}
