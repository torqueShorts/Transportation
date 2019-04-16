package Transport.Factory;

import Transport.Domain.HitNRun;

public class HitNRunFactory {

    public static HitNRun getHitNRun(String location, String date)
    {
        return new HitNRun.HitNRunBuilder()
                .location(location)
                .date(date)
                .build();
    }


}
