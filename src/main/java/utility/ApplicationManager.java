package utility;

import org.openqa.selenium.WebDriver;

/**
 * Created by Home on 24.04.2017.
 */
public class ApplicationManager {
    public NavigationHelper navHelper;
    public String baseUrl;
    public WebDriver driver;
    public DmsHelper dmsHelper;
    public UserHelper userHelper;
    public WebDriverFactory webDriverFactory;
    public FormHelper formHelper;

    public ApplicationManager (String browserName) {

        baseUrl = PropertyLoader.loadProperty("site.url");
        webDriverFactory = new WebDriverFactory();
        driver = getWebDriverFactory().openBrowser(browserName);
        navHelper = new NavigationHelper(this);
        dmsHelper = new DmsHelper(this);
        userHelper = new UserHelper(this);
        formHelper = new FormHelper(this);

    }

    public WebDriverFactory getWebDriverFactory () {return webDriverFactory;}

    public NavigationHelper getNavigationHelper() {
        return navHelper;
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    public UserHelper getUserHelper() { return userHelper;}

    public DmsHelper getDmsHelper() {return dmsHelper;}

}
