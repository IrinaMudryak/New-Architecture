package notifiMeForm;

import utility.ApplicationManager;
import utility.BaseHelper;
import utility.WebDriverFactory;

import static org.openqa.selenium.remote.BrowserType.CHROME;
import static utility.WebDriverFactory.FIREFOX;

/**
 * Created by Home on 31.05.2017.
 */
public class NotifyMeFormFunc extends BaseHelper {

        private String borderColor;
        private String labelColor;
        private String borderColorFirstName;
        private String asteriskColor;

    public NotifyMeFormFunc (ApplicationManager app){
        super(app);
    }

       //open DWS Notify Me page
    public NotifyMeFormPage openNotifyMePage() {
        app.getWebDriver().get(app.baseUrl + "/notify");
        return pages.notifyMe;

    }

    public void fillFormVehicleMode (){
        pages.notifyMe.setMinYear("2000"); //select min Year=2000
        pages.notifyMe.setMaxYear("2017"); //select max Year=2017
        pages.notifyMe.fillMinPrice("1000"); //enter min Price
        pages.notifyMe.fillMaxPrice("200000"); //enter max Price
        pages.notifyMe.fillFirstName("Sofie");
        pages.notifyMe.fillLastName("Sonnenschein");
        pages.notifyMe.fillPhoneField("333-333-4444");
        pages.notifyMe.fillEmail("test_10@dxloo.com");
        pages.notifyMe.setFrequency("3"); //select Frequency= Bi-Weekly
        pages.notifyMe.setExpires("7"); //select Expires = 6 Weeks
        pages.notifyMe.setMotorisedType("3"); //select Car&Trucks&Vans
        pages.notifyMe.setMake("10");
        pages.notifyMe.setModel("271351");

    }

    public void fillFormTruckMode(){
        fillFormVehicleMode();
        pages.notifyMe.setBodyStyle("4");
        pages.notifyMe.setType("1"); //select New
        pages.notifyMe.fillMinOdometer("10"); //enter min Price
        pages.notifyMe.fillMaxOdometer("120000"); //enter max Odometer
        pages.notifyMe.setTransmission("11885"); //select Transmission
    }

    public void clearRequiredFields(){
        pages.notifyMe.clearFirstName()
                .clearLastName()
                .clearEmail()
                .clearPhoneField();
    }


}


