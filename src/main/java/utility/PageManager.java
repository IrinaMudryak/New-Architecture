package utility;

import customers.Leads;
import dms.DmsHome;
import dms.LoginPage;
import dms.SiteEditor;
import dmsDealers.Dealers;
import dmsDealers.SitePackage;
import dmsInventory.Inventory;
import dmsInventory.UploadWizard;
import map2.NewPageAttributes;
import map2.MAP2;
import map2.NotifyMeWidgetSettings;
import notifiMeForm.NotifyMeFormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import settings.*;


/**
 * Created by Irina Mudryak on 24.04.2017.
 */
public class PageManager {
    private WebDriver driver;
    public NotifyMeFormPage notifyMe;
    public LoginPage loginPage;
    public DmsHome dmsHome;
    public MAP2 map2;
    public NotifyMeWidgetSettings notifyMeWidgetSettings;
    public NewPageAttributes newPageAttr;
    public SiteEditor siteEditor;
    public Dealers dealers;
    public SitePackage sitePackage;
    public Inventory inventory;
    public UploadWizard wizard;
    public LeadsEmail leadsEmail;
    public Localization localization;
    public Sites sites;
    public UserEditor editor;
    public Users users;
    public Website website;
    public Leads leads;



    public PageManager (WebDriver driver) {
        this.driver=driver;
        notifyMe = initElements(new NotifyMeFormPage(this));
        loginPage = initElements(new LoginPage(this));
        dmsHome = initElements(new DmsHome(this));
        map2 = initElements(new MAP2(this));
        notifyMeWidgetSettings = initElements(new NotifyMeWidgetSettings(this));
        newPageAttr = initElements(new NewPageAttributes(this));
        siteEditor = initElements(new SiteEditor(this));
        dealers = initElements(new Dealers(this));
        sitePackage = initElements(new SitePackage(this));
        inventory = initElements(new Inventory(this));
        wizard = initElements(new UploadWizard(this));
        leadsEmail = initElements(new LeadsEmail(this));
        localization = initElements(new Localization(this));
        sites = initElements(new Sites(this));
        editor = initElements(new UserEditor(this));
        users = initElements(new Users(this));
        website = initElements(new Website(this));
        leads = initElements(new Leads(this));

    }

    private <T extends Page> T initElements (T page){
      // PageFactory.initElements(new AjaxElementLocatorFactory(driver,10), page);
       PageFactory.initElements(new DisplayedElementLocatorFactory(driver,10), page);
        return page;
      }

      public WebDriver getWebDriver(){
        return driver;
      }

     }
