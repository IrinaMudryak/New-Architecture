package utility;

/**
 * Created by Home on 28.04.2017.
 */
public class UserHelper extends DriverBaseHelper{
   public UserHelper (ApplicationManager app) {
        super(app);
    }

    public void createManagerAndSetAccesses() throws InterruptedException {
        app.getNavigationHelper().openUsersPage()
                   .openUserEditor()
                   .turnOnMap2()
                   .clickAddUser()
                   .addNewManager()
                   .openLastUserEditor()
                   .clickAccessTab()
                   .turnOnMap2Checkbox()
                  .turnOnLeadsCRM()
                  .turnOnLeadsEmail()
                  .turnOnWebmail()
                  .turnOnWebsiteSettings()
                  .clickSaveBtn();
           }

}
