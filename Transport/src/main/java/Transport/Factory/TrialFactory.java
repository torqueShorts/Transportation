package Transport.Factory;

import Transport.Domain.Trial;

public class TrialFactory {

    public static Trial getTrial(String date, boolean reason)
    {
        return new Trial.TrialBuilder()
                .date(date)
                .reason(reason)
                .build();
    }



}
