package navigate;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigateTests extends BaseTests {

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().goForward();
        getWindowManager().refreshPage();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchToWindow(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToWindow("New Window");
    }
}
