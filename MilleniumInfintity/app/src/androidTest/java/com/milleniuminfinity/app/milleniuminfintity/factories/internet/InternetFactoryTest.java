package com.milleniuminfinity.app.milleniuminfintity.factories.internet;


import com.milleniuminfinity.app.milleniuminfintity.domain.internet.Internet;

/**
 * Write a description of class TestInternet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class InternetFactoryTest
{
    public void testInternetFactory() throws Exception
    {
        InternetFactory internetFactoryObject = new InternetFactory();
        Internet internetObject = internetFactoryObject.getInternetType("Telkom", "Faster 100", "10", "100");
    }
}
