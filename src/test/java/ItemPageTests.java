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
    public void CheckAddingItemToTheCart() throws InterruptedException {
        itemPage.openPage();
        itemPage.closePopUpWindow();
        itemPage.openLoginInPage();
        itemPage.sendKeysToTheEmailField("TestEmailAdress@meta.ua");
        itemPage.sendKeysToThePasswordField("Zxcvbnm11!");
        itemPage.clickOnTheLoginInButtonOnTheLoginPage();
        itemPage.clickOnTheArtButtonInTheHeader();
        itemPage.clickOnTheFirstItemOnTheArtPage();
        Thread.sleep(2000);
        itemPage.clickOnTheAddToCartButton();
        itemPage.assertCheckItemIsAddedToTheCart(itemPage.getTextFromCartIcon(), "1");
    }

    @Test
    public void CheckPopUoCartWindowIsShown() throws InterruptedException {
        itemPage.openPage();
        itemPage.closePopUpWindow();
        itemPage.openLoginInPage();
        itemPage.sendKeysToTheEmailField("TestEmailAdress@meta.ua");
        itemPage.sendKeysToThePasswordField("Zxcvbnm11!");
        itemPage.clickOnTheLoginInButtonOnTheLoginPage();
        itemPage.clickOnTheArtButtonInTheHeader();
        itemPage.clickOnTheFirstItemOnTheArtPage();
        Thread.sleep(2000);
        itemPage.clickOnTheAddToCartButton();
        itemPage.clickOnTheAddToCartButton();
        itemPage.assetCheckPopUpCartPageIsOpened(itemPage.getTextFromCartPage(), "Shopping cart");
    }

    @Test
    public void CheckItemIsDeletedFromPopUoCartWindow() throws InterruptedException {
        itemPage.openPage();
        itemPage.closePopUpWindow();
        itemPage.openLoginInPage();
        itemPage.sendKeysToTheEmailField("TestEmailAdress@meta.ua");
        itemPage.sendKeysToThePasswordField("Zxcvbnm11!");
        itemPage.clickOnTheLoginInButtonOnTheLoginPage();
        itemPage.clickOnTheArtButtonInTheHeader();
        itemPage.clickOnTheFirstItemOnTheArtPage();
        Thread.sleep(2000);
        itemPage.clickOnTheAddToCartButton();
        itemPage.clickOnTheAddToCartButton();
        itemPage.clickOnTheShoppingCartPopUpPageDeleteButton();
        itemPage.assertCheckCartIsEmpty(itemPage.getTextFromEmptyCart(), "There is no items in cart");
    }
}
