package Transport.Domain;

public class Taxi {

    private String colour;
    private String model;

    private Taxi()
    {

    }

    private Taxi(TaxiBuilder builder)
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

    public static class TaxiBuilder
    {
        private String colour;
        private String model;

        public TaxiBuilder colour(String colour)
        {
            this.colour = colour;
            return this;
        }

        public TaxiBuilder model(String model)
        {
            this.model = model;
            return this;
        }

        public Taxi build()
        {
            return new Taxi(this);
        }

    }




}
