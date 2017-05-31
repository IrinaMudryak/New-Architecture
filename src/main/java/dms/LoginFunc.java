package dms;

import utility.ApplicationManager;
import utility.BaseHelper;
import utility.PropertyLoader;

/**
 * Created by Home on 31.05.2017.
 */
public class LoginFunc extends BaseHelper {

    String login = PropertyLoader.loadProperty("super.login");

    public LoginFunc (ApplicationManager app){
        super(app);
    }

    // open DMS- Login page
    public LoginPage openLoginPage() {
        app.getWebDriver().get(app.baseUrl + "/dms/login");
        return pages.loginPage;
    }

    public void loginToDms(){
        openLoginPage();
        fillInputField(pages.loginPage.getLoginInput(), login);
        fillInputField(pages.loginPage.getPwInput(), PropertyLoader.loadProperty("super.pw"));
        pages.loginPage.getSubmitButton().click();
    }
}
