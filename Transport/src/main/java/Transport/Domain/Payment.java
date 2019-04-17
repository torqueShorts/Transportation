package Transport.Domain;

public class Payment {

    private int amount;
    private String driverID;
    private String fineNum;

    private Payment()
    {

    }

    private Payment(PaymentBuilder builder)
    {
        this.amount = builder.amount;
        this.driverID = builder.driverID;
        this.fineNum = builder.fineNum;
    }

    public int getAmount()
    {
        return amount;
    }

    public String getDriverID()
    {
        return driverID;
    }

    public String getFineNum()
    {
        return fineNum;
    }

    public static class PaymentBuilder
    {
        private int amount;
        private String driverID;
        private String fineNum;

        public PaymentBuilder amount(int amount)
        {
            this.amount = amount;
            return this;
        }

        public PaymentBuilder driverID(String driverID)
        {
            this.driverID = driverID;
            return this;
        }

        public PaymentBuilder finNum(String fineNum)
        {
            this.fineNum = fineNum;
            return this;
        }

        public Payment build()
        {
            return new Payment(this);
        }



    }





}
