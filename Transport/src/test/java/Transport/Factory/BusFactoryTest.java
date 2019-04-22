package Transport.Factory;

import Transport.Domain.Vehicle;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BusFactoryTest {

    @Test
    public void getBus() {

        VehicleFactory veh = new VehicleFactory();

        String colour = "Green";
        String model = "Golden Arrow";
        Vehicle value = veh.getVehicle("WD1236789", "Bus", "0845679321");

        Assert.assertEquals("Bus: \n Bus colour: Green\n Bus model: Golden Arrow\n Bus license: WD1236789\n Vehicle type: Bus\n Driver ID: 0845679321",
                BusFactory.getBus(colour,model, value).toString());


    }
}