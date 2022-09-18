package test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class KeyTests extends Base{

    @Test
    public void testEnteredKeys(){
        var Kpage = homePage.clickKeyPresses();
        Kpage.enterText("ali");
        assertEquals(Kpage.getText(),"You entered: Idf");
    }

    @Test
    public void testKeys(){
        var Kpage = homePage.clickKeyPresses();
        Kpage.enterDifKeys();
        assertEquals(Kpage.getText(),"You entered: BACK_SPACE", "FALSE RESULT MESSAGE" );
    }
}
