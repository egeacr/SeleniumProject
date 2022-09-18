package test;

import org.testng.annotations.Test;
import pages.DropdownPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTest extends Base{

    @Test
    public void testSelectedOption(){
        DropdownPage dropDownpage = homePage.clickDropDown();
        String option = "Option 1";
        dropDownpage.SelectFromDropDown(option);
        var selectedOptions = dropDownpage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");
       /* System.out.println(dropDownpage.getSelectedOptions());
            Bu method sayesinde secilen dropdown itemleri bulundu.
* */
    }
}
