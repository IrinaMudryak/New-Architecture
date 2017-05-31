package utility;

import dms.LoginPage;
import map2.MAP2Page;
import notifiMeForm.NotifyMeFormPage;
import settings.UsersPage;
import settings.WebsitePage;


/**
 * Created by Home on 24.04.2017.
 */
public class NavigationHelper extends BaseHelper {

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

    //go to DMS-Settings-WebsitePage-General
    public WebsitePage openSettingsWebsiteGeneral() {
    app.getWebDriver().get(app.baseUrl + "/dms/settings/website#general");
    return pages.website;
    }


    /*go to dms UsersPage page*/
    public UsersPage openUsersPage() {
         app.getWebDriver().get(app.baseUrl + "/dms/settings/users");
         return pages.users;
    }

    public MAP2Page goToMAP2() {
       app.getWebDriver().get(app.baseUrl + "/dms/tools/make_a_page_2");
        return pages.map2;
    }

    public void openDealershipGeneralInformation() {
        app.getWebDriver().get(app.baseUrl + "/dms/settings/dealership#general-information");
    }


}
