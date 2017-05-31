package utility;

/**
 * Created by Home on 28.04.2017.
 */
public class UserHelper extends BaseHelper {
   public UserHelper (ApplicationManager app) {
        super(app);
    }

    public void createManagerAndSetAccesses() throws InterruptedException {
          app.getNavigationHelper().openUsersPage();

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

        public void turnOnMap2OnRootUser() throws InterruptedException {
            app.getNavigationHelper().openUsersPage();
            pages.users.openRootUserEditor();
            app.userEditorFunc.turnOnMap2();

        }



}
