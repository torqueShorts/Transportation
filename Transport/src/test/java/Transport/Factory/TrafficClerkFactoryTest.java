package Transport.Factory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrafficClerkFactoryTest {

    @Test
    public void getTrafficChief() {

        String clerkID = "27772380";
        String name = "Jamie";
        String surname = "Storm";
        String fineCode = "RAR2345";
        boolean finePaid = true;

        Assert.assertEquals("Clerk ID: 27772380\nClerk name: Jamie\nClerk surname: Storm\nFine code: RAR2345\nFine Paid: true",
                TrafficClerkFactory.getTrafficChief(clerkID, name, surname, fineCode, finePaid).toString());

    }
}