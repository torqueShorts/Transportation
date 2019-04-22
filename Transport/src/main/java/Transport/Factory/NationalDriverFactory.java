package Transport.Factory;

import Transport.Domain.Driver;
import Transport.Domain.NationalDriver;

public class NationalDriverFactory {

    public static NationalDriver getNationalDriver(String name, String surname, String dateOfBirth, Driver drive)
    {
        return new NationalDriver.NatDriverBuidler()
                .name(name)
                .surname(surname)
                .dateOfBirth(dateOfBirth)
                .driver(drive)
                .build();

    }

}
