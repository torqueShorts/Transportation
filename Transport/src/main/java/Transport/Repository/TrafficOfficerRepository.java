package Transport.Repository;

import Transport.Domain.TrafficOfficer;

import java.util.ArrayList;
import java.util.Set;

public interface TrafficOfficerRepository extends MainRepository<TrafficOfficer, String>
{
    ArrayList<TrafficOfficer> getAll();

}
