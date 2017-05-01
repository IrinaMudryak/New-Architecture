import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Home on 27.04.2017.
 */
public class PositiveTestVehicleMode extends TestBaseDws {
    @Test(groups = "dws")
    public void enterFirstName() {
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

    }

    @Test(groups = "dws", priority = 0)
    public void selectMotorizedType() {
        pages.notifyMe.setMotorisedType("3");
    } //select Car&Trucks&Vans
    @Test(groups = "dws", priority = 1)
    public void simpleWait() throws InterruptedException, IOException {
        Thread.sleep(2000);
    } //simple Wait

    @Test(groups = "dws", priority = 2)//select Make "BMW"
    public void selectMake()  {
        pages.notifyMe.setMake("10");
    }
    @Test(groups = "dws", priority = 3)
    public void selectModel() {
        pages.notifyMe.setModel("271351"); //select Model
    }


}

