package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavascriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeDeepDom().scrollToTable();
    }

    @Test
    public void testScrollToParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(3);
    }
}
