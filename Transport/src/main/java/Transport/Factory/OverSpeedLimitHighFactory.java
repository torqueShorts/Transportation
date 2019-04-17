package Transport.Factory;

import Transport.Domain.OverSpeedLimitHigh;

public class OverSpeedLimitHighFactory {

    public static OverSpeedLimitHigh getOverSpeedLimit(int speedLimit, int carSpeed)
    {
        return new OverSpeedLimitHigh.OverHighBuilder()
                .speedLimit(speedLimit)
                .carSpeed(carSpeed)
                .build();
    }


}
