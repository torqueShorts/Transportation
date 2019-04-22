package Transport.Factory;

import Transport.Domain.Fine;

public class FineFactory {

    public static Fine getFine(String vehLicense, String driverID, String type, boolean finePaid)
    {
        return new Fine.FineBuilder()
                .vehLicense(vehLicense)
                .driverID(driverID)
                .type(type)
                .finePaid(finePaid)
                .build();
    }


}
