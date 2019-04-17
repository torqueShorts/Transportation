package Transport.Factory;

import Transport.Domain.Verdict;

public class VerdictFactory {

    public static Verdict getVerdict(boolean reason, int reducedAmount, boolean warrant)
    {
        return new Verdict.VerdictBuilder()
                .reason(reason)
                .reducedAmount(reducedAmount)
                .warrant(warrant)
                .build();

    }



}
