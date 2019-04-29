package Transport.Repository.Impl;

import Transport.Domain.DisobeySigns;
import Transport.Domain.Fine;
import Transport.Factory.DisobeySignsFactory;
import Transport.Factory.FineFactory;
import Transport.Repository.DisobeySignRepository;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DisobeySignRepositoryImplTest {

    DisobeySignRepositoryImpl disobey = DisobeySignRepositoryImpl.getRepo();
    DisobeySignsFactory object = new DisobeySignsFactory();

    FineFactory fine = new FineFactory();

    Fine fin = fine.getFine("AR34895", "BC37584", "0817586", "MinorOffence", false);
    Fine fin2 = fine.getFine("AR56784", "BC7859", "0827684", "MinorOffence", false);

    DisobeySigns value = object.getDisobeySign("OverSpeedLimitLow",100, fin);
    DisobeySigns value2 = object.getDisobeySign("DisobeySign",200,fin2);
    DisobeySigns value3 = object.getDisobeySign("DisobeySign",300,fin2);



    @Test
    public void create()
    {
        disobey.create(value);
        disobey.create(value2);

        int amount = disobey.getAll().size();

        Assert.assertEquals(2,amount);

    }

    @Test
    public void update()
    {
        disobey.create(value);
        disobey.create(value2);

        DisobeySigns min = disobey.update(value3);

        Assert.assertEquals(value3, min);
    }

    @Test
    public void delete()
    {
        disobey.create(value);
        disobey.create(value2);

        String element = value.getFine().getFineNum();

        disobey.delete(element);

        int amount = disobey.getAll().size();

        Assert.assertEquals(1,amount);


    }

    @Test
    public void read()
    {
        disobey.create(value);
        disobey.create(value2);

        String element = value.getFine().getFineNum();

        DisobeySigns min = disobey.read(element);

        Assert.assertEquals(value, min);


    }

    @Test
    public void getAll()
    {
        disobey.create(value);
        disobey.create(value2);

        int amount = disobey.getAll().size();

        Assert.assertEquals(2,amount);

    }
}