package webmail;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.Page;
import utility.PageManager;

/**
 * Created by Home on 27.04.2017.
 */
public class EmailsList extends Page {

    public EmailsList (PageManager pages){
        super(pages);
    }

    @FindBy(how = How.ID, using = "fr")
    private WebElement iframe;

    @FindBy(how = How.XPATH, using = "(//table[@id='messagelist']/tbody/tr/td[@class='subject'])[1]")
    private WebElement firstEmail;

    @FindBy(how = How.XPATH, using = "//td[@id='rcmdate']/a")
    private WebElement dateColumnHeader;

    public EmailDetails openFirstEmail(){
        driver.switchTo().frame(iframe);
        firstEmail.click();
        Actions action = new Actions(driver);
        Action moveToElem = action.doubleClick(firstEmail).build();
        moveToElem.perform();
        driver.switchTo().defaultContent();
        return pages.emailDetails;
    }

    public void clickDateColumn(){
        driver.switchTo().frame(iframe);
        dateColumnHeader.click();
        driver.switchTo().defaultContent();
    }


}
