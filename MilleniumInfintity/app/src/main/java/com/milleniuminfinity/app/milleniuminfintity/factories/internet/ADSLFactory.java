package com.milleniuminfinity.app.milleniuminfintity.factories.internet;

import com.milleniuminfinity.app.milleniuminfintity.domain.internet.ADSL;
import com.milleniuminfinity.app.milleniuminfintity.domain.internet.Internet;

/**
 * Created by 208023429 on 5/13/2016.
 */
public class ADSLFactory {

    public static Internet getADSL(String ISP, String planName, String price, String dataAllowance) {
        Internet adsl = new ADSL.Builder()
                .ISP(ISP)
                .planName(planName)
                .price(price)
                .dataAllowance(dataAllowance)
                .build();

        return adsl;
    }
}
