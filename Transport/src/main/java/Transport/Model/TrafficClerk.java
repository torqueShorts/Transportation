package Transport.Model;

public class TrafficClerk {

    private String clerkID;
    private String name;
    private String surname;

    private boolean finePaid;


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

    private TrafficClerk(TrafficClerkBuilder builder)
    {
        this.clerkID = builder.clerkID;
        this.name = builder.name;
        this.surname = builder.surname;
        this.finePaid = builder.finePaid;
    }





    public static class TrafficClerkBuilder
    {

        private String clerkID;
        private String name;
        private String surname;

        private boolean finePaid;

        public TrafficClerkBuilder(String clerkID, String name, String surname)
        {
            this.clerkID = clerkID;
            this.name = name;
            this.surname = surname;
        }

        public TrafficClerkBuilder setFinePaid(boolean finePaid)
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
