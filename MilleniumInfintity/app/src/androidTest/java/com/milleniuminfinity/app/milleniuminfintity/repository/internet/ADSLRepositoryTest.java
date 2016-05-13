package com.milleniuminfinity.app.milleniuminfintity.repository.internet;

import android.test.AndroidTestCase;

import com.milleniuminfinity.app.milleniuminfintity.domain.internet.ADSL;
import com.milleniuminfinity.app.milleniuminfintity.domain.internet.Internet;
import com.milleniuminfinity.app.milleniuminfintity.repository.internet.Impl.ADSLRepositoryImpl;

import junit.framework.Assert;

import java.util.Set;

/**
 * Created by 208023429 on 5/12/2016.
 */
public class ADSLRepositoryTest extends AndroidTestCase {
    private static final String TAG = "ADSL TEST";

    public void createReadUpdateDeleteTest() throws Exception
    {
        ADSLRepository repository = new ADSLRepositoryImpl(this.getContext());
        String ipAddress;

        //Create
        ADSL createdADSL = new ADSL.Builder()
                .ipAddress("10.1.1.1")
                .ISP("Telkom")
                .planName("Capped ADSL")
                .price("R399")
                .dataAllowance("100GB")
                .build();

        ADSL insertedADSL = repository.save(createdADSL);
        ipAddress = insertedADSL.getIPAddress();
        Assert.assertNotNull(TAG + " CREATE", insertedADSL);

        //Read all
        Set<ADSL> ADSLServices = repository.findAll();
        Assert.assertTrue(TAG + " READ ALL", ADSLServices.size() > 0);

        //Read entity
        ADSL adsl = repository.findById(ipAddress);
        Assert.assertNotNull(TAG + " READ INTERNET", adsl);

        //Update internet
        ADSL updateADSL = new ADSL.Builder()
                .copy(adsl)
                .ipAddress("NewIP")
                .build();
        repository.update(updateADSL);
        Internet newInternet = repository.findById(ipAddress);
        Assert.assertEquals(TAG + " UPDATE INTERNET", "NewIP", newInternet.getIPAddress());

        //Delete employee
        repository.delete(updateADSL);
        Internet deletedInternet = repository.findById(ipAddress);
        Assert.assertNull(TAG + " DELETE", deletedInternet);
    }
}
