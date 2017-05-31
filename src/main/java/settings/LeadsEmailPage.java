package settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.Page;
import utility.PageManager;
import utility.PropertyLoader;
import webmail.WebMailLogin;

import java.util.List;

/**
 * Created by Home on 27.04.2017.
 */
public class LeadsEmailPage extends Page {

    public LeadsEmailPage(PageManager pages){
        super(pages);
    }

    // Elements for Notify Me Form
    @FindBy(how = How.XPATH, using = "//tr[@id='leads_email_notify']//div[@class='dotted_note3'][contains(text(), 'test_6@dxloo.com')]")
    private WebElement emailContextNotify;

    @FindAll(@FindBy( how = How.XPATH, using = "//tr[@id='leads_email_notify']//div[@class='dotted_note3'][contains(text(), 'test_6@dxloo.com')]"))
    private List<WebElement> emailContextsNotify; //list of all emails for the form Notify

    @FindBy(how = How.XPATH, using = "//tr[@id='leads_email_notify']//a[@class='button-style b_edit notranslate']")
    private WebElement contactEditNotify;// button Edit for LeadsPage Email Notify Me

    @FindBy(how = How.XPATH, using = "//tr[@id='leads_email_notify']//a[@class='button-style b_add']")
    private WebElement contactAddNotify; //button Add

    @FindBy(how = How.XPATH, using = "//tr[@id='leads_email_notify']//div[@class='email_row'][last()]//input[@class='leads_email my_form']")
    private WebElement contactInputNotify; //new input field for email

    @FindBy(how = How.XPATH, using = "//tr[@id='leads_email_notify']//div[@class='email_row'][last()]//input[@class='leads_email_type_html']")
    private WebElement htmlChckboxNotify; // HTML checkbox for new created contact

    @FindBy(how = How.XPATH, using = "//tr[@id='leads_email_notify']//a[@class='button-style b_save']")
    private WebElement contactSaveNotify; // button "Save" in Editor


    /*elements for Contact Us Form*/
    @FindBy(how = How.XPATH, using = "//tr[@id='leads_email_contactus']//div[@class='dotted_note3'][contains(text(), 'test_1@dxloo.com')]")
    private WebElement emailContext;

    @FindAll(@FindBy(how = How.XPATH, using = "//tr[@id='leads_email_contactus']//div[@class='dotted_note3'][contains(text(), 'test_1@dxloo.com')]"))
    private List<WebElement> emailContexts;

    @FindBy(how = How.XPATH, using = "//tr[@id='leads_email_contactus']//a[@class='button-style b_edit notranslate']")
    private WebElement contactEdit;

    @FindBy(how = How.XPATH, using = "//tr[@id='leads_email_contactus']//a[@class='button-style b_add']")
    private WebElement contactAdd;

    @FindBy(how = How.XPATH, using = "(//tr[@id='leads_email_contactus']//input[@class='leads_email my_form'])[last()]")
    private WebElement contactInput;

    @FindBy(how = How.XPATH, using = "(//tr[@id='leads_email_contactus']//input[@class='leads_email_type_html'])[last()]")
    private WebElement htmlChckbox;

    @FindBy(how = How.XPATH, using = "(//tr[@id='leads_email_contactus']//span[@class='gl_button save_btn'])[2]")
    private WebElement contactSave;

    @FindBy(how = How.CSS, using = "a[href='/dms/email']")
    private WebElement webmailMenuItem;


    //Elements for Trade In Form
    @FindBy(how = How.XPATH, using = "//tr[@id='leads_email_tradein']//a[@class='button-style b_edit notranslate']")
    private WebElement tradeInEditBtn;

    @FindBy(how = How.XPATH, using = "//tr[@id='leads_email_tradein']//a[@class='button-style b_add']")
    private WebElement tradeInAddBtn;

    @FindBy(how = How.XPATH, using = "(//tr[@id='leads_email_tradein']//input[@class='leads_email my_form'])[last()]")
    private WebElement tradeInInput;

    @FindBy(how = How.XPATH, using = "(//tr[@id='leads_email_tradein']//input[@class='leads_email_type_html'])[last()]")
    private WebElement tradeInHtmlCheckbox;

    @FindBy(how = How.XPATH, using = "(//tr[@id='leads_email_tradein']//span[@class='gl_button save_btn'])[2]")
    private WebElement tradeInSaveBtn;




    /*add email to Contact Us leads as custom*/
    public void addEmail() {
        contactEditNotify.click();
        contactAddNotify.click();
        contactInputNotify.clear();
        contactInputNotify.sendKeys(PropertyLoader.loadProperty("webmail.user"));
        htmlChckboxNotify.click();
        contactSaveNotify.click();
    }

    /*remove the last added Contact Us email*/
    public void removeEmail() {
        contactEditNotify.click();
        htmlChckboxNotify.click();
        contactSaveNotify.click();
    }

    /*add email to TradeIn leads as custom*/
    public void addTradeInEmail() {
        tradeInEditBtn.click();
        tradeInAddBtn.click();
        tradeInInput.clear();
        tradeInInput.sendKeys(PropertyLoader.loadProperty("webmail.user"));
        tradeInHtmlCheckbox.click();
        tradeInSaveBtn.click();
    }

    /*remove the last added Trade In email*/
    public void removeTradeInEmail() {
        tradeInEditBtn.click();
        tradeInHtmlCheckbox.click();
        tradeInSaveBtn.click();
    }

    /*go to Webmail login page*/
    public WebMailLogin clickOnWebmailMenu() {
        webmailMenuItem.click();
        return PageFactory.initElements(driver, WebMailLogin.class);
    }
}


