package Transport.Factory;

import Transport.Domain.Fine;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OverSpeedLimitLowFactoryTest {

    @Test
    public void getOverSpeedLimitLow() {

        FineFactory fine = new FineFactory();

        int speedLimit = 60;
        int carSpeed = 80;
        int amount = 1500;

        Fine value = fine.getFine("AC23898473", "084768532", "MinorOffence", false);

        Assert.assertEquals("Vehicle License: AC23898473\nDriver ID: 084768532\nType of offence: MinorOffence" +
                "\nFine Paid: false\nThe speed of the driver: 80\nThe speed limit of the road: 60\nAmount due: 1500",
                OverSpeedLimitLowFactory.getOverSpeedLimitLow(speedLimit, carSpeed, amount, value).toString());
    }
}