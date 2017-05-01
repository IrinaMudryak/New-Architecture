package utility;

import dms.DmsHome;

/**
 * Created by Home on 27.04.2017.
 */
public class MAP2Helper extends DriverBaseHelper {

    String login = PropertyLoader.loadProperty("super.login");

    public MAP2Helper(ApplicationManager app) {
        super(app);
    }

    public DmsHome loginToDms(){
        pages.loginPage.loginInput.sendKeys(login);
        pages.loginPage.pwInput.sendKeys(PropertyLoader.loadProperty("super.pw"));
        pages.loginPage.submirButton.click();
        return pages.dmsHome;
    }

}
