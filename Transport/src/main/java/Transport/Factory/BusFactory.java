package Transport.Factory;

import Transport.Domain.Bus;
import Transport.Domain.Vehicle;

public class BusFactory {

    public static Bus getBus(String colour, String model, Vehicle veh)
    {
        return new Bus.BusBuilder()
                .colour(colour)
                .model(model)
                .vehicle(veh)
                .build();
    }





}
