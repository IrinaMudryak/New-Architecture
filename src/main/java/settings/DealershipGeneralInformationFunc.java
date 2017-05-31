package settings;

import utility.ApplicationManager;
import utility.BaseHelper;

/**
 * Created by Home on 31.05.2017.
 */
public class DealershipGeneralInformationFunc extends BaseHelper {

    public DealershipGeneralInformationFunc(ApplicationManager app) {
        super(app);
    }

    public void openDealershipGeneralInformation() {
        app.getWebDriver().get(app.baseUrl + "/dms/settings/dealership#general-information");
    }
}
