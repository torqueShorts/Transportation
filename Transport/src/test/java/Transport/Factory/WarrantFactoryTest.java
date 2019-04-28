package Transport.Factory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarrantFactoryTest {

    @Test
    public void getWarrant() {

        String warrantID = "VNT3847";
        String driverID = "08145896";
        String vehicleID = "AC239034";
        boolean actiive = true;

        Assert.assertEquals("Warrant ID: VNT3847\nDriver ID: 08145896\nVehicle License: AC239034\nWarrant valid: true",
                WarrantFactory.getWarrant(warrantID, driverID,vehicleID,actiive).toString());


    }
}