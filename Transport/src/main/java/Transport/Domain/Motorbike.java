package Transport.Domain;

public class Motorbike {

    private String colour;
    private String model;

    private Motorbike()
    {

    }

    private Motorbike(MotorbikeBuilder builder)
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

    public static class MotorbikeBuilder
    {
        private String colour;
        private String model;

        public MotorbikeBuilder colour(String colour)
        {
            this.colour = colour;
            return this;
        }

        public MotorbikeBuilder model(String model)
        {
            this.model = model;
            return this;
        }

        public Motorbike build()
        {
            return new Motorbike(this);
        }

    }



}
