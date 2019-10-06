package alert;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

import static org.testng.Assert.assertEquals;

public class JsAlertsTests  extends BaseTests {

    @Test
    public void testAcceptAlert(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.triggerAlert();
        javaScriptAlertsPage.alert_ClickToAccept();
        assertEquals(javaScriptAlertsPage.getResult(),"You successfuly clicked an alert", "Result is incorrect");
    }

    @Test
    public void testGetTextFromConfirm(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.triggerConfirm();
        String text = javaScriptAlertsPage.getTextFromAlert();
        javaScriptAlertsPage.alert_ClickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Text is incorrect");
    }

    @Test
    public void testEnterTextForPrompt(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.triggerPrompt();
        String inputText = "TAU rocks!";
        javaScriptAlertsPage.alert_EnterText(inputText);
        javaScriptAlertsPage.alert_ClickToAccept();
        assertEquals(javaScriptAlertsPage.getResult(),"You entered: " + inputText,"Text input does not display on Result field");
    }

}
