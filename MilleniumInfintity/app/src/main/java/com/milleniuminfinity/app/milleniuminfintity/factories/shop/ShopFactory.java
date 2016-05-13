package com.milleniuminfinity.app.milleniuminfintity.factories.shop;

import com.milleniuminfinity.app.milleniuminfintity.domain.shop.Shop;

/**
 * Created by Admin on 2016/04/15.
 */
public class ShopFactory {
    
    public static Shop getShop(String shopNumber, String shopName, String shopOwner, String shopPhoneNumber)
    {
        Shop shop = new Shop.Builder()
                        .shopNumber(shopNumber)
                        .shopName(shopName)
                        .shopOwner(shopOwner)
                        .shopPhoneNumber(shopPhoneNumber)
                        .build();
    
        return shop;
    }
}
