package Transport.Repository.Impl;

import Transport.Domain.TrafficOfficer;
import Transport.Repository.TrafficOfficerRepository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TrafficOfficerRepositoryImpl implements TrafficOfficerRepository
{

    private static TrafficOfficerRepositoryImpl repo;
    private ArrayList<TrafficOfficer> trafficOfficers;

    private TrafficOfficerRepositoryImpl()
    {
        this.trafficOfficers = new ArrayList<TrafficOfficer>();
    }

    public static TrafficOfficerRepositoryImpl getRepo()
    {
        if(repo == null)
        {
            repo = new TrafficOfficerRepositoryImpl();
        }
        return repo;
    }



    @Override
    public TrafficOfficer create(TrafficOfficer officer)
    {
        this.trafficOfficers.add(officer);
        return officer;
    }

    @Override
    public TrafficOfficer update(TrafficOfficer trafficOfficer)
    {
        int count = 1;

        TrafficOfficer val = null;

        for(int i = 0; i < trafficOfficers.size(); i++)
        {
            if(trafficOfficers.get(i).getOfficerID() == trafficOfficer.getOfficerID())
            {
                trafficOfficers.set(i,trafficOfficer);
                count--;
                System.out.println("Traffic Officer has been updated");
                val = trafficOfficers.get(i);
            }
        }

        if(count > 0)
        {
            System.out.println("Traffic officer was not found");
        }

        return val;
    }

    @Override
    public void delete(String obj)
    {
        int count = 1;

        for(int i = 0; i < trafficOfficers.size(); i++)
        {
            if(trafficOfficers.get(i).getOfficerID().equalsIgnoreCase(obj))
            {
                trafficOfficers.remove(i);
            }
        }

        if(count > 0)
        {
            System.out.println("Officer not found");
        }
    }

    @Override
    public TrafficOfficer read(String obj)
    {
        int count = 1;

        TrafficOfficer val = null;

        for(int i = 0; i < trafficOfficers.size(); i++)
        {
            if(trafficOfficers.get(i).getOfficerID().equalsIgnoreCase(obj))
            {
                val = trafficOfficers.get(i);
                count--;
                System.out.println("Officer recorded");
            }
        }

        if(count > 0)
        {
            System.out.println("Office does not exist");
        }

        return val;
    }

    @Override
    public ArrayList<TrafficOfficer> getAll()
    {
        return this.trafficOfficers;
    }
}
