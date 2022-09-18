package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage {
    private WebDriver driver;
    private By closeButton = By.xpath("(//div[@class='modal-footer'])[1]");

    public EntryAdPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickCloseButton(){
        driver.findElement(closeButton).click();
    }
}
