package Transport.Factory;

import Transport.Domain.Fine;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinorOffenseFactoryTest {

    @Test
    public void getMinorOffense() {

        FineFactory fine = new FineFactory();

        String type = "Disobey Signs";
        Fine value = fine.getFine("AR4567","AC12874659", "084813456","MinorOffence", false);


        Assert.assertEquals("Type of Minor offence: Disobey Signs\nVehicle License: AC12874659\nDriver ID: 084813456\nFine type: MinorOffence\nFine Paid: false",
                MinorOffenseFactory.getMinorOffense(type,value).toString());

    }
}