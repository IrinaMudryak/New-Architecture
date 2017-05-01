package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;

/**
 * Created by Home on 24.04.2017.
 */
public class DriverBaseHelper {
    protected static final Logger LOG = LogFactory.getLogger(DriverBaseHelper.class);
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected PageManager pages;
    protected ApplicationManager app;

    public DriverBaseHelper (ApplicationManager app) {
        this.app = app;
        driver = app.getWebDriver();
        wait = new WebDriverWait(driver,10);
        pages = new PageManager(driver);
    }
}
