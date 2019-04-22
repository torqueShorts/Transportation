package Transport.Factory;

import Transport.Domain.Driver;
import Transport.Domain.InternationalDriver;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InternationalDriverFactoryTest {

    @Test
    public void getInternationalDriver() {

        DriverFactory drive = new DriverFactory();

        String name = "Kyle";
        String surname = "Storm";
        String dateOfBirth = "13/04/1994";
        boolean vehOwned = true;
        Driver value = drive.getDriver("08123456784", "AC2343765", true);

        Assert.assertEquals("International Driver: \nDriver ID: 08123456784\nDriver name: Kyle\nDriver surname: Storm\nDriver DOB: 13/04/1994" +
                "\nDriver international: true\nVehicle license: AC2343765\nVehicle Owned: true", InternationalDriverFactory.getInternationalDriver(name,surname, dateOfBirth, vehOwned, value).toString());


    }
}