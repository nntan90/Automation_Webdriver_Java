package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDownPage;

import java.util.List;

import static org.testng.Assert.*;

public class DropDownTests extends BaseTests {
    @Test
    public void testSelectOption(){
        String option = "option 1";
        DropDownPage dropDownPage = homePage.clickDropDownLink();
        dropDownPage.selectFromDropDownField("Option 1");
        List<String> selectedOption = dropDownPage.getSelectedOption();
        assertEquals(selectedOption.size(),1,"Incorrect number of selections");
        assertTrue(selectedOption.contains(option), "Option not selected");
    }
}
