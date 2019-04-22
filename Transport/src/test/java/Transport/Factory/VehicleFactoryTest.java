package Transport.Factory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleFactoryTest {

    @Test
    public void getVehicle() {


        String vehLicense = "AC345545";
        String driverID = "08474945";
        String type = "MinorOffence";


        Assert.assertEquals("Vehicle: \nVehicle License: AC345545\nDriver ID: 08474945\n" +
        "Type: MinorOffence",
                VehicleFactory.getVehicle(vehLicense,driverID,type).toString());

    }
}