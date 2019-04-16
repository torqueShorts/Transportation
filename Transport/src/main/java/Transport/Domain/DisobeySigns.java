package Transport.Domain;

public class DisobeySigns {

    private String sign;
    private int amount;

    private DisobeySigns()
    {

    }

    private DisobeySigns(DisobeySignsBuilder builder)
    {
        this.sign = builder.sign;
        this.amount = builder.amount;
    }

    public static class DisobeySignsBuilder
    {
        private String sign;
        private int amount;

        public DisobeySignsBuilder sign(String sign)
        {
            this.sign = sign;
            return this;
        }

        public DisobeySignsBuilder amount(int amount)
        {
            this.amount = amount;
            return this;
        }

        public DisobeySigns build()
        {
            return new DisobeySigns(this);
        }



    }




}
