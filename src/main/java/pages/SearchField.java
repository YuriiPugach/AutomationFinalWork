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
        private final static By popUpWindowCloseButton = By.cssSelector(".xIxPTwbq3Ybg19w1GGgL");
        private final static By searachField = By.cssSelector(".XVTi12K1x5WssFNE5gFg");
        private final static By nameOfItemAfterSearch = By.xpath("//div[@class='b-tile-item__info'][1]/a");
        private final static By searchButton = By.cssSelector(".vGV1sm119H7YbusRTE_q");
        private final static By searchCantFindItemText = By.xpath("//h3");
        private final static By typeOfCatalog = By.xpath("//h1");
        private final static By itemIsShownAfterSearchWithOutData = By.xpath("//div[@class='b-main__block']/ul[1]/li[1]");
        }
        public void openPage() {
            driver.get(SearchField.Labels.url);
            driver.manage().deleteAllCookies();
        }

        public void closePopUpWindow() {
            BasePage.closePopUpWindow(SearchField.Locators.popUpWindowCloseButton);
        }

        public void clickOnTheSearchField(){
            elements.clickOnElement(Locators.searachField);
        }
        public void sendKeyToTheSearchField(String text){
            elements.sendKeysToElement(Locators.searachField, text);
        }
        public void clickOnTheSearchButton(){
            elements.clickOnElement(Locators.searchButton);
        }
        public String getTextFromTypeOfCatalog(){
            return elements.getTextOnElement(Locators.typeOfCatalog);
        }
        public String getNameOfSearchedItem(){
            return elements.getTextOnElement(Locators.nameOfItemAfterSearch);
        }
        public String messageWhenSearchCantFindItems(){
            return elements.getTextOnElement(Locators.searchCantFindItemText);
        }
        public void assertCheckSearchedItemName(String actual, String expected){
            assertions.equalsPageTitle(actual,expected);
        }
        public void assertCheckSearchCantFindItems(String actual, String expected){
            assertions.equalsPageTitle(actual,expected);
        }
    public void assertCheckSearchWithOutEnteredText(){
        assertions.isDisplayed(Locators.itemIsShownAfterSearchWithOutData);
    }


}
