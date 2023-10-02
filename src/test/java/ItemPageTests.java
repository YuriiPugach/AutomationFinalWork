import org.testng.annotations.Test;


public class ItemPageTests extends BaseTest {
    private static class DataForTests {
        private final static String loginEmail = "TestEmailAdress@meta.ua";
        private final static String loginPassword = "Zxcvbnm11!";
        private final static String mainPageTitle = "Made with Bravery ᐈ Support Ukrainian Sellers. Shop and help to restore Ukraine.";
        private final static String numberOnCartButton = "1";
        private final static String textOnCartPopUp = "Shopping cart";
        private final static String textOnEmptyCart = "There is no items in cart";
    }

    @Test
    public void loginInWithValidData() {
        itemPage.openPage();
        itemPage.closePopUpWindow();
        itemPage.openLoginInPage();
        itemPage.sendKeysToTheEmailField(DataForTests.loginEmail);
        itemPage.sendKeysToThePasswordField(DataForTests.loginPassword);
        itemPage.clickOnTheLoginInButtonOnTheLoginPage();
        itemPage.assertUserIsLogged();
    }

    @Test(dependsOnMethods = {"checkItemIsDeletedFromPopUpCartWindow"})
    public void openFirstItemPage() {
        itemPage.openPage();
        itemPage.closePoliceAgreement();
        String firstItemNameOnTheMainPage = itemPage.getTextFromFirstItemNameOnTheMainPage();
        itemPage.clickOnTheFirstItemOnTheMainPage();
        String nameOfItemOnItemPAge = itemPage.getTextFromItemNameOnTheItemPage();
        itemPage.assertCompareNameOfItemOpenedFromMainPage(firstItemNameOnTheMainPage.toLowerCase(), nameOfItemOnItemPAge.toLowerCase());
    }
    @Test(dependsOnMethods = {"loginInWithValidData"})
    public void checkAddingItemToTheCartIsShownOnTheCartButton(){
        itemPage.openPage();
        itemPage.closePoliceAgreement();
        itemPage.clickOnTheArtButtonInTheHeader();
        itemPage.clickOnTheFirstItemOnTheArtPage();
        itemPage.clickToClosePopUpWindowInTheItemPage();
        itemPage.clickOnTheAddToCartButton();
        itemPage.assertCheckItemIsAddedToTheCart(itemPage.getTextFromCartIcon(), DataForTests.numberOnCartButton);
    }

    @Test(dependsOnMethods = {"checkAddingItemToTheCartIsShownOnTheCartButton"})
    public void checkPopUoCartWindowIsShown(){
        itemPage.openCart();
        itemPage.assetCheckPopUpCartPageIsOpened(itemPage.getTextFromCartPage(), DataForTests.textOnCartPopUp);

    }

    @Test(dependsOnMethods = {"checkPopUoCartWindowIsShown"})
    public void checkItemIsDeletedFromPopUpCartWindow() {
        itemPage.clickOnTheShoppingCartPopUpPageDeleteButton();
        itemPage.assertCheckCartIsEmpty(itemPage.getTextFromEmptyCart(), DataForTests.textOnEmptyCart);

    }





}
