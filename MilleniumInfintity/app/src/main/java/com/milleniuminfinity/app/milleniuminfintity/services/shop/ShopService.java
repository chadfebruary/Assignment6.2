package com.milleniuminfinity.app.milleniuminfintity.services.shop;

import android.content.Context;

import com.milleniuminfinity.app.milleniuminfintity.domain.shop.Shop;


/**
 * Created by Chad on 5/8/2016.
 */
public interface ShopService {
    void addShop(Context context, Shop shop);
    void updateShop(Context context, Shop shop);
}
