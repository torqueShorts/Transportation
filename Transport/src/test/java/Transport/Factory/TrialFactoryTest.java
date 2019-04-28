package Transport.Factory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrialFactoryTest {

    @Test
    public void getTrial() {

        String trialID = "RD345";
        String date = "20/03/2019";
        String driverID = "08456789";
        String vehicleID = "AC2345678";

        Assert.assertEquals("Trial ID: RD345\nDate of Trial: 20/03/2019\nDriver ID: 08456789\nVehicle ID: AC2345678",
                TrialFactory.getTrial(trialID,date,driverID,vehicleID).toString());

    }
}