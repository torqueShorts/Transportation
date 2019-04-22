package Transport.Factory;

import Transport.Domain.Vehicle;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MotobikeFactoryTest {

    @Test
    public void getCar() {

        VehicleFactory veh = new VehicleFactory();

        String colour = "Black";
        String model = "Kawasaki Ninja";
        Vehicle value = veh.getVehicle("TC27238945", "Motorbike", "0817849506");

        Assert.assertEquals("Motorbike: \n Motorbike colour: Black\n Motorbike model: Kawasaki Ninja\n Motorbike license: TC27238945\n Vehicle type: Motorbike\n Driver ID: 0817849506",
                MotobikeFactory.getMotorbike(colour,model, value).toString());



    }
}