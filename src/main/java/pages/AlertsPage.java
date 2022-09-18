package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");

    private By resultText = By.id("result");

    public AlertsPage( WebDriver driver){
        this.driver=driver;
    }

    public void triggerAlertButton(){
        driver.findElement(triggerAlertButton).click();
    }

    public void triggerConfirmButton(){
        driver.findElement(triggerConfirmButton).click();
    }


    public void triggerPromtButton(){
        driver.findElement(triggerPromptButton).click();
    }


    public void alert_clicktoAccept(){
        driver.switchTo().alert().accept();
    }

    public void alert_clicktoDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

    public void setText( String text){
        driver.switchTo().alert().sendKeys(text);

    }

    public String result(){
        return driver.findElement(resultText).getText();
    }



}
