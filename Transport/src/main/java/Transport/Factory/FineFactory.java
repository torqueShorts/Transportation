package Transport.Factory;

import Transport.Domain.Fine;

public class FineFactory {

    public static Fine getFine(String vehLicense, String driverID, int amount, boolean finePaid)
    {
        return new Fine.FineBuilder()
                .vehLicense(vehLicense)
                .driverID(driverID)
                .amount(amount)
                .finePaid(finePaid)
                .build();
    }


}
