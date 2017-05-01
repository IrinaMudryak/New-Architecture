package utility;

import org.openqa.selenium.WebDriver;

/**
 * Created by Home on 24.04.2017.
 */
public class ApplicationManager {
    public NavigationHelper navHelper;
    public String baseUrl;
    public BrowserHelper browserHelper;
    public WebDriver driver;
    public MAP2Helper map2Helper;
    public UserHelper userHelper;

    public ApplicationManager (String browserName) {

        baseUrl = PropertyLoader.loadProperty("site.url");
        browserHelper = new BrowserHelper();
        driver = getBrowserHelper().runDriver(browserName);
        navHelper = new NavigationHelper(this);
        map2Helper = new MAP2Helper(this);
        userHelper = new UserHelper(this);
    }

    public NavigationHelper getNavigationHelper() {
        return navHelper;
    }

    public BrowserHelper getBrowserHelper() {
        return  browserHelper;
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    public UserHelper getUserHelper() { return userHelper;}

    public MAP2Helper getMap2Helper() {return map2Helper;}
}
