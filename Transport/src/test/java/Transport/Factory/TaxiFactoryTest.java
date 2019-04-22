package Transport.Factory;

import Transport.Domain.Vehicle;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaxiFactoryTest {

    @Test
    public void getTaxi() {

        VehicleFactory veh = new VehicleFactory();

        String colour = "White";
        String model = "Toyota Quantum";
        Vehicle value = veh.getVehicle("RS23456", "Taxi", "28374905");

        Assert.assertEquals("Taxi: \n Taxi colour: White\n Taxi model: Toyota Quantum\n Taxi license: RS23456\n Vehicle type: Taxi\n Driver ID: 28374905",
                TaxiFactory.getTaxi(colour,model, value).toString());





    }
}