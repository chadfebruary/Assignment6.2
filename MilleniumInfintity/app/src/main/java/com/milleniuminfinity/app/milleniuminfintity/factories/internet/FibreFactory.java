package com.milleniuminfinity.app.milleniuminfintity.factories.internet;

import com.milleniuminfinity.app.milleniuminfintity.domain.internet.Fibre;
import com.milleniuminfinity.app.milleniuminfintity.domain.internet.Internet;

/**
 * Created by 208023429 on 5/13/2016.
 */
public class FibreFactory {

    public static Internet getFibre(String ISP, String planName, String price, String dataAllowance) {
        Internet fibre = new Fibre.Builder()
                .ISP(ISP)
                .planName(planName)
                .price(price)
                .dataAllowance(dataAllowance)
                .build();

        return fibre;
    }
}
