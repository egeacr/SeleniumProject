package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPage1 {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loading = By.id("loading");
    private By loadedText = By.id("finish");

    public DynamicLoadingPage1(WebDriver driver){
        this.driver = driver;
    }

    public void clickStart(){
        driver.findElement(startButton).click();
  /* //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 6);

*/
        //Fluent Wait
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
    }

    public String getText(){
        return driver.findElement(loadedText).getText();
    }


}
