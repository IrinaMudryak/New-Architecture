package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;

/**
 * Created by Home on 24.04.2017.
 */
public class BaseHelper {
    protected static final Logger LOG = LogFactory.getLogger(BaseHelper.class);
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected PageManager pages;
    protected ApplicationManager app;

    public BaseHelper(ApplicationManager app) {
        this.app = app;
        driver = app.getWebDriver();
        wait = new WebDriverWait(driver,10);
        pages = new PageManager(driver);
    }

    public boolean waitForJSandJQueryToLoad() {

        WebDriverWait wait = new WebDriverWait(driver, 30);

        // wait for jQuery to load
        ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    return ((Long) ((JavascriptExecutor) driver).executeScript("return jQuery.active") == 0);
                } catch (Exception e) {
                    // no jQuery present
                    return true;
                }
            }
        };

        // wait for Javascript to load
        ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState")
                        .toString().equals("complete");
            }
        };

        return wait.until(jQueryLoad) && wait.until(jsLoad);
    }

    public boolean waitUntilElementUsable(final WebElement element) {
        return  wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                try {
                    return element.isDisplayed();
                } catch (NoSuchElementException ex) {
                    return false;
                }
            }
        });
    }

    public boolean waitUntilElementEnabled(final WebElement element) {
        return  wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                try {
                    return element.isEnabled();
                } catch (NoSuchElementException ex) {
                    return false;
                }
            }
        });
    }

    public void checkCheckboxUniversal (WebElement element) {
        if (element.getAttribute("checked") == null) {
            waitUntilElementUsable(element);
            element.click();
            waitForJSandJQueryToLoad();
        }
    }

    public void fillInputField (WebElement element, CharSequence content){
        element.clear();
        element.sendKeys(content);

    }


}
