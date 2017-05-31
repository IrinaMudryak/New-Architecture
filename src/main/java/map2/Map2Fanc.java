package map2;

import org.openqa.selenium.By;
import utility.ApplicationManager;
import utility.BaseHelper;

/**
 * Created by Home on 31.05.2017.
 */
public class Map2Fanc extends BaseHelper {

    public Map2Fanc(ApplicationManager app) {
        super(app);
    }

    public MAP2Page goToMAP2() {
        app.getWebDriver().get(app.baseUrl + "/dms/tools/make_a_page_2");
        return pages.map2;
    }

    public void addNotifyMeWidget() throws Exception {
        goToMAP2();
        pages.map2.clickNotifyTab();
        //add new page in MAP2Page
        pages.map2.clickAddPage();
        app.notifyMeInMAP2Func.setPageName();
        pages.notifyMePageInMAP2.clickIcoWidget();
        pages.notifyMePageInMAP2.setFilter();
        app.notifyMeInMAP2Func.addWidget();
        pages.notifyMePageInMAP2.openWidgetEditor();

        // need to write select form mode

        pages.widgetSettings.clickOk();

        driver.findElement(By.cssSelector(".mapx-button-ico.activate")).click();
        waitForJSandJQueryToLoad();
        driver.findElement(By.cssSelector(".mapx-button-ico.globe")).click();
        waitForJSandJQueryToLoad();
    }
}
