package Transport.Repository;

import Transport.Domain.TrafficChief;

import java.util.ArrayList;

public interface TrafficChiefRepository extends MainRepository<TrafficChief, String>
{
    ArrayList<TrafficChief> getAll();
}
