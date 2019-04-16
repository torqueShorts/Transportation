package Transport.Domain;

public class InternationalDriver {

    private String name;
    private String surname;
    private boolean vehOwned;

    private InternationalDriver()
    {
    }

    private InternationalDriver(IntDriverBuidler builder)
    {
        this.name = builder.name;
        this.surname = builder.surname;
        this.vehOwned = builder.vehOwned;
    }


    public String getName()
    {
      return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public Boolean getvehOwned()
    {
        return vehOwned;
    }


    public static class IntDriverBuidler
    {
        private String name;
        private String surname;
        private boolean vehOwned;

        public IntDriverBuidler name(String name)
        {
            this.name = name;
            return this;
        }

        public IntDriverBuidler surname(String surname)
        {
            this.surname = surname;
            return this;
        }

        public IntDriverBuidler vehOwned(boolean vehOwned)
        {
            this.vehOwned = vehOwned;
            return this;
        }

        public InternationalDriver build()
        {
            return new InternationalDriver(this);
        }

    }

}
