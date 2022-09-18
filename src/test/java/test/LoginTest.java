package test;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class LoginTest extends Base{

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthenticationLink();
        loginPage.setUsername("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
                "Alert text is incorrect");




    }
}
