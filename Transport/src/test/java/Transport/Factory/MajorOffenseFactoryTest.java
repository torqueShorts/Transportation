package Transport.Factory;

import Transport.Domain.Fine;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MajorOffenseFactoryTest {

    @Test
    public void getMajorOffense() {

        FineFactory fine = new FineFactory();

        String type = "Hit and Run";
        Fine value = fine.getFine("AR43675","EB23674580", "0815674389","MajorOffence", false);


        Assert.assertEquals("Type of Major offence: Hit and Run\nVehicle License: EB23674580\nDriver ID: 0815674389\nFine type: MajorOffence\nFine Paid: false",
                MajorOffenseFactory.getMajorOffense(type,value).toString());


    }
}