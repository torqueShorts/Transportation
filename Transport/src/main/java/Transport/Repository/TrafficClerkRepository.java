package Transport.Repository;

import Transport.Domain.TrafficClerk;

import java.util.ArrayList;
import java.util.Set;

public interface TrafficClerkRepository extends MainRepository<TrafficClerk, String>
{
    ArrayList<TrafficClerk> getAll();
}
