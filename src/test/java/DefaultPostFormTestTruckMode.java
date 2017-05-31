import static org.testng.Assert.*;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Home on 27.04.2017.
 */
public class DefaultPostFormTestTruckMode extends TestBaseDws {
    @Test(groups = "dws")//select Limousine
    public void selectBodyStyle() {
        app.notifyMeFormFunc.fillFormTruckMode();
        pages.notifyMe.clickOnSubmit();
        assertEquals(pages.notifyMe.postFormGetText(), "Your request has been received.\n" +
                "A customer service representative will contact you shortly to complete the transaction.\n" +
                "\n" +
                "Thank you for using " + dealershipName + " service.\n" +
                "\n" +
                "OK");
    }

    }



