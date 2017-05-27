package webmail;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.Page;
import utility.PageManager;
import utility.PropertyLoader;

/**
 * Created by Home on 27.04.2017.
 */
public class WebMailLogin extends Page {

    public WebMailLogin(PageManager pages){
        super(pages);
    }
    @FindBy(how = How.ID, using = "rcmloginuser")
    private WebElement username;

    @FindBy(how = How.ID, using = "rcmloginpwd")
    private WebElement password;

    @FindBy(how = How.ID, using = "rcmloginhost")
    private WebElement server;

    @FindBy(how = How.XPATH, using = "//input[@class='button mainaction']")
    private WebElement loginButton;

    @FindBy(how = How.ID, using = "fr")
    private WebElement iframe;

    public EmailsList loginToWebmail(){
        driver.switchTo().frame(iframe);
        username.clear();
        username.sendKeys(PropertyLoader.loadProperty("webmail.user"));
        password.clear();
        password.sendKeys(PropertyLoader.loadProperty("webmail.pw"));
        server.clear();
        server.sendKeys(PropertyLoader.loadProperty("webmail.server"));
        loginButton.click();
        driver.switchTo().defaultContent();
        return pages.emailsList;
    }

}
