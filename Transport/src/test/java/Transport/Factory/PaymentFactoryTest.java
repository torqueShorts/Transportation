package Transport.Factory;

import Transport.Domain.Payment;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaymentFactoryTest {

    @Test
    public void getPayment() {


        int amount = 500;
        String driverID = "AC2163748945";
        String fineNum = "RC87594";
        boolean finePaid = true;

        Assert.assertEquals("Payment amount: 500\nDriver ID: AC2163748945\nFine number: RC87594\nFine paid: true",
                PaymentFactory.getPayment(amount, driverID, fineNum, finePaid).toString());


    }
}