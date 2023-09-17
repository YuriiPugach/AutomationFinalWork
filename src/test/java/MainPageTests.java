import org.testng.annotations.Test;

public class MainPageTests extends BaseTest{
    @Test
    public void checkHeaderButtonsNames() {
        mainPage.openPage();
        mainPage.closePopUpWindow();
        mainPage.assertCompareButtonsNames(mainPage.getButtonName1(), "Каталог");
        mainPage.assertCompareButtonsNames(mainPage.getButtonName2(), "Brave Merch");
        mainPage.assertCompareButtonsNames(mainPage.getButtonName3(), "Одяг, взуття, аксесуари");
        mainPage.assertCompareButtonsNames(mainPage.getButtonName4(), "Для дому");
        mainPage.assertCompareButtonsNames(mainPage.getButtonName5(), "Краса і здоров'я");
        mainPage.assertCompareButtonsNames(mainPage.getButtonName6(), "Для дітей");
        mainPage.assertCompareButtonsNames(mainPage.getButtonName7(), "Спорт");
        mainPage.assertCompareButtonsNames(mainPage.getButtonName8(), "Мистецтво");
        mainPage.assertCompareButtonsNames(mainPage.getButtonName9(), "Їжа та напої");
    }
    @Test
    public void openedPageFromTheHeaderButton(){
        mainPage.openPage();
        mainPage.closePopUpWindow();
        mainPage.openPageFromTheHeaderButton2();
        mainPage.assertCheckTitlePage(mainPage.getPageTitleBraveMerch(),"MADE WITH BRAVERY");
        mainPage.openPageFromTheHeaderButton3();
        mainPage.assertCheckTitlePage(mainPage.getPageTitleFromPage3to9(),"Одяг, взуття, аксесуари");
        mainPage.openPageFromTheHeaderButton4();
        mainPage.assertCheckTitlePage(mainPage.getPageTitleFromPage3to9(),"Для дому");
        mainPage.openPageFromTheHeaderButton5();
        mainPage.assertCheckTitlePage(mainPage.getPageTitleFromPage3to9(),"Краса і здоров'я");
        mainPage.openPageFromTheHeaderButton6();
        mainPage.assertCheckTitlePage(mainPage.getPageTitleFromPage3to9(),"Для дітей");
        mainPage.openPageFromTheHeaderButton7();
        mainPage.assertCheckTitlePage(mainPage.getPageTitleFromPage3to9(),"Спорт і відпочинок");
        mainPage.openPageFromTheHeaderButton8();
        mainPage.assertCheckTitlePage(mainPage.getPageTitleFromPage3to9(),"Мистецтво та колекціонування");
        mainPage.openPageFromTheHeaderButton9();
        mainPage.assertCheckTitlePage(mainPage.getPageTitleFromPage3to9(),"Їжа та напої");
    }
    @Test
    public void CheckChangesButtonsLanguage() {
        mainPage.openPage();
        mainPage.closePopUpWindow();
        mainPage.changeLanguageToEng();
        mainPage.assertCompareButtonsNames(mainPage.getButtonName1(), "Catalog");
        mainPage.assertCompareButtonsNames(mainPage.getButtonName2(), "Brave Merch");
        mainPage.assertCompareButtonsNames(mainPage.getButtonName3(), "Clothes & shoes");
        mainPage.assertCompareButtonsNames(mainPage.getButtonName4(), "Home");
        mainPage.assertCompareButtonsNames(mainPage.getButtonName5(), "Beauty");
        mainPage.assertCompareButtonsNames(mainPage.getButtonName6(), "For kids");
        mainPage.assertCompareButtonsNames(mainPage.getButtonName7(), "Sport");
        mainPage.assertCompareButtonsNames(mainPage.getButtonName8(), "Art");
        mainPage.assertCompareButtonsNames(mainPage.getButtonName9(), "Food");
    }
}
