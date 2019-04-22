package Transport.Factory;

import Transport.Domain.Fine;
import Transport.Domain.MinorOffense;

public class MinorOffenseFactory {

    public static MinorOffense getMinorOffense(String type, Fine fine)
    {
        return new MinorOffense.MinorOffenceBuilder()
                .type(type)
                .fine(fine)
                .build();
    }

}
