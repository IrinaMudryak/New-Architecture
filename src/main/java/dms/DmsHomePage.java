package dms;

import customers.LeadsPage;
import dmsDealers.DealersPage;
import map2.MAP2Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import settings.SitesPage;
import settings.WebsitePage;
import utility.Page;
import utility.PageManager;
import webmail.EmailsList;
import webmail.WebMailLogin;


/**
 * Created by Home on 27.04.2017.
 */
public class DmsHomePage extends Page {
    public DmsHomePage(PageManager pages){
        super(pages);
    }

    /*declare elements on the page*/

    @FindBy(how = How.XPATH, using = "(//a[contains(text(), 'Admin')])[1]")
    private WebElement adminMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/admin/dealers']")
    private WebElement dealersMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/tools']")
    private WebElement toolsMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/tools/make_a_page_2']")
    private WebElement map2MenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/settings']")
    private WebElement settingsMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/settings/website']")
    private WebElement websiteMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/settings/sites']")
    private WebElement sitesMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/settings/users']")
    private WebElement usersMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/customers']")
    private WebElement customersMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/customers/leads']")
    private WebElement leadsMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/email']")
    private WebElement webmailMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/inventory']")
    private WebElement inventoryMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/inventory/wizard']")
    private WebElement uploadWizardMenuItem;


    /*go to dms DealersPage page*/
    public DealersPage clickOnDealersMenu() {
        /*move mouse on Admin menu item*/
        Actions action = new Actions(driver);
        Action moveToElem = action.moveToElement(adminMenuItem).build();
        moveToElem.perform();
        dealersMenuItem.click();
        return pages.dealers;
    }

    /*go to dms MAP2Page page*/
    public MAP2Page clickOnMap2Menu() {
        Actions action = new Actions(driver);
        Action moveToElem = action.moveToElement(toolsMenuItem).build();
        moveToElem.perform();
        map2MenuItem.click();
        return pages.map2;
    }

    /*go to dms WebsitePage General page*/
    public WebsitePage clickOnWebsiteMenu() {
        Actions action = new Actions(driver);
        Action moveToElem = action.moveToElement(settingsMenuItem).build();
        moveToElem.perform();
        websiteMenuItem.click();
        return pages.website;
    }


    /*go to dms SitesPage page*/
    public SitesPage clickOnSitesMenu() {
        Actions action = new Actions(driver);
        Action moveToElem = action.moveToElement(settingsMenuItem).build();
        moveToElem.perform();
        sitesMenuItem.click();
        return pages.sites;
    }


    /*go to dms Customers LeadsPage page*/
    public LeadsPage clickOnLeadsMenu() {
        Actions action = new Actions(driver);
        Action moveToElem = action.moveToElement(customersMenuItem).build();
        moveToElem.perform();
        leadsMenuItem.click();
        return pages.leads;
    }

    /*go to Webmail login page*/
    public WebMailLogin clickOnWebmailMenu() {
        webmailMenuItem.click();
        return pages.webMailLogin;
    }

    /*go to Webmail page*/
    public EmailsList clickOnWebmailMenu2() {
        webmailMenuItem.click();
        return pages.emailsList;
    }



}
