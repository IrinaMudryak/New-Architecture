package dms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import settings.SitesPage;
import utility.LogFactory;
import utility.Page;
import utility.PageManager;

/**
 * Created by Home on 27.04.2017.
 */
public class SiteEditorPage extends Page {
    private static final Logger LOG = LogFactory.getLogger(SiteEditorPage.class);

    public SiteEditorPage(PageManager pages) {
        super(pages);
    }

    /*declare elements on the page*/

    @FindBy(how = How.CSS, using = "span#site_pages_open a")
    private WebElement pagesBtn;

    @FindBy(how = How.CSS, using = "span#site_widgets_open a")
    private WebElement widgetsBtn;

    @FindBy(how = How.ID, using = "page_contact_us")
    private WebElement contactPageCheckbox;

    @FindBy(how = How.ID, using = "dws_contact_us")
    private WebElement contactWidgetCheckbox;

    @FindBy(how = How.ID, using = "page_trade_in")
    private WebElement tradeInPageCheckbox;

    @FindBy(how = How.ID, using = "dws_form_trade_in")
    private WebElement tradeInWidgetCheckbox;

    @FindBy(how = How.ID, using = "dws_search_advanced_horizontal")
    private WebElement advSearchHorizWidgetCheckbox;

    @FindBy(how = How.XPATH, using = "(//div[@class='ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix']/a)[1]")
    private WebElement crossPage;

    @FindBy(how = How.XPATH, using = "(//div[@class='ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix']/a)[2]")
    private WebElement crossWidget;

    @FindBy(how = How.XPATH, using = "//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']/span[contains(text(), 'Ok')]")
    private WebElement okBtn;

    /*turn off Contact Us page in access*/
    public SitesPage turnOffPageSite() {
        LOG.info("Click on pages button");
        pagesBtn.click();
        LOG.info("Turn off contact us checkbox, if it is selected");
        /*click on Contact Us checkbox only if it is checked*/
        if (contactPageCheckbox.isSelected()) {
            contactPageCheckbox.click();
        }
        LOG.info("Click on cross");
        crossPage.click();
        LOG.info("Click OK button");
        okBtn.click();
        return PageFactory.initElements(driver, SitesPage.class);
    }

    /*turn off Contact Us widget in access*/
    public SitesPage turnOffWidgetSite() {
        widgetsBtn.click();
        /*click on Contact Us checkbox only if it is checked*/
        if (contactWidgetCheckbox.isSelected()) {
            contactWidgetCheckbox.click();
        }
        crossWidget.click();
        okBtn.click();
        return PageFactory.initElements(driver, SitesPage.class);
    }

    /*turn on Contact Us page in access*/
    public SitesPage turnOnPageSite() {
        pagesBtn.click();
        /*click on Contact Us checkbox only if it is unchecked*/
        if (contactPageCheckbox.getAttribute("checked") == null) {
            contactPageCheckbox.click();
        }
        crossPage.click();
        okBtn.click();
        return PageFactory.initElements(driver, SitesPage.class);
    }

    /*turn on Contact Us widget in access*/
    public SitesPage turnOnWidgetSite() {
        widgetsBtn.click();
        /*click on Contact Us checkbox only if it is unchecked*/
        if (contactWidgetCheckbox.getAttribute("checked") == null) {
            contactWidgetCheckbox.click();
        }
        crossWidget.click();
        okBtn.click();
        return PageFactory.initElements(driver, SitesPage.class);
    }

    /*turn off Trade In page in access*/
    public SitesPage turnOffTradeInPageSite() {
        LOG.info("Click on pages button");
        pagesBtn.click();
        LOG.info("Turn off contact us checkbox, if it is selected");
        /*click on Contact Us checkbox only if it is checked*/
        if (tradeInPageCheckbox.isSelected()) {
            tradeInPageCheckbox.click();
        }
        LOG.info("Click on cross");
        crossPage.click();
        LOG.info("Click OK button");
        okBtn.click();
        return PageFactory.initElements(driver, SitesPage.class);
    }

    /*turn off TradeIn widget in access*/
    public SitesPage turnOffTradeInWidgetSite() {
        widgetsBtn.click();
        /*click on Contact Us checkbox only if it is checked*/
        if (tradeInWidgetCheckbox.isSelected()) {
            tradeInWidgetCheckbox.click();
        }
        crossWidget.click();
        okBtn.click();
        return PageFactory.initElements(driver, SitesPage.class);
    }

    /*turn on TradeIn page in access*/
    public SitesPage turnOnTradeInPageSite() {
        pagesBtn.click();
        /*click on Contact Us checkbox only if it is unchecked*/
        if (tradeInPageCheckbox.getAttribute("checked") == null) {
            tradeInPageCheckbox.click();
        }
        crossPage.click();
        okBtn.click();
        return PageFactory.initElements(driver, SitesPage.class);
    }

    /*turn on TradeIn widget in access*/
    public SitesPage turnOnTradeInWidgetSite() {
        widgetsBtn.click();
        /*click on Contact Us checkbox only if it is unchecked*/
        if (tradeInWidgetCheckbox.getAttribute("checked") == null) {
            tradeInWidgetCheckbox.click();
        }
        crossWidget.click();
        okBtn.click();
        return PageFactory.initElements(driver, SitesPage.class);
    }

    /*turn off Advanced Search Horizontal widget in access*/
    public SitesPage turnOffAdvSearchHorizWidgetSite() {
        widgetsBtn.click();
        /*click on Contact Us checkbox only if it is checked*/
        if (advSearchHorizWidgetCheckbox.isSelected()) {
            advSearchHorizWidgetCheckbox.click();
        }
        crossWidget.click();
        okBtn.click();
        return PageFactory.initElements(driver, SitesPage.class);
    }

    /*turn on TradeIn widget in access*/
    public SitesPage turnOnAdvSearchHorizWidgetSite() {
        widgetsBtn.click();
        /*click on Contact Us checkbox only if it is unchecked*/
        if (advSearchHorizWidgetCheckbox.getAttribute("checked") == null) {
            advSearchHorizWidgetCheckbox.click();
        }
        crossWidget.click();
        okBtn.click();
        return PageFactory.initElements(driver, SitesPage.class);
    }

}
