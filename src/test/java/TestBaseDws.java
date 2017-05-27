import org.openqa.selenium.WebDriver;
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


        app.dmsHelper.loginToDms();
        app.userHelper.turnOnMap2OnRootUser();
        app.userHelper.createManagerAndSetAccesses();
        app.navHelper.openSettingsWebsiteGeneral();
        pages.website.disableCaptcha();
        pages.website.setjQueryVersion();
        app.navHelper.openDealershipGeneralInformation();
        dealershipName = pages.dealershipGeneralInformation.getDealershipName();
        //app.map2Helper.createNotifyMePage();

      }


     @BeforeClass
     public void openTestUrl(){
      app.navHelper.openNotifyMePage();
     }





   @AfterSuite
        public void stop() {
      app.getWebDriverFactory().stopBrowser();
  }

}

