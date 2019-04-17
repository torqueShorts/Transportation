package Transport.Factory;

import Transport.Domain.MinorOffense;

public class MinorOffenseFactory {

    public static MinorOffense getMinorOffense(String type, int amount)
    {
        return new MinorOffense.MinorOffenceBuilder()
                .type(type)
                .amount(amount)
                .build();
    }

}
