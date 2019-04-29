package Transport.Repository;

import Transport.Domain.OverSpeedLimitHigh;

import java.util.ArrayList;

public interface OverSpeedLimitHighRepository extends MainRepository<OverSpeedLimitHigh,String>
{
    ArrayList<OverSpeedLimitHigh> getAll();
}
