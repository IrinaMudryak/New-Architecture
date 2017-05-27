package utility;

import dms.DmsHome;

/**
 * Created by Home on 27.04.2017.
 */
public class DmsHelper extends BaseHelper {

    String login = PropertyLoader.loadProperty("super.login");

    public DmsHelper(ApplicationManager app) {
        super(app);
    }

    public DmsHome loginToDms(){
        app.navHelper.openLoginPage();
        pages.loginPage.loginInput.clear();
        pages.loginPage.loginInput.sendKeys(login);
        pages.loginPage.pwInput.clear();
        pages.loginPage.pwInput.sendKeys(PropertyLoader.loadProperty("super.pw"));
        pages.loginPage.submirButton.click();
        return pages.dmsHome;
    }

}
