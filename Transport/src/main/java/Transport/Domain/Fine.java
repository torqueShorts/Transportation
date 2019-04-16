package Transport.Domain;

public class Fine {

    private String vehLicense;
    private String driverID;
    private int amount;
    private boolean finePaid;

    private Fine()
    {

    }

    private Fine(FineBuilder builder)
    {
        this.vehLicense = builder.vehLicense;
        this.driverID = builder.driverID;
        this.amount = builder.amount;
        this.finePaid = builder.finePaid;
    }

    public String getVehLicense()
    {
        return vehLicense;
    }

    public String getDriverID()
    {
        return driverID;
    }

    public int getAmount()
    {
        return amount;
    }

    public boolean getFinePaid()
    {
        return finePaid;
    }

    public static class FineBuilder
    {
        private String vehLicense;
        private String driverID;
        private int amount;
        private boolean finePaid;


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

        public FineBuilder amount(int amount)
        {
            this.amount = amount;
            return this;
        }

        public FineBuilder finePaid(boolean finePaid)
        {
            this.finePaid = finePaid;
            return this;
        }

        public Fine build()
        {
            return new Fine(this);
        }

    }





}
