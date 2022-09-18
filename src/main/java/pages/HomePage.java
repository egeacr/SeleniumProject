package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;


    public HomePage (WebDriver driver){
            this.driver = driver;
    }

    public LoginPage clickFormAuthenticationLink() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoversPage clickHover(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public EntryAdPage clickEntryAd(){
        clickLink("Entry Ad");
        return new EntryAdPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public AlertsPage clickAlertsPage(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }
    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }


    private void clickLink (String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}
