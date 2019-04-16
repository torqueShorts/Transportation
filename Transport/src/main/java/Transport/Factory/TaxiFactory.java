package Transport.Factory;

import Transport.Domain.Taxi;

public class TaxiFactory {

    public static Taxi getTaxi(String colour, String model)
    {
        return new Taxi.TaxiBuilder()
                .colour(colour)
                .model(model)
                .build();
    }


}
