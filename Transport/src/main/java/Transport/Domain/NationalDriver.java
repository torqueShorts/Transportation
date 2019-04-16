package Transport.Domain;

public class NationalDriver {


    private String name;
    private String surname;

    private NationalDriver()
    {
    }

    private NationalDriver(NatDriverBuidler builder)
    {
        this.name = builder.name;
        this.surname = builder.surname;
    }


    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }


    public static class NatDriverBuidler
    {
        private String name;
        private String surname;

        public NatDriverBuidler name(String name)
        {
            this.name = name;
            return this;
        }

        public NatDriverBuidler surname(String surname)
        {
            this.surname = surname;
            return this;
        }


        public NationalDriver build()
        {
            return new NationalDriver(this);
        }

    }



}
