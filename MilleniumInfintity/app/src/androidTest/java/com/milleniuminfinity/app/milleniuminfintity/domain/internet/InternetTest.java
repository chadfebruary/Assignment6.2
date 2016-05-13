package com.milleniuminfinity.app.milleniuminfintity.domain.internet;


import com.milleniuminfinity.app.milleniuminfintity.factories.internet.InternetFactory;

/**
 * Write a description of class TestInternet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class InternetTest
{
    public void testInternetFactory() 
    {
        InternetFactory internetFactoryObject = new InternetFactory();
        Internet internetObject = internetFactoryObject.getInternetType("Telkom", "Faster 100", "10", "100");
    }
}
