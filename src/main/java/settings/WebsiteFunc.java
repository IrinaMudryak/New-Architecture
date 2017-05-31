package settings;

import utility.ApplicationManager;
import utility.BaseHelper;

/**
 * Created by Home on 31.05.2017.
 */
public class WebsiteFunc extends BaseHelper{

    public WebsiteFunc(ApplicationManager app){
        super(app);
    }

    //go to DMS-Settings-WebsitePage-General
    public WebsitePage openSettingsWebsiteGeneral() {
        app.getWebDriver().get(app.baseUrl + "/dms/settings/website#general");
        return pages.website;
    }
}
