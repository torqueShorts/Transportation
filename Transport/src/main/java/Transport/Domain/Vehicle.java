package Transport.Domain;

public class Vehicle {

    private String vehicleLicense;
    private String type;
    private String colour;
    private String driverID;

    private Vehicle()
    {

    }

    private Vehicle(VehicleBuilder builder)
    {
        this.vehicleLicense = builder.vehicleLicense;
        this.type = builder.type;
        this.colour = builder.colour;
        this.driverID = builder. driverID;
    }

    public String getVehicleLicense()
    {
        return vehicleLicense;
    }

    public String getType()
    {
        return type;
    }

    public String getColour()
    {
        return colour;
    }

    public String getDriverID()
    {
        return driverID;
    }

    public static class VehicleBuilder {
        private String vehicleLicense;
        private String type;
        private String colour;
        private String driverID;

        public VehicleBuilder vehicleLicense(String vehicleLicense) {
            this.vehicleLicense = vehicleLicense;
            return this;
        }

        public VehicleBuilder type(String type) {
            this.type = type;
            return this;
        }

        public VehicleBuilder colour(String colour) {
            this.colour = colour;
            return this;
        }

        public VehicleBuilder driverID(String driverID) {
            this.driverID = driverID;
            return this;
        }


        public Vehicle build() {
            return new Vehicle(this);
        }


        @Override

        public String toString() {
            return "Vehicle {" + "\n Vehicle License = " + vehicleLicense + "\n Driver ID: " + driverID + "\n Colour: " + colour + "\n" +
                    " Type: " + type + "\n " + "} ";
        }


    }
}
