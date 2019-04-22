package Transport.Factory;

import Transport.Domain.Car;
import Transport.Domain.Vehicle;

public class CarFactory {

    public static Car getCar(String colour, String model, Vehicle vhe)
    {
        return new Car.CarBuilder()
                .colour(colour)
                .model(model)
                .veh(vhe)
                .build();
    }


}
