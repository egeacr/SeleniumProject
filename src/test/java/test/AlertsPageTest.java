package test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsPageTest extends Base{

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerAlertButton();
        alertsPage.alert_clicktoAccept();
        assertEquals(alertsPage.result(), "You successfully clicked an alert", "False message" );
    }

    @Test
    public void testAcceptConf(){
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerConfirmButton();
        alertsPage.alert_clicktoDismiss();
        assertEquals(alertsPage.result(), "You clicked: Cancel", "False message" );
    }

    @Test
    public void testTextArea(){
        var alertspage = homePage.clickAlertsPage();
        alertspage.triggerPromtButton();
        String username = "ege";
        alertspage.setText(username);
        alertspage.alert_clicktoAccept();
        assertEquals(alertspage.result(), "You entered: "+ username, "Result text did not match");
    }


}
