package Transport.Factory;

import Transport.Domain.Driver;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NationalDriverFactoryTest {

    @Test
    public void getNationalDriver() {

        DriverFactory drive = new DriverFactory();

        String name = "Luke";
        String surname = "Storm";
        String dateOfBirth = "12/04/1996";
        Driver value = drive.getDriver("08137856784", "AC23576765", false);

        Assert.assertEquals("National Driver: \nDriver ID: 08137856784\nDriver name: Luke\nDriver surname: Storm\nDriver DOB: 12/04/1996" +
                "\nDriver international: false\nVehicle license: AC23576765", NationalDriverFactory.getNationalDriver(name,surname, dateOfBirth, value).toString());




    }
}