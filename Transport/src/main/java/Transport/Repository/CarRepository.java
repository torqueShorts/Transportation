package Transport.Repository;

import Transport.Domain.Car;

import java.util.ArrayList;

public interface CarRepository extends MainRepository<Car, String>
{

    ArrayList<Car> getAll();
}
