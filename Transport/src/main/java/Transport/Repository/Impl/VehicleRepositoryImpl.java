package Transport.Repository.Impl;

import Transport.Domain.Vehicle;
import Transport.Repository.VehicleRepository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class VehicleRepositoryImpl implements VehicleRepository {

    private static VehicleRepositoryImpl repo;
    private ArrayList<Vehicle> vehicles;

    private VehicleRepositoryImpl()
    {
        this.vehicles = new ArrayList<Vehicle>();
    }

    public static VehicleRepositoryImpl getRepo()
    {
        if(repo == null)
        {
            repo = new VehicleRepositoryImpl();
        }

        return repo;
    }


    @Override
    public Vehicle create(Vehicle vehicle)
    {
        this.vehicles.add(vehicle);
        return vehicle;
    }

    @Override
    public Vehicle update(Vehicle vehicle)
    {
        int count = 1;

        for(int i = 0; i < vehicles.size(); i++)
        {
            if(vehicles.get(i) == vehicle)
            {
                vehicles.set(i,vehicle);
                count--;
                System.out.println("Vehicle updated");
            }
        }

        if(count > 0)
        {
            System.out.println("Vehicle not found");
        }

        return vehicle;
    }

    @Override
    public void delete(String vehicleLicense)
    {
        int count = 1;

        for(int i = 0; i < vehicles.size(); i++)
        {
            if(vehicles.get(i).getVehicleLicense().equalsIgnoreCase(vehicleLicense))
            {
                vehicles.remove(i);
                count--;
                System.out.println("Vehicle has been removed");
            }
        }

        if(count > 0)
        {
            System.out.println("Vehicle was not found");
        }
    }

    @Override
    public Vehicle read(String obj)
    {
        int count = 1;

        Vehicle veh = null;

        for(int i = 0; i < vehicles.size(); i++)
        {
            if(vehicles.get(i).getDriverID().equalsIgnoreCase(obj))
            {
                veh = vehicles.get(i);
                count--;
                System.out.println("vehicle recorded");
            }
        }

        if(count > 0)
        {
            System.out.println("vehicle does not exist");
        }

        return veh;
    }

    @Override
    public ArrayList<Vehicle> getAll()
    {
        return this.vehicles;
    }

}
