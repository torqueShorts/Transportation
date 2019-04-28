package Transport.Repository;

import Transport.Domain.Vehicle;
import Transport.Domain.HeavyDuty;
import Transport.Domain.Bus;
import Transport.Domain.Taxi;
import Transport.Domain.Motorbike;
import Transport.Domain.Car;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashMap;

public interface VehicleRepository extends MainRepository<Vehicle, String>
{

    ArrayList<Vehicle> getAll();

}
