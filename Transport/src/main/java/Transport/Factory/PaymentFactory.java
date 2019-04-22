package Transport.Factory;

import Transport.Domain.Payment;

public class PaymentFactory {

    public static Payment getPayment(int amount, String driverID, String fineNum, boolean finePaid)
    {
        return new Payment.PaymentBuilder()
                .amount(amount)
                .driverID(driverID)
                .finNum(fineNum)
                .finePaid(finePaid)
                .build();
    }




}
