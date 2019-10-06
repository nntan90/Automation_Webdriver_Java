package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDownPage;

import java.util.List;

import static org.testng.Assert.*;

public class DropDownTests extends BaseTests {
    @Test
    public void testSelectOption(){
        String option = "Option 1";
        DropDownPage dropDownPage = homePage.clickDropDownLink();
        dropDownPage.selectFromDropDownField(option);
        List<String> selectedOption = dropDownPage.getSelectedOption();
        assertEquals(selectedOption.size(),1,"Incorrect number of selections");
        assertTrue(selectedOption.contains(option), "Option not selected");
    }
}
