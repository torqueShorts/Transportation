package Transport.Domain;

public class Fine {

    private String vehLicense;
    private String driverID;
    private String type;
    private boolean finePaid;

    private Fine()
    {

    }

    private Fine(FineBuilder builder)
    {
        this.vehLicense = builder.vehLicense;
        this.driverID = builder.driverID;
        this.finePaid = builder.finePaid;
        this.type = builder.type;
    }

    public String getVehLicense()
    {
        return vehLicense;
    }

    public String getDriverID()
    {
        return driverID;
    }

    public boolean getFinePaid()
    {
        return finePaid;
    }

    public String getType()
    {
        return type;
    }

    public static class FineBuilder
    {
        private String vehLicense;
        private String driverID;
        private boolean finePaid;
        private String type;


        public FineBuilder vehLicense(String vehLicense)
        {
            this.vehLicense = vehLicense;
            return this;
        }

        public FineBuilder driverID(String driverID)
        {
            this.driverID = driverID;
            return this;
        }


        public FineBuilder finePaid(boolean finePaid)
        {
            this.finePaid = finePaid;
            return this;
        }

        public FineBuilder type(String type)
        {
            this.type = type;
            return this;
        }

        public Fine build()
        {
            return new Fine(this);
        }

    }

    public String toString()
    {
        return "";
    }





}
