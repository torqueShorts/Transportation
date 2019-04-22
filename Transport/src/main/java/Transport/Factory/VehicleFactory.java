package Transport.Factory;

import Transport.Domain.Vehicle;

public class VehicleFactory {


    public static Vehicle getVehicle(String vehLicense, String driverID, String type)
    {
        return new Vehicle.VehicleBuilder()
                .vehicleLicense(vehLicense)
                .driverID(driverID)
                .type(type)
                .build();
    }


}
