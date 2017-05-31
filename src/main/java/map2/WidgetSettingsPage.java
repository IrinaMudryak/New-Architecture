package map2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.Page;
import utility.PageManager;

/**
 * Created by Home on 09.05.2017.
 */
public class WidgetSettingsPage extends Page {

    public WidgetSettingsPage(PageManager pages) {
        super(pages);
    }

    @FindBy (how = How.XPATH, using = "//span[.='Ok']")
    private WebElement buttonOk;

   // @FindBy (how = )



    public void clickOk() {
        buttonOk.click();
        waitForJSandJQueryToLoad();
    }
}
