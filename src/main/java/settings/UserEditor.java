package settings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utility.Page;
import utility.PageManager;
import utility.PropertyLoader;

/**
 * Created by Home on 27.04.2017.
 */
public class UserEditor extends Page{

    public UserEditor (PageManager pages){
        super(pages);
    }

    /*declare elements on the page*/
    @FindBy(how = How.ID, using = "user_editor_tab4")
    private WebElement accessTab;

    @FindBy(how = How.XPATH, using = "//div[@class='access_group']/span[contains(text(), 'Tools')]")
    private WebElement toolsItem;

    @FindBy(how = How.XPATH, using = "//div[@class='access_group']/span[contains(text(), 'Customers')]")
    private WebElement customersItem;

    @FindBy(how = How.XPATH, using = "//div[@class='access_group']/span[contains(text(), 'Settings Website')]")
    private WebElement settingsWebsiteItem;

    @FindBy(how = How.ID, using = "addon_make_a_page_2")
    private WebElement map2Checkbox;

    @FindBy(how = How.ID, using = "addon_make_a_page_custom_pages")
    private WebElement mapCustomCheckbox;

    @FindBy(how = How.ID, using = "settings_leads_email")
    private WebElement leadsEmailCheckbox;

    @FindBy(how = How.ID, using = "settings_website")
    private WebElement websiteSettingsCheckbox;

    @FindBy(how = How.ID, using = "crm_leads")
    private WebElement leadsCustomersCheckbox;

    @FindBy(how = How.ID, using = "addon_webmail")
    private WebElement webMailCheckbox;

    @FindBy(how = How.XPATH, using = "//span[@id='user_editor_save']//a")
    private WebElement saveBtn;

    @FindBy(how = How.ID, using = "login")
    private WebElement loginInput;

    @FindBy(how = How.ID, using = "password")
    private WebElement passwordInput;

    @FindBy(how = How.ID, using = "cpass")
    private WebElement confirmpwInput;

    @FindBy(how = How.ID, using = "name")
    private WebElement userDealerNameInput;

    @FindBy(how = How.ID, using = "role_id")
    private WebElement roleSelect;

    @FindBy(how = How.ID, using = "active")
    private WebElement activeCheckbox;

    /*turn on MAP2 checkbox in Access tab(if it is off)*/
    public Users turnOnMap2() throws InterruptedException {
        Thread.sleep(1000);
        accessTab.click();
        toolsItem.click();
        if (map2Checkbox.getAttribute("checked") == null) {
            map2Checkbox.click();
        }
        saveBtn.click();
        waitForJSandJQueryToLoad();
        return pages.users;
    }

    /*turn on MAP2 checkbox in Access tab(if it is off)*/
    public UserEditor turnOnMap2Checkbox() throws InterruptedException {
        Thread.sleep(500);
        toolsItem.click();
        Thread.sleep(500);
        if (map2Checkbox.getAttribute("checked") == null) {
            map2Checkbox.click();
        }
        Thread.sleep(500);
        toolsItem.click();
        return pages.editor;
    }

    /*turn on MAP2 checkbox in Access tab(if it is off)*/
    public UserEditor turnOnMapCustomCheckbox() throws InterruptedException {
        Thread.sleep(500);
        toolsItem.click();
        Thread.sleep(500);
        if (mapCustomCheckbox.getAttribute("checked") == null) {
            mapCustomCheckbox.click();
        }
        Thread.sleep(500);
        toolsItem.click();
        return pages.editor;
    }

    /*turn on Leads Email checkbox in Access tab(if it is off)*/
    public UserEditor turnOnLeadsEmail() throws InterruptedException {
        Thread.sleep(500);
        settingsWebsiteItem.click();
        Thread.sleep(500);
        if (leadsEmailCheckbox.getAttribute("checked") == null) {
            leadsEmailCheckbox.click();
        }
        Thread.sleep(500);
        settingsWebsiteItem.click();
        return pages.editor;
    }
    /*turn on Leads CRM checkbox in Access tab(if it is off)*/
    public UserEditor turnOnLeadsCRM() throws InterruptedException {
        Thread.sleep(500);
        customersItem.click();
        Thread.sleep(500);
        if (leadsCustomersCheckbox.getAttribute("checked") == null) {
            leadsCustomersCheckbox.click();
        }
        Thread.sleep(500);
        customersItem.click();
        return pages.editor;
    }

    /*turn on Website Settings checkbox in Access tab(if it is off)*/
    public UserEditor turnOnWebsiteSettings() throws InterruptedException {
        Thread.sleep(500);
        settingsWebsiteItem.click();
        Thread.sleep(500);
        if (websiteSettingsCheckbox.getAttribute("checked") == null) {
            websiteSettingsCheckbox.click();
        }
        Thread.sleep(500);
        settingsWebsiteItem.click();
        return pages.editor;
    }

    /*turn on Webmail checkbox in Access tab(if it is off)*/
    public UserEditor turnOnWebmail() throws InterruptedException {
        Thread.sleep(500);
        toolsItem.click();
        Thread.sleep(500);
        if (webMailCheckbox.getAttribute("checked") == null) {
            webMailCheckbox.click();
        }
        Thread.sleep(500);
        toolsItem.click();
        return pages.editor;
    }

    /*create new user with manager role*/
    public Users addNewManager(){
        loginInput.clear();
        loginInput.sendKeys(PropertyLoader.loadProperty("manager.login"));
        passwordInput.clear();
        passwordInput.sendKeys(PropertyLoader.loadProperty("manager.pw"));
        confirmpwInput.clear();
        confirmpwInput.sendKeys(PropertyLoader.loadProperty("manager.pw"));
        userDealerNameInput.clear();
        userDealerNameInput.sendKeys("manager.login");
        activeCheckbox.click();
        WebElement select = roleSelect;
        Select options = new Select(select);
        options.selectByValue("5");
        saveBtn.click();
        waitForJSandJQueryToLoad();
        return pages.users;
    }

    /*click on Save*/
    public Users clickSaveBtn(){
        saveBtn.click();
        waitForJSandJQueryToLoad();
        return pages.users;
    }

    /*go to Access tab*/
    public UserEditor clickAccessTab(){
        accessTab.click(); return pages.editor;
    }
}


