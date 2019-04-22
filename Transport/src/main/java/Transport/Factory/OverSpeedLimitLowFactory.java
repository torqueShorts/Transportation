package Transport.Factory;

import Transport.Domain.Fine;
import Transport.Domain.OverSpeedLimitLow;

public class OverSpeedLimitLowFactory {

    public static OverSpeedLimitLow getOverSpeedLimitLow(int speedLimit, int carSpeed, int amount, Fine fine)
    {
        return new OverSpeedLimitLow.OverLowBuilder()
                .speedLimit(speedLimit)
                .carSpeed(carSpeed)
                .amount(amount)
                .fine(fine)
                .build();
    }


}
