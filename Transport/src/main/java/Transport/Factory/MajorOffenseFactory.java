package Transport.Factory;

import Transport.Domain.Fine;
import Transport.Domain.MajorOffense;

public class MajorOffenseFactory {

    public static MajorOffense getMajorOffense(String type, Fine fine)
    {
        return new MajorOffense.MajorOffenceBuilder()
                .type(type)
                .fine(fine)
                .build();
    }


}
