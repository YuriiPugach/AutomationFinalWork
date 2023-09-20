import org.testng.annotations.Test;

public class ItemPageTests extends BaseTest {
    @Test
    public void LoginInWithValidData() {
        itemPage.openPage();
        itemPage.closePopUpWindow();
        itemPage.openLoginInPage();
        itemPage.sendKeysToTheEmailField("TestEmailAdress@meta.ua");
        itemPage.sendKeysToThePasswordField("Zxcvbnm11!");
        itemPage.clickOnTheLoginInButtonOnTheLoginPage();
        itemPage.asserCheckLoginInWhoseSuccessful(itemPage.getPageTitle(), "Made with Bravery ᐈ магазин товарів від українських продавців з доставкою по Європі");
    }

    @Test
    public void OpenFirstItemPage() {
        itemPage.openPage();
        itemPage.closePopUpWindow();
        String firstItemNameOnTheMainPage = itemPage.getTextFromFirstItemNameOnTheMainPage();
        itemPage.clickOnTheFirstItemOnTheMainPage();
        String nameOfItemOnItemPAge = itemPage.getTextFromItemNameOnTheItemPage();
        itemPage.assertCompareNameOfItemOpenedFromMainPage(firstItemNameOnTheMainPage.toLowerCase(), nameOfItemOnItemPAge.toLowerCase());
    }

    @Test
    public void CheckItemIsDeletedFromPopUpCartWindow() {
        itemPage.openPage();
        itemPage.closePopUpWindow();
        itemPage.openLoginInPage();
        itemPage.sendKeysToTheEmailField("TestEmailAdress@meta.ua");
        itemPage.sendKeysToThePasswordField("Zxcvbnm11!");
        itemPage.clickOnTheLoginInButtonOnTheLoginPage();
        itemPage.clickOnTheArtButtonInTheHeader();
        itemPage.clickOnTheFirstItemOnTheArtPage();
        itemPage.clickToClosePopUpWindowInTheItemPage();
        itemPage.clickOnTheAddToCartButton();
        itemPage.openCart();
        itemPage.clickOnTheShoppingCartPopUpPageDeleteButton();
        itemPage.assertCheckCartIsEmpty(itemPage.getTextFromEmptyCart(), "There is no items in cart");
    }

    @Test
    public void CheckAddingItemToTheCart(){
        itemPage.openPage();
        itemPage.closePopUpWindow();
        itemPage.openLoginInPage();
        itemPage.sendKeysToTheEmailField("TestEmailAdress@meta.ua");
        itemPage.sendKeysToThePasswordField("Zxcvbnm11!");
        itemPage.clickOnTheLoginInButtonOnTheLoginPage();
        itemPage.clickOnTheArtButtonInTheHeader();
        itemPage.clickOnTheFirstItemOnTheArtPage();
        itemPage.clickToClosePopUpWindowInTheItemPage();
        itemPage.clickOnTheAddToCartButton();
        itemPage.assertCheckItemIsAddedToTheCart(itemPage.getTextFromCartIcon(), "1");
    }

    @Test
    public void CheckPopUoCartWindowIsShown(){
        itemPage.openPage();
        itemPage.closePopUpWindow();
        itemPage.openLoginInPage();
        itemPage.sendKeysToTheEmailField("TestEmailAdress@meta.ua");
        itemPage.sendKeysToThePasswordField("Zxcvbnm11!");
        itemPage.clickOnTheLoginInButtonOnTheLoginPage();
        itemPage.clickOnTheArtButtonInTheHeader();
        itemPage.clickOnTheFirstItemOnTheArtPage();
        itemPage.clickToClosePopUpWindowInTheItemPage();
        itemPage.clickOnTheAddToCartButton();
        itemPage.openCart();
        itemPage.assetCheckPopUpCartPageIsOpened(itemPage.getTextFromCartPage(), "Shopping cart");
    }

}
