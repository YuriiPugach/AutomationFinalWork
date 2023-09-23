import org.testng.annotations.Test;

public class MainPageTests extends BaseTest{
    private static class DataForTests {
        private final static int expectedNumberOfButtonsInTheHeader = 8;
        private final static int expectedNumberOfItemsInTheMainPage = 20;

        private final static String expectedHeaderButtonNameCatalogUa = "Каталог";
        private final static String expectedHeaderButtonNameBraveMerchUa = "Brave Merch";
        private final static String expectedHeaderButtonNameClothUA = "Одяг, взуття, аксесуари";
        private final static String expectedHeaderButtonNameHomeUA = "Для дому";
        private final static String expectedHeaderButtonNameBeautyUA = "Краса і здоров'я";
        private final static String expectedHeaderButtonNameForKidsUA = "Для дітей";
        private final static String expectedHeaderButtonNameSportUA = "Спорт";
        private final static String expectedHeaderButtonNameArtUA = "Мистецтво";
        private final static String expectedHeaderButtonNameFoodUA = "Їжа та напої";

        private final static String expectedHeaderButtonNameCatalogEng = "Catalog";
        private final static String expectedHeaderButtonNameBraveMerchEng = "Brave Merch";
        private final static String expectedHeaderButtonNameClothEng = "Clothes & shoes";
        private final static String expectedHeaderButtonNameHomeEng = "Home";
        private final static String expectedHeaderButtonNameBeautyEng = "Beauty";
        private final static String expectedHeaderButtonNameForKidsEng = "For kids";
        private final static String expectedHeaderButtonNameSportEng = "Sport";
        private final static String expectedHeaderButtonNameArtEng = "Art";
        private final static String expectedHeaderButtonNameFoodEng = "Food";

        private final static String titleAfterClickOnButtonNameBraveMerchUa = "MADE WITH BRAVERY";
        private final static String titleAfterClickOnButtonNameClothUA = "Одяг, взуття, аксесуари";
        private final static String titleAfterClickOnButtonNameHomeUA = "Для дому";
        private final static String titleAfterClickOnButtonNameBeautyUA= "Краса і здоров'я";
        private final static String titleAfterClickOnButtonNameForKidsUA = "Для дітей";
        private final static String titleAfterClickOnButtonNameSportUA = "Спорт і відпочинок";
        private final static String titleAfterClickOnButtonNameArtUA = "Мистецтво та колекціонування";
        private final static String titleAfterClickOnButtonNameFoodUA = "Їжа та напої";
    }
    @Test(priority = 1)
    public void checkHeaderButtonsNames() {
        mainPage.openPage();
        mainPage.closePopUpWindow();
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameCatalog(), DataForTests.expectedHeaderButtonNameCatalogUa);
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameBraveMerch(), DataForTests.expectedHeaderButtonNameBraveMerchUa);
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameCloth(), DataForTests.expectedHeaderButtonNameClothUA);
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameHome(), DataForTests.expectedHeaderButtonNameHomeUA);
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameBeauty(), DataForTests.expectedHeaderButtonNameBeautyUA);
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameForKids(), DataForTests.expectedHeaderButtonNameForKidsUA);
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameSport(), DataForTests.expectedHeaderButtonNameSportUA);
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameArt(), DataForTests.expectedHeaderButtonNameArtUA);
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameFood(), DataForTests.expectedHeaderButtonNameFoodUA);
    }
    @Test(priority = 5)
    public void openedPageFromTheHeaderButton(){
        mainPage.openPage();
        mainPage.openPageFromTheHeaderButtonBraveMerch();
        mainPage.assertCheckTitlePage(mainPage.getPageTitleBraveMerch(),DataForTests.titleAfterClickOnButtonNameBraveMerchUa);
        mainPage.openPageFromTheHeaderButtonCloth();
        mainPage.assertCheckTitlePage(mainPage.getPageTitleFromPage3to9(),DataForTests.titleAfterClickOnButtonNameClothUA);
        mainPage.openPageFromTheHeaderButtonHome();
        mainPage.assertCheckTitlePage(mainPage.getPageTitleFromPage3to9(),DataForTests.titleAfterClickOnButtonNameHomeUA);
        mainPage.openPageFromTheHeaderButtonBeauty();
        mainPage.assertCheckTitlePage(mainPage.getPageTitleFromPage3to9(),DataForTests.titleAfterClickOnButtonNameBeautyUA);
        mainPage.openPageFromTheHeaderButtonForKids();
        mainPage.assertCheckTitlePage(mainPage.getPageTitleFromPage3to9(),DataForTests.titleAfterClickOnButtonNameForKidsUA);
        mainPage.openPageFromTheHeaderButtonSport();
        mainPage.assertCheckTitlePage(mainPage.getPageTitleFromPage3to9(),DataForTests.titleAfterClickOnButtonNameSportUA);
        mainPage.openPageFromTheHeaderButtonArt();
        mainPage.assertCheckTitlePage(mainPage.getPageTitleFromPage3to9(),DataForTests.titleAfterClickOnButtonNameArtUA);
        mainPage.openPageFromTheHeaderButtonFood();
        mainPage.assertCheckTitlePage(mainPage.getPageTitleFromPage3to9(),DataForTests.titleAfterClickOnButtonNameFoodUA);
    }
    @Test(priority = 2)
    public void checkChangesButtonsLanguage() {
        mainPage.changeLanguageToEng();
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameCatalog(), DataForTests.expectedHeaderButtonNameCatalogEng);
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameBraveMerch(), DataForTests.expectedHeaderButtonNameBraveMerchEng);
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameCloth(), DataForTests.expectedHeaderButtonNameClothEng);
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameHome(), DataForTests.expectedHeaderButtonNameHomeEng);
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameBeauty(), DataForTests.expectedHeaderButtonNameBeautyEng);
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameForKids(), DataForTests.expectedHeaderButtonNameForKidsEng);
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameSport(), DataForTests.expectedHeaderButtonNameSportEng);
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameArt(), DataForTests.expectedHeaderButtonNameArtEng);
        mainPage.assertCompareButtonsNames(mainPage.getButtonNameFood(), DataForTests.expectedHeaderButtonNameFoodEng);
    }
    @Test(priority = 3)
    public void checkNumbersOfItemsOnTheMainPage(){
        mainPage.assertCompareNumberOfItemsOnTheMainPage(mainPage.getNumbersOfItemsOnTheMainPage(), DataForTests.expectedNumberOfItemsInTheMainPage);

    }
    @Test(priority = 4)
    public void checkNNumberOfButtonsInTheHeader(){
        mainPage.assertCompareNumberOfButtonsInTheHeader(mainPage.getNumberOfButtonsInTheHeader(), DataForTests.expectedNumberOfButtonsInTheHeader);

    }

}
