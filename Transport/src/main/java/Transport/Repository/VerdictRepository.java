package Transport.Repository;

import Transport.Domain.Verdict;

import java.util.ArrayList;
import java.util.Set;

public interface VerdictRepository extends MainRepository<Verdict, String>
{
    ArrayList<Verdict> getAll();
}
