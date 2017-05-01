package utility;

import dms.LoginPage;
import notifiMeForm.NotifyMeFormPage;
import settings.Users;
import settings.Website;


/**
 * Created by Home on 24.04.2017.
 */
public class NavigationHelper extends DriverBaseHelper {

    public NavigationHelper (ApplicationManager app) {
        super(app);
          }

    //open DWS Notify Me page
    public NotifyMeFormPage openNotifyMePage() {
        app.getWebDriver().get(app.baseUrl + "/notify");
        return pages.notifyMe;

    }

    // open DMS- Login page
    public LoginPage openLoginPage() {
        app.getWebDriver().get(app.baseUrl + "/dms/login");
        return pages.loginPage;
    }

    //go to DMS-Settings-Website-General
    public Website openSettingsWebsiteGeneral() {
    app.getWebDriver().get(app.baseUrl + "/dms/settings/website#general");
        app.getBrowserHelper().waitForJSandJQueryToLoad();
        return pages.website;
    }


    /*go to dms Users page*/
    public Users openUsersPage() {
         app.getWebDriver().get(app.baseUrl + "/dms/settings/users");
         app.getBrowserHelper().waitForJSandJQueryToLoad();
        return pages.users;
    }


}
