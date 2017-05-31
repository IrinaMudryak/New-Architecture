package settings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utility.Page;
import utility.PageManager;

/**
 * Created by Home on 27.04.2017.
 */
public class WebsitePage extends Page{
    public WebsitePage(PageManager pages){
        super(pages);
    }

    /*declare elements on the page*/
    @FindBy(how = How.ID, using = "tab2")
    private WebElement leadsEmailTab;

    @FindBy(how = How.ID, using = "tab7")
    private WebElement localizationTab;

    @FindBy(how = How.XPATH, using = "//tr[@id='forms_captcha']//a[@class='button-style b_edit notranslate']")
    private WebElement captchaEditBtn;

    @FindBy(how = How.XPATH, using = "//tr[@id='forms_captcha']//a[@class='button-style b_save']")
    private WebElement captchaSaveBtn;

    @FindBy(how = How.XPATH, using = "//tr[@id='forms_captcha']//input[@value='1']")
    private WebElement captchaOnRadio;

    @FindBy(how = How.XPATH, using = "//tr[@id='forms_captcha']//input[@value='0']")
    private WebElement captchaOffRadio;

    @FindBy(how = How.XPATH, using = "//tr[@id='type_of_captcha']//a[@class='button-style b_edit notranslate']")
    private WebElement captchaTypeEditBtn;

    @FindBy(how = How.XPATH, using = "//tr[@id='type_of_captcha']//a[@class='button-style b_save']")
    private WebElement captchaTypeSaveBtn;

    @FindBy(how = How.XPATH, using = "//tr[@id='type_of_captcha']//select")
    private WebElement captchaTypeSelect;

    @FindBy(how = How.XPATH, using = "//tr[@id='jquery_version']//a[@class='button-style b_edit notranslate']")
    private WebElement jQueryEditBtn;

    @FindBy(how = How.XPATH, using = "//tr[@id='jquery_version']//a[@class='button-style b_save']")
    private WebElement jQuerySaveBtn;

    @FindBy(how = How.XPATH, using = "//tr[@id='jquery_version']//input")
    private WebElement jQueryInput;

    @FindBy(how = How.XPATH, using = "//tr[@id='jquery_version']//span[@class='settings_view dotted_note']")
    private WebElement jQueryValue;

    @FindBy(how = How.XPATH, using = "//tr[@id='redirect_404']//a[@class='button-style b_edit notranslate']")
    private WebElement the404EditBtn;

    @FindBy(how = How.XPATH, using = "//tr[@id='redirect_404']//a[@class='button-style b_save']")
    private WebElement the404SaveBtn;

    @FindBy(how = How.XPATH, using = "//tr[@id='redirect_404']//select")
    private WebElement the404Select;

    /*open LeadsPage Email tab*/
    public LeadsEmailPage clickOnLeadsTab() {
        leadsEmailTab.click();
        return pages.leadsEmail;
    }

    /*open LocalizationPage tab */
    public LocalizationPage clickOnLocalizationTab() {
        localizationTab.click();
        return pages.localization;
    }

    /*Turn on Captcha*/
    public WebsitePage enableCaptcha() {
        captchaEditBtn.click();
        captchaOnRadio.click();
        captchaSaveBtn.click();
        waitForJSandJQueryToLoad();
        return pages.website;
    }

    /*Turn off Captcha*/
    public WebsitePage disableCaptcha() {
        captchaEditBtn.click();
        captchaOffRadio.click();
        captchaSaveBtn.click();
        waitForJSandJQueryToLoad();
        return pages.website;
    }

    /*set Captcha Type - Captcha*/
    public WebsitePage setCaptchaType() {
        captchaTypeEditBtn.click();
        WebElement select = captchaTypeSelect;
        Select options = new Select(select);
        options.selectByValue("Captcha");
        captchaTypeSaveBtn.click();
        waitForJSandJQueryToLoad();
        return pages.website;
    }

    /*set Captcha Type - ReCaptcha*/
    public WebsitePage setReCaptchaType() {
        captchaTypeEditBtn.click();
        WebElement select = captchaTypeSelect;
        Select options = new Select(select);
        options.selectByValue("ReCaptcha");
        captchaTypeSaveBtn.click();
        waitForJSandJQueryToLoad();
        return pages.website;
    }

    /*set Captcha Type - Motion*/
    public WebsitePage setMotionCaptchaType() {
        captchaTypeEditBtn.click();
        WebElement select = captchaTypeSelect;
        Select options = new Select(select);
        options.selectByValue("Motion");
        captchaTypeSaveBtn.click();
        waitForJSandJQueryToLoad();
        return pages.website;
    }

    /*set Captcha Type - ReCaptcha2*/
    public WebsitePage setReCaptcha2Type() {
        captchaTypeEditBtn.click();
        WebElement select = captchaTypeSelect;
        Select options = new Select(select);
        options.selectByValue("ReCaptcha V2");
        captchaTypeSaveBtn.click();
        waitForJSandJQueryToLoad();
        return pages.website;
    }

    /*set jQuery version - 1.11.2 (if it is not equal to that)*/
    public WebsitePage setjQueryVersionMAP2() {
        if (jQueryValue.getText() != "1.11.2") {
            jQueryEditBtn.click();
            jQueryInput.clear();
            jQueryInput.sendKeys("1.11.2");
            jQuerySaveBtn.click();
            waitForJSandJQueryToLoad();
        }
         return pages.website;
    }

    public void set404Redir(String value404){
        the404EditBtn.click();
        WebElement select = the404Select;
        Select options = new Select(select);
        options.selectByVisibleText(value404);
    }
}



