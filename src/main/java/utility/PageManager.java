package utility;

import customers.Leads;
import dms.DmsHome;
import dms.LoginPage;
import dms.SiteEditor;
import dmsDealers.Dealers;
import dmsDealers.SitePackage;
import map2.MAP2;
import map2.NotifyMePageInMAP2;
import map2.WidgetSettings;
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
    public DmsHome dmsHome;
    public MAP2 map2;
    public NotifyMePageInMAP2 notifyMePageInMAP2;
    public SiteEditor siteEditor;
    public Dealers dealers;
    public SitePackage sitePackage;
    public LeadsEmail leadsEmail;
    public Localization localization;
    public Sites sites;
    public UserEditor userEditor;
    public Users users;
    public Website website;
    public Leads leads;
    public EmailsList emailsList;
    public EmailDetails emailDetails;
    public WebMailLogin webMailLogin;
    public DealershipGeneralInformation dealershipGeneralInformation;
    public WidgetSettings widgetSettings;



    public PageManager (WebDriver driver) {
        this.driver=driver;
        notifyMe = initElements(new NotifyMeFormPage(this));
        loginPage = initElements(new LoginPage(this));
        dmsHome = initElements(new DmsHome(this));
        map2 = initElements(new MAP2(this));
        notifyMePageInMAP2 = initElements(new NotifyMePageInMAP2(this));
        siteEditor = initElements(new SiteEditor(this));
        dealers = initElements(new Dealers(this));
        sitePackage = initElements(new SitePackage(this));
        leadsEmail = initElements(new LeadsEmail(this));
        localization = initElements(new Localization(this));
        sites = initElements(new Sites(this));
        userEditor = initElements(new UserEditor(this));
        users = initElements(new Users(this));
        website = initElements(new Website(this));
        leads = initElements(new Leads(this));
        emailDetails = initElements(new EmailDetails(this));
        emailsList = initElements(new EmailsList(this));
        webMailLogin = initElements(new WebMailLogin(this));
        dealershipGeneralInformation = initElements(new DealershipGeneralInformation(this));
        widgetSettings = initElements(new WidgetSettings(this));


    }

    private <T extends Page> T initElements (T page){
       PageFactory.initElements(new AjaxElementLocatorFactory(driver,90), page);
        return page;
      }

      public WebDriver getWebDriver(){
        return driver;
      }

     }
