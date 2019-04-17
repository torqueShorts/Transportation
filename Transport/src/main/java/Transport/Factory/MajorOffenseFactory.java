package Transport.Factory;

import Transport.Domain.MajorOffense;

public class MajorOffenseFactory {

    public static MajorOffense getMajorOffense(String type, int amount)
    {
        return new MajorOffense.MajorOffenceBuilder()
                .type(type)
                .amount(amount)
                .build();
    }


}
