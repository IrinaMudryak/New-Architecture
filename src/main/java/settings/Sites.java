package settings;

import dms.SiteEditor;
import map2.MAP2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.Page;
import utility.PageManager;

/**
 * Created by Home on 27.04.2017.
 */
public class Sites extends Page {

    public Sites (PageManager pages){
        super(pages);
    }

    /*declare elements on the page*/
    @FindBy(how = How.CSS, using = "div#sites_tree ul:first-child li.open.last > a")
    private WebElement rootSite;

    @FindBy(how = How.CSS, using = "a[href='/dms/tools']")
    private WebElement toolsMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/tools/make_a_page_2']")
    private WebElement map2MenuItem;

    @FindBy(how = How.XPATH, using = "//div[@aria-labelledby='ui-dialog-title-site_editor']")
    private WebElement siteEditorWindow;

    @FindBy(how = How.CSS, using = "a[href='/dms/settings']")
    private WebElement settingsMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/settings/website']")
    private WebElement websiteMenuItem;

    /*open Site Editor popup on the root site*/
    public SiteEditor openSiteEditor() {
        Actions action = new Actions(driver);
        Action dblclick = action.doubleClick(rootSite).build();
        dblclick.perform();
        waitForJSandJQueryToLoad();
        return pages.siteEditor;
    }

       /*go to dms Website General page*/
    public Website clickOnWebsiteMenu() {
        Actions action = new Actions(driver);
        Action moveToElem = action.moveToElement(settingsMenuItem).build();
        moveToElem.perform();
        websiteMenuItem.click();
        waitForJSandJQueryToLoad();
        return pages.website;
    }


}
