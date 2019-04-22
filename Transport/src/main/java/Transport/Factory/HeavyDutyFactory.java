package Transport.Factory;

import Transport.Domain.HeavyDuty;
import Transport.Domain.Vehicle;

public class HeavyDutyFactory {

    public static HeavyDuty getHeavyDuty(String colour, String model, Vehicle veh)
    {
        return new HeavyDuty.HeavyDutyBuilder()
                .colour(colour)
                .model(model)
                .vehicle(veh)
                .build();
    }






}
