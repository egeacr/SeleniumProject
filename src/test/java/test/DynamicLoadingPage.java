package test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingPage extends Base{

    @Test
    public void testExplicitWait(){
    var dynmaicPage = homePage.clickDynamicLoading().clickButton1();
    dynmaicPage.clickStart();
    assertEquals(dynmaicPage.getText(),"Hello World!", "Text is incorrect");


    }
}
