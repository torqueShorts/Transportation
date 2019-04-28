package Transport.Repository.Impl;

import Transport.Domain.Fine;
import Transport.Domain.MinorOffense;
import Transport.Factory.FineFactory;
import Transport.Factory.MinorOffenseFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinorOffenceRepositoryImplTest {

    MinorOffenceRepositoryImpl minorFine = MinorOffenceRepositoryImpl.getRepo();
    MinorOffenseFactory object = new MinorOffenseFactory();


    FineFactory fine = new FineFactory();

    Fine fin = fine.getFine("AR34895", "BC37584", "0817586", "MinorOffence", false);
    Fine fin2 = fine.getFine("AR56784", "BC7859", "0827684", "MinorOffence", false);

    MinorOffense value = object.getMinorOffense("OverSpeedLimitLow", fin);
    MinorOffense value2 = object.getMinorOffense("DisobeySign",fin2);
    MinorOffense value3 = object.getMinorOffense("DisobeySign",fin2);



    @Test
    public void create()
    {
        minorFine.create(value);
        minorFine.create(value2);

        int amount = minorFine.getAll().size();

        Assert.assertEquals(2,amount);
    }

    @Test
    public void update()
    {
        minorFine.create(value);
        minorFine.create(value2);

        MinorOffense min = minorFine.update(value3);

        Assert.assertEquals(value3, min);

    }

    @Test
    public void delete()
    {
        minorFine.create(value);
        minorFine.create(value2);

        String element = value.getFine().getFineNum();

        minorFine.delete(element);

        int amount = minorFine.getAll().size();

        Assert.assertEquals(1,amount);

    }

    @Test
    public void read()
    {
        minorFine.create(value);
        minorFine.create(value2);

        String element = value.getFine().getFineNum();

        MinorOffense min = minorFine.read(element);

        Assert.assertEquals(value, min);

    }

    @Test
    public void getAll()
    {
        minorFine.create(value);
        minorFine.create(value2);

        int amount = minorFine.getAll().size();

        Assert.assertEquals(2,amount);

    }
}