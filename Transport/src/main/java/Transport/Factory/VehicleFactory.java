package Transport.Factory;

import Transport.Domain.Car;
import Transport.Domain.Vehicle;

public class VehicleFactory {


    public static Vehicle getVehicle(String vehLicense, String type, String driverID)
    {

        return new Vehicle.VehicleBuilder()
                .vehicleLicense(vehLicense)
                .type(type)
                .driverID(driverID)
                .build();
    }


}
