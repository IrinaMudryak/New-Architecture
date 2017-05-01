import notifiMeForm.NotifyMeFormPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Home on 24.04.2017.
 */
public class IsElementDisplayedVehicle extends TestBaseDws {

     @BeforeClass
          private void openPage () {
         app.getNavigationHelper().openNotifyMePage();
     }

    //Tests for elements  of the First Name (label, input field, asterisk)
    @Test(groups = "dws")
    public void firstNameInputDisplayed() {

        Assert.assertTrue(pages.notifyMe.isFirstNameInputDisplayed());
    }
    @Test(groups = "dws")
    public void labelFirstNameDisplayed() {
        Assert.assertTrue(pages.notifyMe.isLabelFirstNameDisplayed());
    }
    @Test(groups = "dws")
    public void asteriskFirstNameDisplayed() {
        Assert.assertTrue(pages.notifyMe.isAsteriskFirstNameDisplayed());
    }


    // Tests for elements  of the Last Name (label, input field, asterisk)
    @Test(groups = "dws")
    public void lastNameInputDisplayed() {
        Assert.assertTrue(pages.notifyMe.isLastNameInputDisplayed());
    }
    @Test(groups = "dws")
    public void labelLastNameDisplayed() {
        Assert.assertTrue(pages.notifyMe.isLabelLastNameDisplayed());
    }
    @Test(groups = "dws")
    public void asteriskLastNameDisplayed() {
        Assert.assertTrue(pages.notifyMe.isAsteriskLastNameDisplayed());
    }


    // Tests for elements  of the Phone (label, input field, asterisk)
    @Test(groups = "dws")
    public void phoneNumInputDisplayed() {
        Assert.assertTrue(pages.notifyMe.isPhoneNumInputDisplayed());
    }
    @Test(groups = "dws")
    public void labelPhoneDisplayed() {
        Assert.assertTrue(pages.notifyMe.isLabelPhoneDiaplayed());
    }
    @Test(groups = "dws")
    public void asteriskPhoneDisplayed() {
        Assert.assertTrue(pages.notifyMe.isAsteriskPhoneDiaplayed());
    }


    // Tests for elements  of the Email Address (label, input field, asterisk)
    @Test(groups = "dws")
    public void emailInputDisplayed() {
        Assert.assertTrue(pages.notifyMe.isEmailInputDisplayed());
    }
    @Test(groups = "dws")
    public void labelEmailAddressDisplayed() {
        Assert.assertTrue(pages.notifyMe.isLabelEmailAddressDisplayed());
    }
    @Test(groups = "dws")
    public void asteriskEmailAddressDisplayed() {
        Assert.assertTrue(pages.notifyMe.isAsteriskEmailAddressDisplayed());
    }


    //Widget title
    @Test(groups = "dws")
    public void widgetTitleDisplayed() {
        Assert.assertTrue(pages.notifyMe.isWidgetTitleDisplayed());
    }

    //BLOCKED FIELDS: check if the fields Body Style, Make and Model are disabled by opening the form
    @Test(groups = "dws")
    public void makeDisabled() {
        Assert.assertEquals(pages.notifyMe.getMakeDisabled(), "true");
    }
    @Test(groups = "dws")
    public void modelDisabled() {
        Assert.assertEquals(pages.notifyMe.getModelDisabled(), "true");
    }


    // Tests for elements  of the Motorized Type
    @Test(groups = "dws")
    public void labelMotorizedTypeDisplayed() {
        Assert.assertTrue(pages.notifyMe.isLabelMotorizedTypeDisplayed());
    }
    @Test(groups = "dws")
    public void motorizedTypeSelectorDisplayed() {
        Assert.assertTrue(pages.notifyMe.isMotorizedTypeSelectorDisplayed());
    }

    // Tests for elements  of the Make check if label and selector displayed
    @Test(groups = "dws")
    public void labelMakeDisplayed() {
        Assert.assertTrue(pages.notifyMe.isLabelMakeDisplayed());
    }
    @Test(groups = "dws")
    public void makeSelectorDisplayed() {
        Assert.assertTrue(pages.notifyMe.isMakeSelectorDisplayed());
    }

    //Tests for elements  of the Model: check if label and selector are displayed
    @Test(groups = "dws")
    public void labelModelDisplayed() {
        Assert.assertTrue(pages.notifyMe.isLabelModelDisplayed());
    }
    @Test(groups = "dws")
    public void modelSelectorDisplayed() {
        Assert.assertTrue(pages.notifyMe.isModelSelectorDisplayed());
    }

    // Tests for elements  of the Year: check if label and selectors are displayed
    @Test(groups = "dws")
    public void labelYearDisplayed() {
        Assert.assertTrue(pages.notifyMe.isLabelYearDisplayed());
    }//check label
    @Test(groups = "dws")
    public void minYearSelectorDisplayed() {
        Assert.assertTrue(pages.notifyMe.isMinYearSelectorDisplayed());
    }// check if selector for min Year is displayed

    @Test(groups = "dws")
    public void maxYearSelectorDisplayed() {
        Assert.assertTrue(pages.notifyMe.isMaxYearSelectorDisplayed());
    }    // check if selector for max Year is displayed

    // Tests for elements  of the Price: check if label and input fields are displayed
    @Test(groups = "dws")
    public void labelPriceDisplayed() {
        Assert.assertTrue(pages.notifyMe.isLabelPriceDisplayed());
    }//check label
    @Test(groups = "dws")
    public void minPriceInputDisplayed() {Assert.assertTrue(pages.notifyMe.isMinPriceInputDisplayed());
    }// check if input field for min Price is displayed

    @Test(groups = "dws")
    public void maxPriceInputDisplayed() {Assert.assertTrue(pages.notifyMe.isMaxPriceInputDisplayed());
    }// check if input field for max Price is displayed

    //Tests for elements  of the Frequency: check if label and selector are displayed
    @Test(groups = "dws")
    public void labeFrequencyDisplayed() {
        Assert.assertTrue(pages.notifyMe.isLabelFrequencyDisplayed());
    }
    @Test(groups = "dws")
    public void frequencySelectorDisplayed() {
        Assert.assertTrue(pages.notifyMe.isFrequencySelectorDisplayed());
    }

    //Tests for elements  of the Expires: check if label and selector are displayed
    @Test(groups = "dws")
    public void labeExpiresDisplayed() {
        Assert.assertTrue(pages.notifyMe.isLabelExpiresDisplayed());
    }
    @Test(groups = "dws")
    public void expiresSelectorDisplayed() {
        Assert.assertTrue(pages.notifyMe.isExpiresSelectorDisplayed());
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



