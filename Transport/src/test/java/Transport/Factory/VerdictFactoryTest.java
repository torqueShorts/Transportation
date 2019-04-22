package Transport.Factory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VerdictFactoryTest {

    @Test
    public void getVerdict() {

        boolean reason = true;
        int reAmount = 100;
        boolean warrant = false;

        Assert.assertEquals("Trial: \nReason valid: true\nReduced amount: 100\nWarrant: false",
                VerdictFactory.getVerdict(reason, reAmount, warrant).toString());


    }
}