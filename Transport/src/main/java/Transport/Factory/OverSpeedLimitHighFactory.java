package Transport.Factory;

import Transport.Domain.Fine;
import Transport.Domain.OverSpeedLimitHigh;

public class OverSpeedLimitHighFactory {

    public static OverSpeedLimitHigh getOverSpeedLimit(int speedLimit, int carSpeed, String date, Fine fine)
    {
        return new OverSpeedLimitHigh.OverHighBuilder()
                .speedLimit(speedLimit)
                .carSpeed(carSpeed)
                .date(date)
                .fine(fine)
                .build();
    }


}
