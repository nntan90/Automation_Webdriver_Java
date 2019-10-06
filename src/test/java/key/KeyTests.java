package key;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;

public class KeyTests extends BaseTests {

    @Test
    public void testBackspace(){
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testEnterPi(){
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterPi();
    }

}
