package Transport.Domain;

public class Car {

    private Vehicle veh;
    private String colour;
    private String model;

    private Car()
    {

    }

    private Car(CarBuilder builder)
    {
        this.veh = builder.veh;
        this.colour = builder.colour;
        this.model = builder.model;

    }

    public String getColour()
    {
        return colour;
    }

    public String getModel()
    {
        return model;
    }

    public Vehicle getVeh()
    {
        return veh;
    }

    public static class CarBuilder
    {
        private String colour;
        private String model;
        private Vehicle veh;

        public CarBuilder colour(String colour)
        {
            this.colour = colour;
            return this;
        }

        public CarBuilder model(String model)
        {
            this.model = model;
            return this;
        }

        public CarBuilder veh(Vehicle veh)
        {
            this.veh = veh;
            return this;
        }

        public Car build()
        {
            return new Car(this);
        }

    }

    @Override

    public String toString() {
        return "Bus: \n Bus colour: " + colour + "\n Bus model: " + model + "\n " +
                "Bus license: " + veh.getVehicleLicense() + "\n Vehicle type: " + veh.getType() + "\n Driver ID: " + veh.getDriverID();
    }




}
