import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Home on 27.04.2017.
 */
public class PositiveTestTruckMode extends PositiveTestVehicleMode{
    @Test(groups = "dws", priority = 4)//select Limousine
    public void selectBodyStyle() {
        pages.notifyMe.setBodyStyle("4");
        pages.notifyMe.setType("1"); //select New
        pages.notifyMe.fillMinOdometer("10"); //enter min Price
        pages.notifyMe.fillMaxOdometer("120000"); //enter max Odometer
        pages.notifyMe.setTransmission("11885"); //select Transmission
    }
    @Test(groups = "dws", priority = 5)
    public void simpleWaitToWatch() throws InterruptedException, IOException {
        Thread.sleep(2000);
    } //simple Wait

}
