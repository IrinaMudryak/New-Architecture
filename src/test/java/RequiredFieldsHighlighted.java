import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utility.WebDriverFactory;

import static org.openqa.selenium.remote.BrowserType.CHROME;
import static utility.WebDriverFactory.FIREFOX;

/**
 * Created by Home on 27.04.2017.
 */
public class RequiredFieldsHighlighted extends TestBaseDws{
    private String borderColorFirstName;
    private String labelColor;
    private String asteriskColor;
    private String borderColor;


    @BeforeClass
    @Parameters({ "browserName" })
    public void preparation(String browserName){
         app.formHelper.setExpectedColors(browserName);
         borderColorFirstName = app.formHelper.getBorderColorFirstName();
         labelColor = app.formHelper.getLabelColor();
         asteriskColor = app.formHelper.getAsteriskColor();
         borderColor = app.formHelper.getBorderColor();
         app.formHelper.clearRequiredFields();
         pages.notifyMe.clickOnSubmit();
    }


    @Test(groups = "dws")
    public void firstNameClass () {
        assertEquals(pages.notifyMe.getFirstNameInputClass(), "form-control error");
    }
    @Test (groups = "dws")
    public void lastNameClass () {
        assertEquals(pages.notifyMe.getLastNameInputClass(), "form-control error");
    }
    @Test (groups = "dws")
    public void emailNameClass () {
        assertEquals(pages.notifyMe.getEmailInputClass(), "form-control error");
    }
    @Test (groups = "dws")
    public void phoneNumNameClass () {
        assertEquals(pages.notifyMe.getPhoneNumInputClass(), "form-control text-uppercase error"); }

    //First Name Highlight for input border and label
    @Test (groups = "dws")
    public void firstNameHighlight () {
        assertEquals(pages.notifyMe.getFirstNameInputBorderColor(),  borderColorFirstName);
    }
    @Test (groups = "dws")
    public void labelFirstNameHighlight () {
        assertEquals(pages.notifyMe.getLabelFirstNameColor(), labelColor);
    }
    @Test (groups = "dws")
    public void asteriskFirstNameColor () {
        assertEquals(pages.notifyMe.getAsteriskFirstNameColor(), asteriskColor);
    }

    //Last Name Highlight for input border and label
    @Test (groups = "dws")
    public void lastNameHighlight () {
        assertEquals(pages.notifyMe.getLastNameInputBorderColor(), borderColor);
    }
    @Test (groups = "dws")
    public void labelLastNameHighlight () {

        assertEquals(pages.notifyMe.getLabelLastNameColor(), labelColor);
    }
    @Test (groups = "dws")
    public void asteriskLastNameColor () {
        assertEquals(pages.notifyMe.getAsteriskLastNameColor(), asteriskColor);
    }

    //Phone Highlight for input border and label
    @Test (groups = "dws")
    public void phoneHighlight () {
        assertEquals(pages.notifyMe.getPhoneNumInputBorderColor(), borderColor);
    }
    @Test (groups = "dws")
    public void labelPhoneHighlight () {
        assertEquals(pages.notifyMe.getLabelPhoneColor(), labelColor);
    }
    @Test (groups = "dws")
    public void asteriskPhoneColor () {
        assertEquals(pages.notifyMe.getAsteriskPhoneColor(), asteriskColor);
    }

    //Email Address Highlight for input border and label
    @Test (groups = "dws")
    public void emailHighlight () {
       assertEquals(pages.notifyMe.getEmailInputBorderColor(), borderColor);
    }
    @Test (groups = "dws")
    public void labelEmailAddressHighlight () {
        assertEquals(pages.notifyMe.getLabelEmailAddressColor(), labelColor);
    }
    @Test (groups = "dws")
    public void asteriskEmailAddressColor () {
       assertEquals(pages.notifyMe.getAsteriskEmailAddressColor(), asteriskColor);
    }
  /*  @Test (groups = "dws")
    public void asteriskNoteColor () {
        Assert.assertEquals(notifyMe.getAsteriskNoteColor(), asteriskColor);
    } */


}


