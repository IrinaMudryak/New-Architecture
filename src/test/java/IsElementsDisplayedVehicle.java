import notifiMeForm.NotifyMeFormPage;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Home on 24.04.2017.
 */
public class IsElementsDisplayedVehicle extends TestBaseDws {



    //Tests for elements  of the First Name (label, input field, asterisk)
    @Test(groups = "dws")
    public void firstNameInputDisplayed() {

        assertTrue(pages.notifyMe.isFirstNameInputDisplayed());
    }
    @Test(groups = "dws")
    public void labelFirstNameDisplayed() {
        assertTrue(pages.notifyMe.isLabelFirstNameDisplayed());
    }
    @Test(groups = "dws")
    public void asteriskFirstNameDisplayed() {
        assertTrue(pages.notifyMe.isAsteriskFirstNameDisplayed());
    }


    // Tests for elements  of the Last Name (label, input field, asterisk)
    @Test(groups = "dws")
    public void lastNameInputDisplayed() {
        assertTrue(pages.notifyMe.isLastNameInputDisplayed());
    }
    @Test(groups = "dws")
    public void labelLastNameDisplayed() {
        assertTrue(pages.notifyMe.isLabelLastNameDisplayed());
    }
    @Test(groups = "dws")
    public void asteriskLastNameDisplayed() {
        assertTrue(pages.notifyMe.isAsteriskLastNameDisplayed());
    }


    // Tests for elements  of the Phone (label, input field, asterisk)
    @Test(groups = "dws")
    public void phoneNumInputDisplayed() {
        assertTrue(pages.notifyMe.isPhoneNumInputDisplayed());
    }
    @Test(groups = "dws")
    public void labelPhoneDisplayed() {
        assertTrue(pages.notifyMe.isLabelPhoneDiaplayed());
    }
    @Test(groups = "dws")
    public void asteriskPhoneDisplayed() {
        assertTrue(pages.notifyMe.isAsteriskPhoneDiaplayed());
    }


    // Tests for elements  of the Email Address (label, input field, asterisk)
    @Test(groups = "dws")
    public void emailInputDisplayed() {
        assertTrue(pages.notifyMe.isEmailInputDisplayed());
    }
    @Test(groups = "dws")
    public void labelEmailAddressDisplayed() {
        assertTrue(pages.notifyMe.isLabelEmailAddressDisplayed());
    }
    @Test(groups = "dws")
    public void asteriskEmailAddressDisplayed() {
        assertTrue(pages.notifyMe.isAsteriskEmailAddressDisplayed());
    }


    //Widget title
    @Test(groups = "dws")
    public void widgetTitleDisplayed() {
        assertTrue(pages.notifyMe.isWidgetTitleDisplayed());
    }

    //BLOCKED FIELDS: check if the fields Body Style, Make and Model are disabled by opening the form
    @Test(groups = "dws")
    public void makeDisabled() {
        assertEquals(pages.notifyMe.getMakeDisabled(), "true");
    }
    @Test(groups = "dws")
    public void modelDisabled() {
        assertEquals(pages.notifyMe.getModelDisabled(), "true");
    }


    // Tests for elements  of the Motorized Type
    @Test(groups = "dws")
    public void labelMotorizedTypeDisplayed() {
        assertTrue(pages.notifyMe.isLabelMotorizedTypeDisplayed());
    }
    @Test(groups = "dws")
    public void motorizedTypeSelectorDisplayed() {
        assertTrue(pages.notifyMe.isMotorizedTypeSelectorDisplayed());
    }

    // Tests for elements  of the Make check if label and selector displayed
    @Test(groups = "dws")
    public void labelMakeDisplayed() {
        assertTrue(pages.notifyMe.isLabelMakeDisplayed());
    }
    @Test(groups = "dws")
    public void makeSelectorDisplayed() {
        assertTrue(pages.notifyMe.isMakeSelectorDisplayed());
    }

    //Tests for elements  of the Model: check if label and selector are displayed
    @Test(groups = "dws")
    public void labelModelDisplayed() {
        assertTrue(pages.notifyMe.isLabelModelDisplayed());
    }
    @Test(groups = "dws")
    public void modelSelectorDisplayed() {
        assertTrue(pages.notifyMe.isModelSelectorDisplayed());
    }

    // Tests for elements  of the Year: check if label and selectors are displayed
    @Test(groups = "dws")
    public void labelYearDisplayed() {
        assertTrue(pages.notifyMe.isLabelYearDisplayed());
    }//check label
    @Test(groups = "dws")
    public void minYearSelectorDisplayed() {
        assertTrue(pages.notifyMe.isMinYearSelectorDisplayed());
    }// check if selector for min Year is displayed

    @Test(groups = "dws")
    public void maxYearSelectorDisplayed() {
        assertTrue(pages.notifyMe.isMaxYearSelectorDisplayed());
    }    // check if selector for max Year is displayed

    // Tests for elements  of the Price: check if label and input fields are displayed
    @Test(groups = "dws")
    public void labelPriceDisplayed() {
        assertTrue(pages.notifyMe.isLabelPriceDisplayed());
    }//check label
    @Test(groups = "dws")
    public void minPriceInputDisplayed() {assertTrue(pages.notifyMe.isMinPriceInputDisplayed());
    }// check if input field for min Price is displayed

    @Test(groups = "dws")
    public void maxPriceInputDisplayed() {assertTrue(pages.notifyMe.isMaxPriceInputDisplayed());
    }// check if input field for max Price is displayed

    //Tests for elements  of the Frequency: check if label and selector are displayed
    @Test(groups = "dws")
    public void labeFrequencyDisplayed() {
        assertTrue(pages.notifyMe.isLabelFrequencyDisplayed());
    }
    @Test(groups = "dws")
    public void frequencySelectorDisplayed() {
        assertTrue(pages.notifyMe.isFrequencySelectorDisplayed());
    }

    //Tests for elements  of the Expires: check if label and selector are displayed
    @Test(groups = "dws")
    public void labeExpiresDisplayed() {
        assertTrue(pages.notifyMe.isLabelExpiresDisplayed());
    }
    @Test(groups = "dws")
    public void expiresSelectorDisplayed() {
        assertTrue(pages.notifyMe.isExpiresSelectorDisplayed());
    }

}

  /*  @Test(groups = "dws")
    public void asteriskTextDisplayed () {
        Assert.assertTrue(notifyMe.isAsteriskTextDisplayed());
    }

    @Test(groups = "dws")
    public void asteriskNoteDisplayed () { Assert.assertTrue(notifyMe.isAsteriskNoteDisplayed()); }*/




   /* @Test(groups = "dws")
    public void securityTitleDisplayed () {
        Assert.assertTrue(notifyMe.isSecurityTitleDisplayed());
    }

    @Test(groups = "dws")
    public void asteriskCaptchaDisplayed () {
      Assert.assertTrue(notifyMe.isAsteriskCaptchaDisplayed());
    }
    */



