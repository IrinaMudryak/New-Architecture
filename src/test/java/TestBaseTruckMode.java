import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

/**
 * Created by Home on 12.05.2017.
 */
public class TestBaseTruckMode extends TestBaseDws{
    @BeforeSuite
    public void setFormToTruckMode() {
       // app.map2Helper.setFormToTruck();

    }
}
