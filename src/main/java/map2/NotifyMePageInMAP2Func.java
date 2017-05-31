package map2;

import org.openqa.selenium.interactions.Actions;
import utility.ApplicationManager;
import utility.BaseHelper;

import static org.testng.Assert.assertEquals;

/**
 * Created by Home on 31.05.2017.
 */
public class NotifyMePageInMAP2Func extends BaseHelper {
    public StringBuffer verificationErrors = new StringBuffer();

    public NotifyMePageInMAP2Func(ApplicationManager app) {
        super(app);
    }

    public void addWidget() {
        Actions builder = new Actions(driver);
        builder.dragAndDrop(pages.notifyMePageInMAP2.getNotifyIconTree(), pages.notifyMePageInMAP2.getTarget()).perform();
        try {
            assertEquals("Dropped!", pages.notifyMePageInMAP2.getTarget().getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        waitForJSandJQueryToLoad();
    }

    public void setPageName() {
        fillInputField(pages.notifyMePageInMAP2.getNameInput(), "notifyauto");
    }
}
