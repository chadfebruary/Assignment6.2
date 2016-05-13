package com.milleniuminfinity.app.milleniuminfintity.factories.internet;

import com.milleniuminfinity.app.milleniuminfintity.domain.internet.Internet;
import com.milleniuminfinity.app.milleniuminfintity.domain.internet.Mobile;

/**
 * Created by 208023429 on 5/13/2016.
 */
public class MobileFactory {

    public static Internet getMobile(String ISP, String planName, String price, String dataAllowance) {
        Internet mobile = new Mobile.Builder()
                .ISP(ISP)
                .planName(planName)
                .price(price)
                .dataAllowance(dataAllowance)
                .build();

        return mobile;
    }
}
