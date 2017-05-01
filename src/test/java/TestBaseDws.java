import org.slf4j.Logger;
import org.testng.annotations.*;
import utility.*;



/**
 * Created by Home on 24.04.2017.
 */
public class TestBaseDws {

    private static final Logger LOG = LogFactory.getLogger(TestBaseDws.class);
    public ApplicationManager app;
    public PageManager pages;

  @BeforeSuite
    @Parameters({"browserName"})
    public void turnOnMap2(String browserName) throws InterruptedException {

        LOG.info("Navigating to test url");

        app = new ApplicationManager(browserName);
        pages = new PageManager(app.getWebDriver());
        app.getNavigationHelper().openLoginPage();
        app.map2Helper.loginToDms();
        app.getUserHelper().createManagerAndSetAccesses();
        app.getNavigationHelper().openSettingsWebsiteGeneral()
                .disableCaptcha()
                .setjQueryVersion();
        app.getBrowserHelper().stopBrowser();

        }


    @BeforeClass
    @Parameters({ "browserName" })
    public void setup(String browserName) throws Exception {

        app = new ApplicationManager(browserName);
        pages = new PageManager(app.getWebDriver());

         }


    @AfterClass
    public void stop() {
        app.getBrowserHelper().stopBrowser();
    }

}

