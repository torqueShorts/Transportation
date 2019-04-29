package Transport.Factory;

import Transport.Domain.DisobeySigns;
import Transport.Domain.Fine;
import Transport.Domain.MinorOffense;

public class DisobeySignsFactory {

    public static DisobeySigns getDisobeySign(String sign, int amount, Fine fine)
    {
        return new DisobeySigns.DisobeySignsBuilder()
                .sign(sign)
                .amount(amount)
                .fine(fine)
                .build();
    }


}
