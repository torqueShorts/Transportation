package Transport.Factory;

import Transport.Domain.TrafficChief;

public class TraffiChiefFactory {

    public static TrafficChief getTrafficChief(String chiefID, String name, String surname, String fineCode)
    {
        return new TrafficChief.TrafficChiefBuilder().chiefID(chiefID)
                .name(name)
                .surname(surname)
                .fineCode(fineCode)
                .build();
    }
}
