package settings;

import utility.ApplicationManager;
import utility.BaseHelper;

/**
 * Created by Home on 31.05.2017.
 */
public class UserFunc extends BaseHelper {

    public UserFunc(ApplicationManager app) {
        super(app);
    }

    /*go to dms UsersPage page*/
    public UsersPage openUsersPage() {
        app.getWebDriver().get(app.baseUrl + "/dms/settings/users");
        return pages.users;
    }

    public void turnOnMap2OnRootUser() throws InterruptedException {
        openUsersPage();
        pages.users.openRootUserEditor();
        app.userEditorFunc.turnOnMap2();

    }


    // create a new manager and set accesses
    public void createManagerAndSetAccesses() throws InterruptedException {
        openUsersPage();
        pages.users.clickAddUser();
        pages.userEditor.addNewManager();
        pages.users.openLastUserEditor();
        pages.userEditor.clickAccessTab();
        app.userEditorFunc.turnOnMap2Checkbox();
        pages.userEditor.turnOnLeadsCRM();
        pages.userEditor.turnOnLeadsEmail();
        pages.userEditor.turnOnWebmail();
        pages.userEditor.turnOnWebsiteSettings();
        pages.userEditor.clickSaveBtn();
    }
}
