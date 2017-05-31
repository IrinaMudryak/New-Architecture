package settings;

import utility.ApplicationManager;
import utility.BaseHelper;

/**
 * Created by Home on 31.05.2017.
 */
public class UserEditorFunc extends BaseHelper {

   public UserEditorFunc(ApplicationManager app) {
       super(app);
   }

    public void turnOnMap2() throws InterruptedException {
        waitUntilElementUsable(pages.userEditor.getAccessTab());
        pages.userEditor.getAccessTab().click();
        waitForJSandJQueryToLoad();
        turnOnMap2Checkbox();
        pages.userEditor.getSaveBtn().click();
        waitForJSandJQueryToLoad();

    }
    /*turn on MAP2Page checkbox in Access tab(if it is off)*/
    public void turnOnMap2Checkbox() throws InterruptedException {
        waitUntilElementUsable(pages.userEditor.getToolsItem());
        pages.userEditor.getToolsItem().click();
        waitForJSandJQueryToLoad();
        checkCheckboxUniversal(pages.userEditor.getMap2Checkbox());
        waitUntilElementUsable(pages.userEditor.getToolsItem());
        pages.userEditor.getToolsItem().click();
        waitForJSandJQueryToLoad();

    }



}
