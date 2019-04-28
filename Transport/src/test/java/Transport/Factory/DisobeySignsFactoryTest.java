package Transport.Factory;

import Transport.Domain.DisobeySigns;
import Transport.Domain.Fine;
import Transport.Domain.MinorOffense;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DisobeySignsFactoryTest {

    @Test
    public void getDisobeySign() {

        FineFactory fine = new FineFactory();


        String sign = "Stop";
        int amount = 500;
        Fine value = fine.getFine("AR346745","SW2637485", "0836748579", "MinorOffence", false);

        Assert.assertEquals("Vehicle License: SW2637485\nDriver ID: 0836748579\nType of offence: MinorOffence\nFine Paid: false\nThe sign disobeyed: Stop\nAmount due: 500",
                DisobeySignsFactory.getDisobeySign(sign, 500, value).toString());


    }
}