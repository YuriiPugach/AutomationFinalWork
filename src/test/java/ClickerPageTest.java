import org.testng.annotations.Test;

public class ClickerPageTest extends BaseTest{

    @Test
    public void clickOnPlusButtonAndCheckCounterFields(){
        int countOfClicks = 7;
        clickerPage.openPage();
        clickerPage.acceptCookies();
        clickerPage.switchToFrameWithClicker();
        clickerPage.clickOnPlusButton(countOfClicks);
        clickerPage.assertCountOfClicks(clickerPage.getCountOfClickFromField(), countOfClicks);
    }

    @Test
    public void clickOnPlusButtonAndCheckCounterFieldsAgain(){
        int countOfClicks = 7;
        clickerPage.openPage();
        clickerPage.acceptCookies();
        clickerPage.switchToFrameWithClicker();
        clickerPage.clickOnPlusButton(countOfClicks);
        clickerPage.assertCountOfClicks(clickerPage.getCountOfClickFromField(), 8);
    }
}
