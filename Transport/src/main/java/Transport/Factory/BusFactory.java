package Transport.Factory;

import Transport.Domain.Bus;

public class BusFactory {

    public static Bus getBus(String colour, String model)
    {
        return new Bus.BusBuilder()
                .colour(colour)
                .model(model)
                .build();
    }





}
