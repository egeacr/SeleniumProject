package test;

import org.testng.annotations.Test;

public class navigationTests extends Base {

    @Test
    public void TestNavigation() {
        homePage.clickDynamicLoading().clickButton1();
        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goToUrl("https://google.com");
    }

    @Test
    public void testSwitchTab() {
        homePage.clickMultipleWindows().clickMultiplePageButton();
        getWindowManager().switchToTab("New Window");
    }
}