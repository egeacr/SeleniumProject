package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By input = By.id("target");
    private By result = By.id("result");

    public KeyPressesPage(WebDriver driver){
        this.driver= driver;
    }

    public void enterText(String text){
        driver.findElement(input).sendKeys(text);
    }

    public String getText(){
        return driver.findElement(result).getText();
    }

    public void enterDifKeys(){
        enterText(String.valueOf(Keys.BACK_SPACE));
    }

}
