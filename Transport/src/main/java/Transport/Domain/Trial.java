package Transport.Domain;

public class Trial {

    private String date;
    private boolean reason;

    private Trial()
    {

    }

    private Trial(TrialBuilder builder)
    {
        this.date = builder.date;
        this.reason = builder.reason;
    }

    public String getDate()
    {
        return date;
    }

    public boolean getReason()
    {
        return reason;
    }

    public static class TrialBuilder
    {
        private String date;
        private boolean reason;

        public TrialBuilder date(String date)
        {
            this.date = date;
            return this;
        }

        public TrialBuilder reason(boolean reason)
        {
            this.reason = reason;
            return this;
        }

        public Trial build()
        {
            return new Trial(this);
        }



    }






}
