package map2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.Page;
import utility.PageManager;

/**
 * Created by Home on 27.04.2017.
 */
public class MAP2 extends Page{

    public MAP2 (PageManager pages){
        super(pages);
    }

    @FindBy(how= How.XPATH, using ="//div[@data-page='notify']")
    public WebElement notifyTab;

    @FindBy(how= How.XPATH, using ="//div[@class='map-link pull-right']")
    public WebElement addPageBtn;

    @FindBy(how= How.XPATH, using ="(//span[@class='ui-button ui-state-default'])[last()]")
    public WebElement deleteLastPageBtn;

    public void clickNotifyTab(){
        Actions action = new Actions(driver);
        action.moveToElement(notifyTab).perform();
        notifyTab.click();
        waitForJSandJQueryToLoad();
    }

    public void clickAddPage(){
        addPageBtn.click();
        waitForJSandJQueryToLoad();}

    public void deleteLastPage(){
        deleteLastPageBtn.click();
        driver.switchTo().alert().accept();
    }


    public boolean isNotifyTabExists(){
        return notifyTab.isDisplayed();
    }


}


