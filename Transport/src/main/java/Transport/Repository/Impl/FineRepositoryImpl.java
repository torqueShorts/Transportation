package Transport.Repository.Impl;

import Transport.Domain.Fine;
import Transport.Repository.FineRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FineRepositoryImpl implements FineRepository {

    private static FineRepositoryImpl repo = null;
    private ArrayList<Fine> fines;


    private FineRepositoryImpl()
    {
        this.fines = new ArrayList<Fine>();
    }

    public static FineRepositoryImpl getRepo()
    {
        if(repo == null)
        {
            repo = new FineRepositoryImpl();
        }
        return repo;
    }



    @Override
    public Fine create(Fine fine)
    {
        this.fines.add(fine);
        return fine;
    }

    @Override
    public Fine update(Fine fine)
    {
        int count = 1;

        Fine value = null;
        for(int i = 0; i < fines.size();i++)
        {
            if(fines.get(i) == fine)
            {
                fines.set(i,fine);
                count--;
                System.out.println("Driver has been updated");
                value = fines.get(i);
            }
        }

        if(count > 0)
        {
            System.out.println("Driver was not found");
        }
        return value;
    }

    @Override
    public void delete(String obj)
    {
        int count = 1;

        for(int i = 0; i < fines.size(); i++)
        {
            if(fines.get(i).getDriverID().equalsIgnoreCase(obj))
            {
                fines.remove(i);
                count--;
                System.out.println("Fine deleted");
            }
        }

        if(count > 0)
        {
            System.out.println("Fine not found");
        }

    }

    @Override
    public Fine read(String obj)
    {
        int count = 1;

        Fine fin = null;

        for(int i = 0; i < fines.size(); i++)
        {
            if(fines.get(i).getDriverID().equalsIgnoreCase(obj))
            {
                fin = fines.get(i);
                count--;
                System.out.println("Fine recorded");
            }

        }

        if(count > 0)
        {
            System.out.println("Fine was not found");
        }

        return fin;
    }

    @Override
    public ArrayList<Fine> getAll()
    {
        return this.fines;
    }
}
