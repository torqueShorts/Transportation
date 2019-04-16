package Transport.Domain;

public class OverSpeedLimitLow {

    private int speedLimit;
    private int carSpeed;

    private OverSpeedLimitLow()
    {

    }

    private OverSpeedLimitLow(OverLowBuilder builder)
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

    public static class OverLowBuilder
    {
        private int speedLimit;
        private int carSpeed;


        public OverLowBuilder speedLimit(int speedLimit)
        {
            this.speedLimit = speedLimit;
            return this;
        }

        public OverLowBuilder carSpeed(int carSpeed)
        {
            this.carSpeed = carSpeed;
            return this;
        }

        public OverSpeedLimitLow build()
        {
            return new OverSpeedLimitLow(this);
        }

    }










}
