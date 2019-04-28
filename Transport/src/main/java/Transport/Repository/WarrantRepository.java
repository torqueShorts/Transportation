package Transport.Repository;

import Transport.Domain.Warrant;

import java.util.ArrayList;
import java.util.Set;

public interface WarrantRepository extends MainRepository<Warrant, String>
{
    ArrayList<Warrant> getAll();
}

