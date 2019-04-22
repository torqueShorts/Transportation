package Transport.Factory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrialFactoryTest {

    @Test
    public void getTrial() {

        String date = "20/03/2019";
        String driverID = "08456789";
        String vehicleID = "AC2345678";

        Assert.assertEquals("Date of Trial: 20/03/2019\nDriver ID: 08456789\nVehicle ID: AC2345678",
                TrialFactory.getTrial(date,driverID,vehicleID).toString());

    }
}