package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;

    private By resim = By.className("figure");
    private By altyazi = By.className("figcaption");

    public HoversPage (WebDriver driver){
        this.driver=driver;
    }


    public resimYazisi resimAltYazisi(int index){
        WebElement figure = driver.findElements(resim).get(index -1);

        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
        return new resimYazisi(figure.findElement(altyazi));
    }




    public class resimYazisi{

        private WebElement yazi;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        public resimYazisi(WebElement yazi){
            this.yazi = yazi;
        }

        public boolean isCaptionDisplayed(){
            return yazi.isDisplayed();
        }

        public String getTitle(){
            return yazi.findElement(header).getText();
        }

        public String getLink(){
            return yazi.findElement(link).getAttribute("href");
        }

        public String getLinkText(){
            return yazi.findElement(link).getText();
        }







    }




































}
