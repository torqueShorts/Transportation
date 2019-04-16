package Transport.Domain;

public class HitNRun {

    private String location;
    private String date;

    private HitNRun()
    {

    }

    private HitNRun(HitNRunBuilder builder)
    {
        this.location = builder.location;
        this.date = builder.date;
    }


    public String getLocation(String location)
    {
        return location;
    }

    public String getDate(String date)
    {
        return date;
    }

    public static class HitNRunBuilder
    {
        private String location;
        private String date;

        public HitNRunBuilder location(String location)
        {
            this.location = location;
            return this;
        }

        public HitNRunBuilder date(String date)
        {
            this.date = date;
            return this;
        }

        public HitNRun build()
        {
            return new HitNRun(this);
        }


    }


}
