import org.testng.annotations.Test;

public class SearchFieldTests extends BaseTest {
    @Test
    public void CheckSearchWithNameOfItem(){
        searchField.openPage();
        searchField.closePopUpWindow();
        searchField.sendKeyToTheSearchField("Сімейне срібло з кизилом");
        searchField.clickOnTheSearchButton();
        searchField.assertCheckSearchedItemName(searchField.getNameOfSearchedItem(), "Сімейне срібло з кизилом");
    }
    @Test
    public void CheckSearchWithPartNameOfItem(){
        searchField.openPage();
        searchField.closePopUpWindow();
        searchField.sendKeyToTheSearchField("Сімейне срібло");
        searchField.clickOnTheSearchButton();
        searchField.assertCheckSearchedItemName(searchField.getNameOfSearchedItem(), "Сімейне срібло з кизилом");
    }
    @Test
    public void CheckSearchWithAnotherLanguageItemName(){
        searchField.openPage();
        searchField.closePopUpWindow();
        searchField.sendKeyToTheSearchField("Family silver with dogwood");
        searchField.clickOnTheSearchButton();
        searchField.assertCheckSearchedItemName(searchField.getNameOfSearchedItem(), "Сімейне срібло з кизилом");
    }
    @Test
    public void CheckSearchWithInvalidNameOfItem(){
        searchField.openPage();
        searchField.closePopUpWindow();
        searchField.sendKeyToTheSearchField("input");
        searchField.clickOnTheSearchButton();
        searchField.assertCheckSearchCantFindItems(searchField.messageWhenSearchCantFindItems(), "Такого товару не знайдено на Made With Bravery");
    }
    @Test
    public void CheckSearchWithOutText(){
        searchField.openPage();
        searchField.closePopUpWindow();
        searchField.sendKeyToTheSearchField("Сімейне срібло з кизилом");
        searchField.clickOnTheSearchButton();
        searchField.assertCheckSearchWithOutEnteredText(searchField.getTextFromTypeOfCatalog(), "Каталог");
    }

}
