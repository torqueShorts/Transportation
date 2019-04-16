package Transport.Factory;

import Transport.Domain.NationalDriver;

public class NationalDriverFactory {

    public static NationalDriver getNationalDriver(String name, String surname)
    {
        return new NationalDriver.NatDriverBuidler()
                .name(name)
                .surname(surname)
                .build();

    }

}
