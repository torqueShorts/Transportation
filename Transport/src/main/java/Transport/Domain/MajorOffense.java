package Transport.Domain;



public class MajorOffense {
    private String type;
    private int amount;

    private MajorOffense()
    {

    }

    private MajorOffense(MajorOffenceBuilder builder)
    {
        this.type = builder.type;
        this.amount = builder.amount;
    }

    public String getType()
    {
        return type;
    }

    public int getAmount()
    {
        return amount;
    }

    public static class MajorOffenceBuilder {

        private String type;
        private int amount;

        public MajorOffenceBuilder type(String type) {
            this.type = type;
            return this;
        }

        public MajorOffenceBuilder amount(int amount) {
            this.amount = amount;
            return this;
        }

        public MajorOffense build() {
            return new MajorOffense(this);
        }


    }

}
