package Transport.Factory;

import Transport.Domain.Driver;

public class DriverFactory {

    public static Driver getDriver(String driverID, String name, String surname, String dateOfBirth, String vehLicense, boolean international)
    {
        return new Driver.DriverBuilder().driverID(driverID)
                .name(name)
                .surname(surname)
                .dateOfBirth(dateOfBirth)
                .vehLicense(vehLicense)
                .international(international)
                .build();
    }


}
