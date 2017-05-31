import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Home on 27.04.2017.
 */
public class DefaultPostFormTestVehicleMode extends TestBaseDws {



    @Test(groups = "dws")
    public void fillFormandChecknotification() {
        app.notifyMeFormFunc.fillFormVehicleMode();
        pages.notifyMe.clickOnSubmit();
        assertEquals(pages.notifyMe.postFormGetText(), "Your request has been received.\n" +
                "A customer service representative will contact you shortly to complete the transaction.\n" +
                "\n" +
                "Thank you for using " + dealershipName + " service.\n" +
                "\n" +
                "OK");
    }


}






