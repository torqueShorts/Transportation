package Transport.Factory;

import Transport.Domain.Vehicle;

public class VehicleFactory {


    public static Vehicle getVehicle(String vehLicense, String type, String colour, String driverID)
    {
        return new Vehicle.VehicleBuilder().vehicleLicense(vehLicense).type(type).colour(colour).driverID(driverID).build();
    }


}
