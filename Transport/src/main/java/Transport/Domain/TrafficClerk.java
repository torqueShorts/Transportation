package Transport.Domain;

public class TrafficClerk {

    private String clerkID;
    private String name;
    private String surname;

    private boolean finePaid;

    private TrafficClerk(TrafficClerkBuilder builder)
    {
        this.clerkID = builder.clerkID;
        this.name = builder.name;
        this.surname = builder.surname;
        this.finePaid = builder.finePaid;
    }


    public String getClerkID()
    {
        return clerkID;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public boolean getFinePaid()
    {
        return finePaid;
    }







    public static class TrafficClerkBuilder
    {

        private String clerkID;
        private String name;
        private String surname;

        private boolean finePaid;

        public TrafficClerkBuilder clerkID(String clerkID)
        {
            this.clerkID = clerkID;
            return this;
        }

        public TrafficClerkBuilder name(String name)
        {
            this.name = name;
            return this;
        }

        public TrafficClerkBuilder surname(String surname)
        {
            this.surname = surname;
            return this;
        }

        public TrafficClerkBuilder finePaid(boolean finePaid)
        {
            this.finePaid = finePaid;
            return this;
        }





        public TrafficClerk build()
        {
            return new TrafficClerk(this);
        }

    }





}
