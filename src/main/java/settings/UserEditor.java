package settings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
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
    public void turnOnMap2() throws InterruptedException {
        waitUntilElementUsable(accessTab);
         accessTab.click();
         waitForJSandJQueryToLoad();
         turnOnMap2Checkbox();
        saveBtn.click();
        waitForJSandJQueryToLoad();

    }

    /*turn on MAP2 checkbox in Access tab(if it is off)*/
    public void turnOnMap2Checkbox() throws InterruptedException {
        waitUntilElementUsable(toolsItem);
        toolsItem.click();
         waitForJSandJQueryToLoad();
        if (map2Checkbox.getAttribute("checked") == null) {
            waitUntilElementUsable(map2Checkbox);
            map2Checkbox.click();
            waitForJSandJQueryToLoad();
        }
        waitUntilElementUsable(toolsItem);
        toolsItem.click();
        waitForJSandJQueryToLoad();

    }

    /*turn on MAP2 checkbox in Access tab(if it is off)*/
    public UserEditor turnOnMapCustomCheckbox() throws InterruptedException {
        toolsItem.click();
       waitForJSandJQueryToLoad();
        if (mapCustomCheckbox.getAttribute("checked") == null) {
            mapCustomCheckbox.click();
            waitForJSandJQueryToLoad();
        }
         toolsItem.click();
        waitForJSandJQueryToLoad();
        return this;
    }

    /*turn on Leads Email checkbox in Access tab(if it is off)*/
    public UserEditor turnOnLeadsEmail() throws InterruptedException {
        waitUntilElementUsable(settingsWebsiteItem);
        settingsWebsiteItem.click();
      waitForJSandJQueryToLoad();
        if (leadsEmailCheckbox.getAttribute("checked") == null) {
            waitUntilElementUsable(leadsEmailCheckbox);
            leadsEmailCheckbox.click();
            waitForJSandJQueryToLoad();
        }
        waitUntilElementUsable(settingsWebsiteItem);
        settingsWebsiteItem.click();
        waitForJSandJQueryToLoad();
        return this;
    }
    /*turn on Leads CRM checkbox in Access tab(if it is off)*/
    public UserEditor turnOnLeadsCRM() throws InterruptedException {
         waitUntilElementUsable(customersItem);
          customersItem.click();
          waitForJSandJQueryToLoad();
       if (leadsCustomersCheckbox.getAttribute("checked") == null)  {
            waitUntilElementUsable(leadsCustomersCheckbox);
            leadsCustomersCheckbox.click();
            waitForJSandJQueryToLoad();
        }
        waitUntilElementUsable(customersItem);
        customersItem.click();
        waitForJSandJQueryToLoad();
        return this;
    }

    /*turn on Website Settings checkbox in Access tab(if it is off)*/
    public UserEditor turnOnWebsiteSettings() throws InterruptedException {
        waitUntilElementUsable(settingsWebsiteItem);
         settingsWebsiteItem.click();
      waitForJSandJQueryToLoad();
        if (websiteSettingsCheckbox.getAttribute("checked") == null) {
            waitUntilElementUsable(websiteSettingsCheckbox);
            websiteSettingsCheckbox.click();
            waitForJSandJQueryToLoad();
        }
         waitUntilElementUsable(settingsWebsiteItem);
         settingsWebsiteItem.click();
        waitForJSandJQueryToLoad();
        return this;
    }

    /*turn on Webmail checkbox in Access tab(if it is off)*/
    public UserEditor turnOnWebmail() throws InterruptedException {
          waitUntilElementUsable(toolsItem);
          toolsItem.click();
       waitForJSandJQueryToLoad();
        if (webMailCheckbox.getAttribute("checked") == null) {
            waitUntilElementUsable(webMailCheckbox);
            webMailCheckbox.click();
            waitForJSandJQueryToLoad();
        }
        waitUntilElementUsable(toolsItem);
        toolsItem.click();
        waitForJSandJQueryToLoad();
        return this;
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
        waitUntilElementUsable(saveBtn);
        saveBtn.click();
        waitForJSandJQueryToLoad();
        return pages.users;
    }

    /*go to Access tab*/
    public UserEditor clickAccessTab(){
        waitUntilElementUsable(accessTab);
        accessTab.click();
        waitForJSandJQueryToLoad();
        return this;
    }
}


