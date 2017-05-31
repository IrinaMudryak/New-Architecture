package utility;

import static org.openqa.selenium.remote.BrowserType.CHROME;
import static utility.WebDriverFactory.FIREFOX;

/**
 * Created by Home on 08.05.2017.
 */
public class FormHelper extends BaseHelper {
   private String borderColor;
   private String labelColor;
   private String borderColorFirstName;
   private String asteriskColor;

    public FormHelper (ApplicationManager app){
        super(app);
    }

        public void setExpectedColors(String browserName) {

        if(CHROME.equals(browserName)) {
            borderColor = "rgb(169, 68, 66)";
            labelColor = "rgba(169, 68, 66, 1)";
            borderColorFirstName = "rgb(169, 68, 66)";
            asteriskColor = "rgba(169, 68, 66, 1)";
        }

        else if(FIREFOX.equals(browserName)) {
            borderColor = "#a94442";
            labelColor = "#a94442";
            borderColorFirstName = "#a94442";
            asteriskColor = "#a94442";
        }
        else if (WebDriverFactory.IE.equals(browserName)){
            borderColor = "#a94442";
            labelColor = "rgba(169, 68, 66, 1)";
            borderColorFirstName = "#843534";
            asteriskColor = "rgba(169, 68, 66, 1)";
        }

    }

    public String getBorderColor (){
        return borderColor;
    }

    public String getLabelColor() {
        return labelColor;
    }

    public String getBorderColorFirstName() {
        return borderColorFirstName;
    }

    public String getAsteriskColor() {
        return asteriskColor;
    }
}
