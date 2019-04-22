package Transport.Factory;

import Transport.Domain.Vehicle;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeavyDutyFactoryTest {

    @Test
    public void getHeavyDuty() {

        VehicleFactory veh = new VehicleFactory();

        String colour = "Peach";
        String model = "Truck";
        Vehicle value = veh.getVehicle("LR2375869", "HeavyDuty", "064578932");

        Assert.assertEquals("HeavyDuty: \n HeavyDuty colour: Peach\n HeavyDuty model: Truck\n HeavyDuty license: LR2375869\n Vehicle type: HeavyDuty\n Driver ID: 064578932",
                HeavyDutyFactory.getHeavyDuty(colour,model, value).toString());





    }
}