package Transport.Factory;

import Transport.Domain.Motorbike;
import Transport.Domain.Vehicle;

public class MotobikeFactory {

    public static Motorbike getMotorbike(String colour, String model, Vehicle veh)
    {
        return new Motorbike.MotorbikeBuilder()
                .colour(colour)
                .model(model)
                .vehicle(veh)
                .build();
    }





}
