package iframe;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

import static org.testng.Assert.assertEquals;

public class IframeTests extends BaseTests {

    @Test
    public void testIframe(){
        WysiwygEditorPage wysiwygEditorPage = homePage.clickWysiwygEditor();
        wysiwygEditorPage.clearText();

        String text1 = "Hello";
        String text2 = "World!";
        wysiwygEditorPage.inputText(text1);
        wysiwygEditorPage.clickIncreaseIndent();
        wysiwygEditorPage.inputText(text2);
        assertEquals(wysiwygEditorPage.getText(),text1 + text2, "Wrong test result!!");
    }
}
