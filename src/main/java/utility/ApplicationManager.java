package utility;

import dms.LoginFunc;
import map2.Map2Fanc;
import map2.NotifyMePageInMAP2Func;
import notifiMeForm.NotifyMeFormFunc;
import org.openqa.selenium.WebDriver;
import settings.DealershipGeneralInformationFunc;
import settings.UserEditorFunc;
import settings.UserFunc;
import settings.WebsiteFunc;

/**
 * Created by Home on 24.04.2017.
 */
public class ApplicationManager {
    public String baseUrl;
    public WebDriver driver;
    public WebDriverFactory webDriverFactory;
    public FormHelper formHelper;
    public UserEditorFunc userEditorFunc;
    public LoginFunc loginFunc;
    public NotifyMeFormFunc notifyMeFormFunc;
    public WebsiteFunc websiteFunc;
    public UserFunc userFunc;
    public Map2Fanc map2Fanc;
    public DealershipGeneralInformationFunc dealershipGeneralFunc;
    public NotifyMePageInMAP2Func notifyMeInMAP2Func;

    public ApplicationManager (String browserName) {

        baseUrl = PropertyLoader.loadProperty("site.url");
        webDriverFactory = new WebDriverFactory();
        driver = getWebDriverFactory().openBrowser(browserName);
        formHelper = new FormHelper(this);
        userEditorFunc = new UserEditorFunc(this);
        loginFunc = new LoginFunc(this);
        notifyMeFormFunc = new NotifyMeFormFunc(this);
        websiteFunc = new WebsiteFunc(this);
        userFunc = new UserFunc(this);
        map2Fanc = new Map2Fanc(this);
        dealershipGeneralFunc = new DealershipGeneralInformationFunc(this);
        notifyMeInMAP2Func = new NotifyMePageInMAP2Func(this);


    }

    public WebDriverFactory getWebDriverFactory () {return webDriverFactory;}

    public WebDriver getWebDriver() {
        return driver;
    }





}
