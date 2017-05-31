package utility;

import dms.LoginFunc;
import notifiMeForm.NotifyMeFormFunc;
import org.openqa.selenium.WebDriver;
import settings.UserEditorFunc;

/**
 * Created by Home on 24.04.2017.
 */
public class ApplicationManager {
    public NavigationHelper navHelper;
    public String baseUrl;
    public WebDriver driver;
    public UserHelper userHelper;
    public WebDriverFactory webDriverFactory;
    public FormHelper formHelper;
    public UserEditorFunc userEditorFunc;
    public LoginFunc loginFunc;
    public NotifyMeFormFunc notifyMeFormFunc;

    public ApplicationManager (String browserName) {

        baseUrl = PropertyLoader.loadProperty("site.url");
        webDriverFactory = new WebDriverFactory();
        driver = getWebDriverFactory().openBrowser(browserName);
        navHelper = new NavigationHelper(this);
        userHelper = new UserHelper(this);
        formHelper = new FormHelper(this);
        userEditorFunc = new UserEditorFunc(this);
        loginFunc = new LoginFunc(this);
        notifyMeFormFunc = new NotifyMeFormFunc(this);

    }

    public WebDriverFactory getWebDriverFactory () {return webDriverFactory;}

    public NavigationHelper getNavigationHelper() {
        return navHelper;
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    public UserHelper getUserHelper() { return userHelper;}



}
