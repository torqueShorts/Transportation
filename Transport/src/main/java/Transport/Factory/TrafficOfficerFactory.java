package Transport.Factory;

import Transport.Domain.TrafficOfficer;

public class TrafficOfficerFactory
{
    public static TrafficOfficer getOfficer(String officerID, String name, String surname, String finDue, String warrant)
    {
        return new TrafficOfficer.TrafficOfficerBuilder()
                .officerID(officerID)
                .name(name)
                .surname(surname)
                .fineDue(finDue)
                .warrant(warrant)
                .build();
    }



}
