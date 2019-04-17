package Transport.Factory;

import Transport.Domain.Court;

public class CourtFactory {

    public static Court getCourt(String courtName, String fineNum,String judge)
    {
        return new Court.CourtBuilder()
                .courtName(courtName)
                .fineNum(fineNum)
                .judge(judge)
                .build();
    }





}
