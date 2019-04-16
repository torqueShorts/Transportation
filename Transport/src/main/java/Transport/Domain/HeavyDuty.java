package Transport.Domain;

public class HeavyDuty {

    private String colour;
    private String model;

    private HeavyDuty()
    {

    }

    private HeavyDuty(HeavyDutyBuilder builder)
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

    public static class HeavyDutyBuilder
    {
        private String colour;
        private String model;

        public HeavyDutyBuilder colour(String colour)
        {
            this.colour = colour;
            return this;
        }

        public HeavyDutyBuilder model(String model)
        {
            this.model = model;
            return this;
        }

        public HeavyDuty build()
        {
            return new HeavyDuty(this);
        }

    }






}

