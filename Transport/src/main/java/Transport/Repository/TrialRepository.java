package Transport.Repository;

import Transport.Domain.Trial;

import java.util.ArrayList;

public interface TrialRepository extends MainRepository<Trial,String>
{
    ArrayList<Trial> getAll();
}
