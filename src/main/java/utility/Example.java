package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Home on 08.05.2017.
 */
public class Example extends BaseHelper{

    public StringBuffer verificationErrors = new StringBuffer();

    public Example (ApplicationManager app) {
        super(app);
    }
  @Test(priority = 21)

    public void addNotifyMeWidget() throws Exception {
        app.getNavigationHelper().goToMAP2();
        pages.map2.clickNotifyTab();
       //add new page in MAP2Page
        pages.map2.clickAddPage();
        pages.notifyMePageInMAP2.setPageName();
        pages.notifyMePageInMAP2.clickIcoWidget();
        pages.notifyMePageInMAP2.setFilter();
        pages.notifyMePageInMAP2.addWidget();
        pages.notifyMePageInMAP2.openWidgetEditor();

        // need to write select form mode

        pages.widgetSettings.clickOk();







        driver.findElement(By.cssSelector(".mapx-button-ico.activate")).click();
        waitForJSandJQueryToLoad();
        driver.findElement(By.cssSelector(".mapx-button-ico.globe")).click();
        waitForJSandJQueryToLoad();
    }
}

/*  driver.findElement(By.xpath("//div[@class=\"xcol-lg-9 xcol-md-9\"]/input[@data-param=\"name\"]")).clear();
        waitForJSandJQueryToLoad();
        driver.findElement(By.xpath("//div[@class=\"xcol-lg-9 xcol-md-9\"]/input[@data-param=\"name\"]")).sendKeys("dealer-score-autotest");
        waitForJSandJQueryToLoad();
        driver.findElement(By.xpath("//div[@class=\"xcol-lg-9 xcol-md-9\"]/input[@data-param=\"title\"]")).clear();
        waitForJSandJQueryToLoad();
        driver.findElement(By.xpath("//div[@class=\"xcol-lg-9 xcol-md-9\"]/input[@data-param=\"title\"]")).sendKeys("dealer-score-autotest");
        waitForJSandJQueryToLoad();
        driver.findElement(By.xpath("//div[@class=\"xcol-lg-9 xcol-md-9\"]/input[@data-param=\"url\"]")).clear();
        waitForJSandJQueryToLoad();
        driver.findElement(By.xpath("//div[@class=\"xcol-lg-9 xcol-md-9\"]/input[@data-param=\"url\"]")).sendKeys("dealer-score-autotest");
        waitForJSandJQueryToLoad(); for custome page */
//app.getGroupHelper().turnCheckBoxLayOutTestingInMAP2();