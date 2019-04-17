package Transport.Factory;

import Transport.Domain.InternationalDriver;

public class InternationalDriverFactory {

    public static InternationalDriver getInternationalDriver(String name, String surname, boolean vehOwned)
    {
        return new InternationalDriver.IntDriverBuidler()
                .name(name)
                .surname(surname)
                .vehOwned(vehOwned)
                .build();
    }



}
