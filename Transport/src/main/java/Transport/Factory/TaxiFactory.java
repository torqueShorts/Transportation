package Transport.Factory;

import Transport.Domain.Taxi;
import Transport.Domain.Vehicle;

public class TaxiFactory {

    public static Taxi getTaxi(String colour, String model, Vehicle veh)
    {
        return new Taxi.TaxiBuilder()
                .colour(colour)
                .model(model)
                .veh(veh)
                .build();
    }


}
