package utility;

import customers.LeadsPage;
import dms.DmsHomePage;
import dms.LoginPage;
import dms.SiteEditorPage;
import dmsDealers.DealersPage;
import dmsDealers.SitePackagePage;
import map2.MAP2Page;
import map2.NotifyMePageInMAP2;
import map2.WidgetSettingsPage;
import notifiMeForm.NotifyMeFormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import settings.*;
import webmail.EmailDetails;
import webmail.EmailsList;
import webmail.WebMailLogin;


/**
 * Created by Irina Mudryak on 24.04.2017.
 */
public class PageManager {
    private WebDriver driver;
    public NotifyMeFormPage notifyMe;
    public LoginPage loginPage;
    public DmsHomePage dmsHome;
    public MAP2Page map2;
    public NotifyMePageInMAP2 notifyMePageInMAP2;
    public SiteEditorPage siteEditor;
    public DealersPage dealers;
    public SitePackagePage sitePackage;
    public LeadsEmailPage leadsEmail;
    public LocalizationPage localization;
    public SitesPage sites;
    public UserEditorPage userEditor;
    public UsersPage users;
    public WebsitePage website;
    public LeadsPage leads;
    public EmailsList emailsList;
    public EmailDetails emailDetails;
    public WebMailLogin webMailLogin;
    public DealershipGeneralInformationPage dealershipGeneralInformation;
    public WidgetSettingsPage widgetSettings;



    public PageManager (WebDriver driver) {
        this.driver=driver;
        notifyMe = initElements(new NotifyMeFormPage(this));
        loginPage = initElements(new LoginPage(this));
        dmsHome = initElements(new DmsHomePage(this));
        map2 = initElements(new MAP2Page(this));
        notifyMePageInMAP2 = initElements(new NotifyMePageInMAP2(this));
        siteEditor = initElements(new SiteEditorPage(this));
        dealers = initElements(new DealersPage(this));
        sitePackage = initElements(new SitePackagePage(this));
        leadsEmail = initElements(new LeadsEmailPage(this));
        localization = initElements(new LocalizationPage(this));
        sites = initElements(new SitesPage(this));
        userEditor = initElements(new UserEditorPage(this));
        users = initElements(new UsersPage(this));
        website = initElements(new WebsitePage(this));
        leads = initElements(new LeadsPage(this));
        emailDetails = initElements(new EmailDetails(this));
        emailsList = initElements(new EmailsList(this));
        webMailLogin = initElements(new WebMailLogin(this));
        dealershipGeneralInformation = initElements(new DealershipGeneralInformationPage(this));
        widgetSettings = initElements(new WidgetSettingsPage(this));


    }

    private <T extends Page> T initElements (T page){
       PageFactory.initElements(new AjaxElementLocatorFactory(driver,90), page);
        return page;
      }

      public WebDriver getWebDriver(){
        return driver;
      }

     }
