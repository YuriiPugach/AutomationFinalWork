import org.testng.annotations.Test;

public class MainPageTests extends BaseTest{
    @Test
    public void checkHeaderButtonsNames() {
        mainPage.openPage();
        mainPage.closePopUpWindow();
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameCatalog(), "Каталог");
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameBraveMerch(), "Brave Merch");
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameCloth(), "Одяг, взуття, аксесуари");
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameHome(), "Для дому");
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameBeauty(), "Краса і здоров'я");
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameForKids(), "Для дітей");
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameSport(), "Спорт");
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameArt(), "Мистецтво");
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameFood(), "Їжа та напої");
    }
    @Test
    public void openedPageFromTheHeaderButton(){
        mainPage.openPage();
        mainPage.closePopUpWindow();
        mainPage.openPageFromTheHeaderButtonBraveMerch();
        mainPage.assertCheckTitlePage(mainPage.getPageTitleBraveMerch(),"MADE WITH BRAVERY");
        mainPage.openPageFromTheHeaderButtonCloth();
        mainPage.assertCheckTitlePage(mainPage.getPageTitleFromPage3to9(),"Одяг, взуття, аксесуари");
        mainPage.openPageFromTheHeaderButtonHome();
        mainPage.assertCheckTitlePage(mainPage.getPageTitleFromPage3to9(),"Для дому");
        mainPage.openPageFromTheHeaderButtonBeauty();
        mainPage.assertCheckTitlePage(mainPage.getPageTitleFromPage3to9(),"Краса і здоров'я");
        mainPage.openPageFromTheHeaderButtonForKids();
        mainPage.assertCheckTitlePage(mainPage.getPageTitleFromPage3to9(),"Для дітей");
        mainPage.openPageFromTheHeaderButtonSport();
        mainPage.assertCheckTitlePage(mainPage.getPageTitleFromPage3to9(),"Спорт і відпочинок");
        mainPage.openPageFromTheHeaderButtonArt();
        mainPage.assertCheckTitlePage(mainPage.getPageTitleFromPage3to9(),"Мистецтво та колекціонування");
        mainPage.openPageFromTheHeaderButtonFood();
        mainPage.assertCheckTitlePage(mainPage.getPageTitleFromPage3to9(),"Їжа та напої");
    }
    @Test
    public void CheckChangesButtonsLanguage() {
        mainPage.openPage();
        mainPage.closePopUpWindow();
        mainPage.changeLanguageToEng();
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameCatalog(), "Catalog");
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameBraveMerch(), "Brave Merch");
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameCloth(), "Clothes & shoes");
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameHome(), "Home");
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameBeauty(), "Beauty");
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameForKids(), "For kids");
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameSport(), "Sport");
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameArt(), "Art");
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameFood(), "Food");
    }
    @Test
    public void CheckNumbersOfItemsOnTheMainPage(){
        mainPage.openPage();
        mainPage.closePopUpWindow();
        mainPage.assertCompareNumberOfItemsOnTheMainPage(mainPage.getNumbersOfItemsOnTheMainPage(), 20);

    }
    @Test
    public void CheckNNumberOfButtonsInTheHeader (){
        mainPage.openPage();
        mainPage.closePopUpWindow();
        mainPage.assertCompareNumberOfButtonsInTheHeader(mainPage.getNumberOfButtonsInTheHeader(), 8);
    }

}
