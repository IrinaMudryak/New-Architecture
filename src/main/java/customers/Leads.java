package customers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.Page;
import utility.PageManager;

/**
 * Created by Home on 28.04.2017.
 */
public class Leads extends Page {

    public Leads (PageManager pages) {
        super(pages);
    }

    /*declare elements on the page*/

    @FindBy(how = How.XPATH, using = "(//table[@id='leads-list']//tr[@class='ui-widget-content jqgrow ui-row-ltr'])[1]")
    private WebElement firstLead;

    @FindBy(how = How.XPATH, using = "(//table[@id='leads-list']//tr[@class='ui-widget-content jqgrow ui-row-ltr'])[1]/td[2]/a")
    private WebElement firstLeadTitle;

    @FindBy(how = How.XPATH, using = "(//table[@id='leads-list']//tr[@class='ui-widget-content jqgrow ui-row-ltr'])[1]//input")
    private WebElement firstLeadCheckbox;

    @FindBy(how = How.XPATH, using = "//span[@class='ui-icon ui-icon-trash']")
    private WebElement deleteIcon;

    @FindBy(how = How.ID, using = "dData")
    private WebElement deleteButton;

    /*open the first lead*/

    public LeadDetails openFirstLead() {
        firstLeadTitle.click();
        return PageFactory.initElements(driver, LeadDetails.class);
    }

    public void removeFirstLead() {
        firstLeadCheckbox.click();
        deleteIcon.click();
        deleteButton.click();
    }
}
