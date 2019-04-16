package Transport.Factory;

import Transport.Domain.DisobeySigns;

public class DisobeySignsFactory {

    public static DisobeySigns getDisobeySign(String sign, int amount)
    {
        return new DisobeySigns.DisobeySignsBuilder()
                .sign(sign)
                .amount(amount)
                .build();
    }


}
