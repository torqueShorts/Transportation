package Transport.Factory;

import Transport.Domain.Warrant;


public class WarrantFactory {

    public static Warrant getWarrant(String driverID, String vehLicense, boolean active)
    {
        return new Warrant.WarrantBuilder()
                .driverID(driverID)
                .vehLicense(vehLicense)
                .active(active)
                .build();
    }


}
