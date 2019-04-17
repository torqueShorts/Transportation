package Transport.Domain;

public class MinorOffense {

    private String type;
    private int amount;

    private MinorOffense()
    {

    }

    private MinorOffense(MinorOffenceBuilder builder)
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

    public static class MinorOffenceBuilder {

        private String type;
        private int amount;

        public MinorOffenceBuilder type(String type) {
            this.type = type;
            return this;
        }

        public MinorOffenceBuilder amount(int amount) {
            this.amount = amount;
            return this;
        }

        public MinorOffense build() {
            return new MinorOffense(this);
        }


    }






}
