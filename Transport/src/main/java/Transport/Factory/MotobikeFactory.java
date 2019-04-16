package Transport.Factory;

import Transport.Domain.Motorbike;

public class MotobikeFactory {

    public static Motorbike getCar(String colour, String model)
    {
        return new Motorbike.MotorbikeBuilder()
                .colour(colour)
                .model(model)
                .build();
    }





}
