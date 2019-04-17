package Transport.Factory;

import Transport.Domain.OverSpeedLimitLow;

public class OverSpeedLimitLowFactory {

    public static OverSpeedLimitLow getOverSpeedLimitLow(int speedLimit, int carSpeed)
    {
        return new OverSpeedLimitLow.OverLowBuilder()
                .speedLimit(speedLimit)
                .carSpeed(carSpeed)
                .build();
    }


}
