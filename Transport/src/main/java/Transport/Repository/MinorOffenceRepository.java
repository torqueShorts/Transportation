package Transport.Repository;

import Transport.Domain.Fine;
import Transport.Domain.MinorOffense;

import java.util.ArrayList;

public interface MinorOffenceRepository extends MainRepository<MinorOffense, String>
{
    ArrayList<MinorOffense> getAll();


}
