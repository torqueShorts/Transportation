package Transport.Domain;

public class Bus {


    private String colour;
    private String model;

    private Bus()
    {

    }

    private Bus(BusBuilder builder)
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

    public static class BusBuilder
    {
        private String colour;
        private String model;

        public BusBuilder colour(String colour)
        {
            this.colour = colour;
            return this;
        }

        public BusBuilder model(String model)
        {
            this.model = model;
            return this;
        }

        public Bus build()
        {
            return new Bus(this);
        }

    }




}
