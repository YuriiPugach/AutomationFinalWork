import org.testng.annotations.Test;

public class SearchFieldTests extends BaseTest {
    private static class DataForTests {
        private final static String fullNameOfItemForSearch = "Сімейне срібло з кизилом";
        private final static String partNameOfItemForSearch = "Сімейне срібло";
        private final static String engNameOfItemForSearch = "Family silver with dogwood";
        private final static String expectedNameOfItemWhatWasFound = "Сімейне срібло з кизилом";
        private final static String invalidTextForSearch = "input";
        private final static String searchCantFindItemsText = "Такого товару не знайдено на Made With Bravery";
        private final static String emptySearchField = "";
    }
    @Test(priority = 1)
    public void checkSearchWithNameOfItem(){
        searchField.openPage();
        searchField.closePopUpWindow();
        searchField.sendKeyToTheSearchField(DataForTests.fullNameOfItemForSearch);
        searchField.clickOnTheSearchButton();
        searchField.assertCheckSearchedItemName(searchField.getNameOfSearchedItem(), DataForTests.expectedNameOfItemWhatWasFound);
    }
    @Test(priority = 2)
    public void checkSearchWithPartNameOfItem(){
        searchField.openPage();
        searchField.sendKeyToTheSearchField(DataForTests.partNameOfItemForSearch);
        searchField.clickOnTheSearchButton();
        searchField.assertCheckSearchedItemName(searchField.getNameOfSearchedItem(), DataForTests.expectedNameOfItemWhatWasFound);
    }
    @Test(priority = 3)
    public void checkSearchWithAnotherLanguageItemName(){
        searchField.openPage();
        searchField.sendKeyToTheSearchField(DataForTests.engNameOfItemForSearch);
        searchField.clickOnTheSearchButton();
        searchField.assertCheckSearchedItemName(searchField.getNameOfSearchedItem(), DataForTests.expectedNameOfItemWhatWasFound);
    }
    @Test(priority = 4)
    public void checkSearchWithInvalidNameOfItem(){
        searchField.openPage();
        searchField.sendKeyToTheSearchField(DataForTests.invalidTextForSearch);
        searchField.clickOnTheSearchButton();
        searchField.assertCheckSearchCantFindItems(searchField.messageWhenSearchCantFindItems(), DataForTests.searchCantFindItemsText);
    }
    @Test(priority = 5)
    public void checkSearchWithOutText(){
        searchField.openPage();
        searchField.sendKeyToTheSearchField(DataForTests.emptySearchField);
        searchField.clickOnTheSearchButton();
        searchField.assertCheckSearchWithOutEnteredText();
    }

}
