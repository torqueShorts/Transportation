package Transport.Repository;

import Transport.Domain.Fine;

import java.util.ArrayList;
import java.util.Set;

public interface FineRepository extends MainRepository<Fine, String>
{
    ArrayList<Fine> getAll();
}
