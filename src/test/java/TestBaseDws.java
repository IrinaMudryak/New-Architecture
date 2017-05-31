import org.slf4j.Logger;
import org.testng.annotations.*;
import utility.*;



/**
 * Created by Home on 24.04.2017.
 */
public class TestBaseDws {

    private static final Logger LOG = LogFactory.getLogger(TestBaseDws.class);
    public static ApplicationManager app;
    public static PageManager pages;
    public  static String dealershipName;

  @BeforeSuite
    @Parameters({"browserName"})
    public void preparatios(String browserName) throws InterruptedException {

        LOG.info("Navigating to test url");

        app = new ApplicationManager(browserName);
        pages = new PageManager(app.getWebDriver());


        app.loginFunc.loginToDms();
        app.userFunc.turnOnMap2OnRootUser();
        //app.userFunc.createManagerAndSetAccesses();
        app.websiteFunc.openSettingsWebsiteGeneral();
        pages.website.disableCaptcha();
        pages.website.setjQueryVersionMAP2();
        app.dealershipGeneralFunc.openDealershipGeneralInformation();
        dealershipName = pages.dealershipGeneralInformation.getDealershipName();//save Dealership Name
        //app.map2Helper.createNotifyMePage();

      }


     @BeforeClass
     public void openTestUrl(){
      app.notifyMeFormFunc.openNotifyMePage();
     }





   @AfterSuite
        public void stop() {
      app.getWebDriverFactory().stopBrowser();
  }

}

