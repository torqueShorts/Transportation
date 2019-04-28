package Transport.Factory;

import Transport.Domain.Verdict;

public class VerdictFactory {

    public static Verdict getVerdict(String fineNum, boolean reason, int reducedAmount, boolean warrant)
    {
        return new Verdict.VerdictBuilder()
                .fineNum(fineNum)
                .reason(reason)
                .reducedAmount(reducedAmount)
                .warrant(warrant)
                .build();

    }



}
