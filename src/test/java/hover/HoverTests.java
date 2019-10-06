package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1(){
        HoversPage hoversPage = homePage.clickHorvers();
        HoversPage.FigureCaption caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption does not display");
        assertEquals(caption.getHeader(), "name: user1","Incorrect Header");
        assertEquals(caption.getLinkText(),"View profile", "Incorrect Link Test");
        assertTrue(caption.getLink().endsWith("/users/1"), "Incorrect Href");
    }
}
