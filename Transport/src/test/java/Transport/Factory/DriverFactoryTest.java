package Transport.Factory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DriverFactoryTest {

    @Test
    public void getDriver() {


        String driverID = "08456789";
        String vehLicense = "AC23647";
        boolean international = false;


        Assert.assertEquals("Driver ID: 08456789\nVehicle license: AC23647\nInternational: false",
                DriverFactory.getDriver(driverID,vehLicense,international).toString());
    }
}