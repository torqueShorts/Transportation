package Transport.Repository;

import Transport.Domain.Driver;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

public interface DriverRepository extends MainRepository<Driver, String>
{
    ArrayList<Driver> getAll();
}
