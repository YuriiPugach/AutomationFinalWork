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
        itemPage.asserCheckLoginInWhoseSuccessful(itemPage.getPageTitle(), "Made with Bravery ᐈ Support Ukrainian Sellers. Shop and help to restore Ukraine.");
    }

    @Test(dependsOnMethods = {"CheckItemIsDeletedFromPopUpCartWindow"})
    public void OpenFirstItemPage() {
        itemPage.openPage();
        itemPage.closePopUpWindow();
        String firstItemNameOnTheMainPage = itemPage.getTextFromFirstItemNameOnTheMainPage();
        itemPage.clickOnTheFirstItemOnTheMainPage();
        String nameOfItemOnItemPAge = itemPage.getTextFromItemNameOnTheItemPage();
        itemPage.assertCompareNameOfItemOpenedFromMainPage(firstItemNameOnTheMainPage.toLowerCase(), nameOfItemOnItemPAge.toLowerCase());
    }
    @Test(dependsOnMethods = {"LoginInWithValidData"})
    public void CheckAddingItemToTheCart(){
        itemPage.openPage();
        itemPage.clickOnTheArtButtonInTheHeader();
        itemPage.clickOnTheFirstItemOnTheArtPage();
        itemPage.clickToClosePopUpWindowInTheItemPage();
        itemPage.clickOnTheAddToCartButton();
        itemPage.assertCheckItemIsAddedToTheCart(itemPage.getTextFromCartIcon(), "1");
    }

    @Test(dependsOnMethods = {"CheckAddingItemToTheCart"})
    public void CheckPopUoCartWindowIsShown(){
        itemPage.openCart();
        itemPage.assetCheckPopUpCartPageIsOpened(itemPage.getTextFromCartPage(), "Shopping cart");

    }

    @Test(dependsOnMethods = {"CheckPopUoCartWindowIsShown"})
    public void CheckItemIsDeletedFromPopUpCartWindow() {
        itemPage.clickOnTheShoppingCartPopUpPageDeleteButton();
        itemPage.assertCheckCartIsEmpty(itemPage.getTextFromEmptyCart(), "There is no items in cart");

    }





}
