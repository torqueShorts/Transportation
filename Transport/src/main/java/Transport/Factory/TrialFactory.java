package Transport.Factory;

import Transport.Domain.Trial;

public class TrialFactory {

    public static Trial getTrial(String date, String driverID, String vehicleID)
    {
        return new Trial.TrialBuilder()
                .date(date)
                .driverID(driverID)
                .vehicleID(vehicleID)
                .build();
    }



}
