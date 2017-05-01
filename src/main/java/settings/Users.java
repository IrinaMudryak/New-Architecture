package settings;

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
public class Users extends Page {

    public Users (PageManager pages){
        super(pages);
    }

    /*declare elements on the page*/
    @FindBy(how = How.XPATH, using = "//li[@class='rootUserBranch jstree-open jstree-last']/a")
    private WebElement rootUser;

    @FindBy(how = How.XPATH, using = "(//li[contains(@class, 'userBranch')]/a)[last()]")
    private WebElement lastUser;

    @FindBy(how = How.ID, using = "user_tree_add")
    private WebElement addUserBtn;

    @FindBy(how = How.ID, using = "user_tree_delete")
    private WebElement deleteUserBtn;

    @FindBy(how = How.CSS, using = "a[href='/dms/settings']")
    private WebElement settingsMenuItem;

    @FindBy(how = How.CSS, using = "a[href='/dms/settings/website']")
    private WebElement websiteMenuItem;

    /*open User Editor of root user*/
    public UserEditor openUserEditor() {
        Actions action = new Actions(driver);
        Action moveToElem = action.doubleClick(rootUser).build();
        moveToElem.perform();
        waitForJSandJQueryToLoad();
        return pages.editor;
    }


    /*click Add user button*/
    public UserEditor clickAddUser(){
        addUserBtn.click();
        waitForJSandJQueryToLoad();
        return pages.editor;
    }


    /*delete the last user in the tree*/
    public void deleteLastUser(){
        lastUser.click();
        deleteUserBtn.click();
    }

    /*open the last user in the tree*/
    public UserEditor openLastUserEditor(){
        Actions action = new Actions(driver);
        Action moveToElem = action.doubleClick(lastUser).build();
        moveToElem.perform();
        waitForJSandJQueryToLoad();
        return pages.editor;
    }
}
