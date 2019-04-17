package Transport.Factory;

import Transport.Domain.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarFactoryTest {



    @Before
    public void setUp() throws Exception {



    }

    @Test
    public void getCar() {



        String colour = "Blue";
        String model = "BMW";


        Assert.assertEquals("Car: \n Car colour: Blue\n Car model: BMW", CarFactory.getCar(colour,model).toString());


    }
}