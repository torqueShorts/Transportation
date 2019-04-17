package Transport.Domain;

public class Car {

    private String colour;
    private String model;

    private Car()
    {

    }

    private Car(CarBuilder builder)
    {
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

    public static class CarBuilder
    {
        private String colour;
        private String model;

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

        public Car build()
        {
            return new Car(this);
        }

    }

    @Override

    public String toString() {
        return "Car: \n Car colour: " + colour + "\n Car model: " + model;
    }




}
