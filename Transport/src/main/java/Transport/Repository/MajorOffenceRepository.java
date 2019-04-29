package Transport.Repository;

import Transport.Domain.MajorOffense;

import java.util.ArrayList;

public interface MajorOffenceRepository extends MainRepository<MajorOffense, String>
{

    ArrayList<MajorOffense> getAll();

}
