package Transport.Domain;

public class OverSpeedLimitHigh {

    private int speedLimit;
    private int carSpeed;

    private OverSpeedLimitHigh()
    {

    }

    private OverSpeedLimitHigh(OverHighBuilder builder)
    {
        this.speedLimit = builder.speedLimit;
        this.carSpeed = builder.carSpeed;
    }

    public int getSpeedLimit()
    {
        return speedLimit;
    }

    public int getCarSpeed()
    {
        return carSpeed;
    }

    public static class OverHighBuilder
    {
        private int speedLimit;
        private int carSpeed;


        public OverHighBuilder speedLimit(int speedLimit)
        {
            this.speedLimit = speedLimit;
            return this;
        }

        public OverHighBuilder carSpeed(int carSpeed)
        {
            this.carSpeed = carSpeed;
            return this;
        }

        public OverSpeedLimitHigh build()
        {
            return new OverSpeedLimitHigh(this);
        }

    }










}

