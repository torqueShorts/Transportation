package Transport.Factory;

import Transport.Domain.TrafficClerk;

public class TrafficClerkFactory {


    public static TrafficClerk getTrafficChief(String clerkID, String name, String surname, boolean finePaid)
    {
        return new TrafficClerk.TrafficClerkBuilder().clerkID(clerkID)
                .name(name)
                .surname(surname)
                .finePaid(finePaid)
                .build();
    }

}
