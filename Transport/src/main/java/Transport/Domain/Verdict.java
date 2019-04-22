package Transport.Domain;

public class Verdict {

    private boolean reason;
    private int reducedAmount;
    private boolean warrant;

    private Verdict()
    {

    }

    private Verdict(VerdictBuilder builder)
    {
        this.reason = builder.reason;
        this.reducedAmount = builder.reducedAmount;
        this.warrant = builder.warrant;
    }

    public boolean getReason()
    {
        return reason;
    }

    public int getReducedAmount()
    {
        return reducedAmount;
    }

    public boolean getWarrant()
    {
        return warrant;
    }

    public static class VerdictBuilder
    {
        private boolean reason;
        private int reducedAmount;
        private boolean warrant;

        public VerdictBuilder reason(boolean reason)
        {
            this.reason = reason;
            return this;
        }

        public VerdictBuilder reducedAmount(int reducedAmount)
        {
            this.reducedAmount = reducedAmount;
            return this;
        }

        public VerdictBuilder warrant(boolean warrant)
        {
            this.warrant = warrant;
            return this;
        }


        public Verdict build()
        {
            return new Verdict(this);
        }


    }

    public String toString()
    {
        return "Trial: \nReason valid: " + reason + "\nReduced amount: " + reducedAmount + "\nWarrant: " + warrant;
    }


}
