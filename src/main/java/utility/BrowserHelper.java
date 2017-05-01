package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;

import java.util.concurrent.TimeUnit;

/**
 * Created by Home on 24.04.2017.
 */
public class BrowserHelper {
    private WebDriver driver;
    protected static final Logger LOG = LogFactory.getLogger(DriverBaseHelper.class);


    public WebDriver runDriver (String browserName) {

        driver = WebDriverFactory.getInstance(browserName);
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        return driver;
    }

    public void stopBrowser() {
        if (driver != null) {
            LOG.info("Killing web driver");
            WebDriverFactory.killDriverInstance();
        }
    }

    public boolean waitForJSandJQueryToLoad() {

        WebDriverWait wait = new WebDriverWait(driver, 30);

        // wait for jQuery to load
        ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    return ((Long)((JavascriptExecutor)driver).executeScript("return jQuery.active") == 0);
                }
                catch (Exception e) {
                    // no jQuery present
                    return true;
                }
            }
        };

        // wait for Javascript to load
        ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor)driver).executeScript("return document.readyState")
                        .toString().equals("complete");
            }
        };

        return wait.until(jQueryLoad) && wait.until(jsLoad);
    }

}
