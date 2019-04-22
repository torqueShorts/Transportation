package Transport.Domain;

public class Trial {

    private String date;
    private String driverID;
    private String vehicleID;


    private Trial()
    {

    }

    private Trial(TrialBuilder builder)
    {
        this.date = builder.date;
        this.driverID = builder.driverID;
        this.vehicleID = builder.vehicleID;
    }

    public String getDate()
    {
        return date;
    }

    public String getDriverID(){ return driverID; }

    public String getVehicleID(){ return vehicleID; }

    public static class TrialBuilder
    {
        private String date;
        private String driverID;
        private String vehicleID;


        public TrialBuilder date(String date)
        {
            this.date = date;
            return this;
        }

        public TrialBuilder driverID(String driverID)
        {
            this.driverID = driverID;
            return this;
        }

        public TrialBuilder vehicleID(String vehicleID)
        {
            this.vehicleID = vehicleID;
            return this;
        }


        public Trial build()
        {
            return new Trial(this);
        }

    }

    public String toString()
    {
        return "Date of Trial: " + date + "\nDriver ID: " + driverID + "\nVehicle ID: " + vehicleID;
    }

}
