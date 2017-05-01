package dms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.Page;
import utility.PageManager;
import utility.PropertyLoader;

/**
 * Created by Home on 27.04.2017.
 */
public class LoginPage extends Page {
    String login = PropertyLoader.loadProperty("super.login");
    public LoginPage (PageManager pages){
        super(pages);
    }

    @FindBy(how= How.ID, using ="login")
    public WebElement loginInput;

    @FindBy(how= How.ID, using ="password")
    public WebElement pwInput;

    @FindBy(how= How.ID, using ="login2")
    public WebElement submirButton;

    }
