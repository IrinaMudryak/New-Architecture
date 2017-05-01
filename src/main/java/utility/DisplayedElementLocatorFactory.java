package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import java.lang.reflect.Field;

/**
 * Created by Home on 25.04.2017.
 */
public class DisplayedElementLocatorFactory extends AjaxElementLocatorFactory{
    private final WebDriver driver;
    private final int timeOutInSeconds;

    public DisplayedElementLocatorFactory (WebDriver driver, int timeOutInSeconds) {
        super(driver,timeOutInSeconds);
        this.driver = driver;
        this.timeOutInSeconds = timeOutInSeconds;
    }

    public ElementLocator createLocator (Field field) {
        return new DisplayedElementLocator(driver, field, timeOutInSeconds);
    }
}
