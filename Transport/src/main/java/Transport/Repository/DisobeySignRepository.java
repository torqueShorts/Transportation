package Transport.Repository;

import Transport.Domain.DisobeySigns;

import java.util.ArrayList;

public interface DisobeySignRepository extends MainRepository<DisobeySigns, String>
{
    ArrayList<DisobeySigns> getAll();

}
