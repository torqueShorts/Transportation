package Transport.Repository.Impl;

import Transport.Domain.Driver;
import Transport.Factory.DriverFactory;
import Transport.Repository.DriverRepository;
import com.sun.xml.internal.ws.policy.AssertionSet;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DriverRepositoryImplTest {

    DriverRepositoryImpl driver = DriverRepositoryImpl.getRepo();
    DriverFactory dri = new DriverFactory();

    Driver value = dri.getDriver("081475354", "AC7465993", true);
    Driver value2 = dri.getDriver("081374657", "AC465498", false);
    Driver value3 = dri.getDriver("081374657", "AC461234", false);



    @Test
    public void create()
    {

        driver.create(value);
        driver.create(value2);

        int amount = driver.getAll().size();

        Assert.assertEquals(2,amount);

    }

    @Test
    public void read()
    {
        driver.create(value);
        driver.create(value2);

        String element = "081475354";

        Driver driveValue = driver.read(element);

        Assert.assertEquals(value, driveValue);

    }

    @Test
    public void delete()
    {
        driver.create(value);
        driver.create(value2);

        String element = value.getDriverID();

        driver.delete(element);

        int amount = driver.getAll().size();

        Assert.assertEquals(1,amount);

    }

    @Test
    public void update()
    {
        driver.create(value);
        driver.create(value2);

        Driver drive = driver.update(value3);

        Assert.assertEquals(value3,drive);
    }

    @Test
    public void getAll()
    {
        driver.create(value);
        driver.create(value2);

        int amount = driver.getAll().size();

        Assert.assertEquals(2, amount);

    }
}