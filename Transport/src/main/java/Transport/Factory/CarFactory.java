package Transport.Factory;

import Transport.Domain.Car;

public class CarFactory {

    public static Car getCar(String colour, String model)
    {
        return new Car.CarBuilder()
                .colour(colour)
                .model(model)
                .build();
    }


}
