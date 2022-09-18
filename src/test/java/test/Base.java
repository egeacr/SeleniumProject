package test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;
import utils.EvetListener;
import utils.WindowManager;
import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;


public class Base {

    //public WebDriver driver;
    public HomePage homePage;
    private EventFiringWebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        //driver = new ChromeDriver();
        driver = new EventFiringWebDriver(new ChromeDriver());
        driver.register(new EvetListener());
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);

    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

   @AfterClass
    public void tearDown(){
        driver.quit();
   }

   @AfterMethod
   public void recordFailure(ITestResult result){
        var camera = (TakesScreenshot)driver;
       File screenshot = camera.getScreenshotAs(OutputType.FILE);
       try{
           Files.move(screenshot, new File("C:\\Users\\EGE ACAR\\Desktop\\Automation\\TestAutomationUni\\TestAutomationUni1\\resources" + result.getName() + ".png"));
       }catch(IOException e){
           e.printStackTrace();
       }
//When test fail, this method take screenshot of failure page.

   }
   public WindowManager getWindowManager(){
        return new WindowManager(driver);
   }

}