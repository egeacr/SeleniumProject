package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;

public class SecureAreaPage {

    private WebDriver driver;
    private By alertText = By.id("flash");

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlertText(){
        return driver.findElement(alertText).getText();
    }


}
