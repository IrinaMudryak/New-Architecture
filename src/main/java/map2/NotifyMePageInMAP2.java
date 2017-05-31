package map2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.Page;
import utility.PageManager;

import static org.testng.Assert.assertEquals;

/**
 * Created by Home on 27.04.2017.
 */
public class NotifyMePageInMAP2 extends Page {
    public StringBuffer verificationErrors = new StringBuffer();

    public NotifyMePageInMAP2(PageManager pages) {
        super(pages);
    }

    @FindBy(how= How.XPATH, using ="//input[@data-param='name']") //input field for page name
    private WebElement nameInput;

    @FindBy(how= How.XPATH, using ="//div[@data-tab='library']") //icon of the widgets library
    private WebElement libraryTab;


    @FindBy(how= How.XPATH, using ="//div[@class='ico-widget widget-notify_me']")//Notify widget in the widgets library
    private WebElement notifyIconTree;

    @FindBy(how= How.XPATH, using ="//div[@class='mapx-button-ico activate']") //button activate page
    private WebElement activateBtn;

    @FindBy(how= How.XPATH, using ="//div[@class='menu-launcher']") //button M-A-P for page-tree in top-menu
    private WebElement menuLauncher;

    @FindBy(how= How.CSS, using = ".mapx-button-ico.widget")
    private WebElement icoWidget;

    @FindBy(how = How.CSS, using = "#library-keyword-filter")
    private WebElement filter;



    @FindBy (how = How.CSS, using = ".ax-container.empty.col-lg-12.col-md-12.col-sm-12.col-xs-12.ui-droppable.ui-sortable")
     private WebElement target;

    @FindBy (how = How.CSS, using = ".ax-btn.btn-edit")
     private WebElement widgetEditorIcon;

    //Getters for the Elements of the Page
    public WebElement getNotifyIconTree() {return notifyIconTree;}

    public WebElement getTarget() {return target;}

    public WebElement getNameInput() {return nameInput;}



    public void openWidgetEditor() {
        widgetEditorIcon.click();
        waitForJSandJQueryToLoad();
    }


    public void setFilter(){
        filter.clear();
        filter.click();
        filter.sendKeys("Notify Me");
    }


    public void clickIcoWidget(){
        icoWidget.click();
        waitForJSandJQueryToLoad();

    }



       public void activatePage(){
        activateBtn.click();
    }

    public MAP2Page backToMap(){
        menuLauncher.click();
        return pages.map2;
    }

    public boolean isNotifyWidgetExists(){
        libraryTab.click();
        return notifyIconTree.isDisplayed();
    }

    /* public void addWidget(){
        libraryTab.click();
        ((JavascriptExecutor)driver).executeScript("map.pg.addWidget(\"notify_me\", {destination: \"body_0_0\"});");
    } */

}
