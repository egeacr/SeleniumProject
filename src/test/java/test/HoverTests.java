package test;

import org.testng.annotations.Test;
import pages.HoversPage;
import static org.testng.Assert.*;

public class HoverTests extends Base{

    @Test
    public void testHovers(){
        var hoverPage = homePage.clickHover();
        var yazi = hoverPage.resimAltYazisi(1);
        assertTrue(yazi.isCaptionDisplayed(), "Caption is not displayed");
        assertEquals(yazi.getTitle(), "name: user1", "username is false");
        assertEquals( yazi.getLinkText(), "View profile", "yanlis olan bulundu");

    }
}
