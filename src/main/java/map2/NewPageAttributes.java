package map2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.Page;
import utility.PageManager;

/**
 * Created by Home on 27.04.2017.
 */
public class NewPageAttributes extends Page{

    public NewPageAttributes(PageManager pages){
        super(pages);
    }

    @FindBy(how= How.ID, using ="input-pg-name")
    private WebElement nameInput;

    @FindBy(how= How.ID, using ="input-pg-url")
    private WebElement pageURLInput;

    @FindBy(how= How.ID, using ="input-pg-title")
    private WebElement titleInput;

    @FindBy(how= How.XPATH, using ="(//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all  ui-draggable']//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only'])[1]")
    private WebElement createBtn;


    public NotifyMeWidgetSettings createPage(){
        nameInput.sendKeys("notifyauto");
        pageURLInput.sendKeys("notifyauto");
        titleInput.sendKeys("notifyauto");
        createBtn.click();
        waitForJSandJQueryToLoad();
        return pages.notifyMeWidgetSettings;
    }

}
