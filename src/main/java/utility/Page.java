package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Home on 24.04.2017.
 */
public class Page {
    //объявление класса
    //   private static final Logger LOG = LogFactory.getLogger(Page.class);

    protected WebDriver driver; //объявление переменной driver класса WebDriver доступна классам потомкам
    protected PageManager pages;
    protected WebDriverWait wait;
	/*
	 * Constructor injecting the WebDriver interface
	 *
	 * @param webDriver
	 */

    public Page(PageManager pages) {
        this.pages = pages;
        driver = pages.getWebDriver();
        wait = new WebDriverWait(driver, 10);
    } //конструктор класса принимает на входе переменную класса WebDriver возвращает класс

    public WebDriver getWebDriver() {
        return driver;
    } //метод getWebDriver() возвращает переменную driver

    public String getTitle() {
        return driver.getTitle();
    } //метод getTitle() возвращает заголовок страницы

    public String getPageUrl() {               //метод getPageUrl() возвращает текуший URL
        String pageUrl = driver.getCurrentUrl();
        //      LOG.info("Current page url is: " + pageUrl);
        return pageUrl;
    }

    public Page ensurePageLoaded() {
        return this;
    }

    public boolean waitPageLoaded() {
        try {
            ensurePageLoaded();
            return true;
        } catch (TimeoutException to) {
            return false;
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
