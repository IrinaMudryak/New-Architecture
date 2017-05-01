import org.testng.Assert;
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
    String borderColor;
    String labelColor;
    String borderColorFirstName;
    String asteriskColor;


    @BeforeClass
    @Parameters({ "browserName" })
    public void preparation(String browserName){
            app.getNavigationHelper().openNotifyMePage();

         pages.notifyMe.clickOnSubmit();

        if(CHROME.equals(browserName)) {
            borderColor = "rgb(169, 68, 66)";
            labelColor = "rgba(169, 68, 66, 1)";
            borderColorFirstName = "rgb(132, 53, 52)";
            asteriskColor = "rgba(169, 68, 66, 1)";
        }

        else if(FIREFOX.equals(browserName)) {
            borderColor = "#a94442";
            labelColor = "#a94442";
            borderColorFirstName = "#a94442";
            asteriskColor = "#a94442";
        }
        else if (WebDriverFactory.IE.equals(browserName)){
            borderColor = "#a94442";
            labelColor = "rgba(169, 68, 66, 1)";
            borderColorFirstName = "#843534";
            asteriskColor = "rgba(169, 68, 66, 1)";
        }



        //  WebDriverWait wait = new WebDriverWait(driver, 10);
        //  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("first_name"))));
    }

    @Test(groups = "dws")
    public void firstNameClass () {

        Assert.assertEquals(pages.notifyMe.getFirstNameInputClass(), "form-control error");
    }
    @Test (groups = "dws")
    public void lastNameClass () {
        Assert.assertEquals(pages.notifyMe.getLastNameInputClass(), "form-control error");
    }
    @Test (groups = "dws")
    public void emailNameClass () {
        Assert.assertEquals(pages.notifyMe.getEmailInputClass(), "form-control error");
    }
    @Test (groups = "dws")
    public void phoneNumNameClass () {
        Assert.assertEquals(pages.notifyMe.getPhoneNumInputClass(), "form-control text-uppercase error"); }

    //First Name Highlight for input border and label
    @Test (groups = "dws")
    public void firstNameHighlight () {
        Assert.assertEquals(pages.notifyMe.getFirstNameInputBorderColor(),  borderColorFirstName); }
    @Test (groups = "dws")
    public void labelFirstNameHighlight () {
        Assert.assertEquals(pages.notifyMe.getLabelFirstNameColor(), labelColor);
    }
    @Test (groups = "dws")
    public void asteriskFirstNameColor () {
        Assert.assertEquals(pages.notifyMe.getAsteriskFirstNameColor(), asteriskColor);
    }

    //Last Name Highlight for input border and label
    @Test (groups = "dws")
    public void lastNameHighlight () {
        Assert.assertEquals(pages.notifyMe.getLastNameInputBorderColor(), borderColor);
    }
    @Test (groups = "dws")
    public void labelLastNameHighlight () {
        Assert.assertEquals(pages.notifyMe.getLabelLastNameColor(), labelColor);
    }
    @Test (groups = "dws")
    public void asteriskLastNameColor () {
        Assert.assertEquals(pages.notifyMe.getAsteriskLastNameColor(), asteriskColor);
    }

    //Phone Highlight for input border and label
    @Test (groups = "dws")
    public void phoneHighlight () {
        Assert.assertEquals(pages.notifyMe.getPhoneNumInputBorderColor(), borderColor);
    }
    @Test (groups = "dws")
    public void labelPhoneHighlight () {
        Assert.assertEquals(pages.notifyMe.getLabelPhoneColor(), labelColor);
    }
    @Test (groups = "dws")
    public void asteriskPhoneColor () {
        Assert.assertEquals(pages.notifyMe.getAsteriskPhoneColor(), asteriskColor);
    }

    //Email Address Highlight for input border and label
    @Test (groups = "dws")
    public void emailHighlight () {
        Assert.assertEquals(pages.notifyMe.getEmailInputBorderColor(), borderColor);
    }
    @Test (groups = "dws")
    public void labelEmailAddressHighlight () {
        Assert.assertEquals(pages.notifyMe.getLabelEmailAddressColor(), labelColor);
    }
    @Test (groups = "dws")
    public void asteriskEmailAddressColor () {
        Assert.assertEquals(pages.notifyMe.getAsteriskEmailAddressColor(), asteriskColor);
    }
  /*  @Test (groups = "dws")
    public void asteriskNoteColor () {
        Assert.assertEquals(notifyMe.getAsteriskNoteColor(), asteriskColor);
    } */


}


