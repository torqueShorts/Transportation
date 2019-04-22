package Transport.Factory;

import Transport.Domain.Driver;

public class DriverFactory {

    public static Driver getDriver(String driverID, String vehLicense, boolean international)
    {
        return new Driver.DriverBuilder()
                .driverID(driverID)
                .vehLicense(vehLicense)
                .international(international)
                .build();
    }


}
