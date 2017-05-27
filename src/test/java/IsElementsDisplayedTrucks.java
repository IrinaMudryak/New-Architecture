import static org.testng.Assert.*;

import org.testng.annotations.Test;

/**
 * Created by Home on 27.04.2017.
 */
public class IsElementsDisplayedTrucks extends IsElementsDisplayedVehicle {



    //BLOCKED FIELDS: check if the fields Body Style, Make and Model are disabled by opening the form
    @Test(groups = "dws")
    public void bodyStyleDisabled() {
        assertEquals(pages.notifyMe.getBodyStyleDisabled(), "true");
    }
    // Tests for elements  of the Type
    @Test(groups = "dws")
    public void labelTypeDisplayed() {
        assertTrue(pages.notifyMe.isLabelTypeDisplayed());
    }
    @Test(groups = "dws")
    public void typeSelectorDisplayed() {
         assertTrue(pages.notifyMe.isTypeSelectorDisplayed());
    }


    // Tests for elements  of the Body Style
    @Test(groups = "dws")
    public void labelBodyStyleDisplayed() {
         assertTrue(pages.notifyMe.isLabelBodyStyleDisplayed());
    }
    @Test(groups = "dws")
    public void bodyStyleSelectorDisplayed() {
         assertTrue(pages.notifyMe.isBodyStyleSelectorDisplayed());
    }

    // Tests for elements  of the Odometer: check if label and input fields are displayed
    @Test(groups = "dws")
    public void labelOdometerDisplayed() {
        assertTrue(pages.notifyMe.isLabelOdometerDisplayed());
    }//check label
    @Test(groups = "dws")
    public void minOdometerInputDisplayed() {
       assertTrue(pages.notifyMe.isMinOdometerInputDisplayed());
    }// check if input field for min Odometer is displayed
    @Test(groups = "dws")
    public void maxOdometerInputDisplayed() {
       assertTrue(pages.notifyMe.isMaxOdometerInputDisplayed());
    }// check if input field for max Odometer is displayed


    //Tests for elements  of the Transmission: check if label and selector are displayed
    @Test(groups = "dws")
    public void labeTransmissionDisplayed() {
       assertTrue(pages.notifyMe.isLabelTransmissionDisplayed());
    }
    @Test(groups = "dws")
    public void transmissionSelectorDisplayed() {
        assertTrue(pages.notifyMe.isTransmissionSelectorDisplayed());

    }
}

