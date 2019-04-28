package Transport.Factory;

import Transport.Domain.TrafficClerk;

public class TrafficClerkFactory
{

    public static TrafficClerk getTrafficClerk(String clerkID, String name, String surname, String fineCode, boolean finePaid)
    {
        return new TrafficClerk.TrafficClerkBuilder()
                .clerkID(clerkID)
                .name(name)
                .surname(surname)
                .fineCode(fineCode)
                .build();
    }

}
