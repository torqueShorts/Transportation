package Transport.Factory;

import Transport.Domain.HeavyDuty;

public class HeavyDutyFactory {

    public static HeavyDuty getHeavyDuty(String colour, String model)
    {
        return new HeavyDuty.HeavyDutyBuilder()
                .colour(colour)
                .model(model)
                .build();
    }






}
