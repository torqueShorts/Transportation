package Transport.Factory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VerdictFactoryTest {

    @Test
    public void getVerdict() {

        String fineNum = "AF32704";
        boolean reason = true;
        int reAmount = 100;
        boolean warrant = false;

        Assert.assertEquals("Trial: \nFine number: AF32704\nReason valid: true\nReduced amount: 100\nWarrant: false",
                VerdictFactory.getVerdict(fineNum, reason, reAmount, warrant).toString());


    }
}