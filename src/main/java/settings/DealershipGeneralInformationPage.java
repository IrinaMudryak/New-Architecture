package settings;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.Page;
import utility.PageManager;

/**
 * Created by Home on 07.05.2017.
 */
public class DealershipGeneralInformationPage extends Page {

    public DealershipGeneralInformationPage(PageManager pages){
        super(pages);
    }

    @FindBy(how = How.XPATH, using = "//tr[@id='dealership_name']//span[@class='settings_view dotted_note']")
    private WebElement dealershipName;

    public String getDealershipName() {
          return dealershipName.getText();
    }


}
