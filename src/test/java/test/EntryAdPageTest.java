package test;

import org.testng.annotations.Test;

public class EntryAdPageTest extends Base {

    @Test
    public void modalTest() throws InterruptedException {
        var entryPage = homePage.clickEntryAd();
        Thread.sleep(5000);
        entryPage.clickCloseButton();
        Thread.sleep(5000);
    }
//Wait strategies can be used in this function instead of Thread.sleep(5000)
}
