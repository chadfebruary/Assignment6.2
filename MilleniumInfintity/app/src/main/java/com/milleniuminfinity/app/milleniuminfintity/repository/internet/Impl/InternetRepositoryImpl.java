package com.milleniuminfinity.app.milleniuminfintity.repository.internet.Impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.milleniuminfinity.app.milleniuminfintity.conf.databases.DBConstants;
import com.milleniuminfinity.app.milleniuminfintity.domain.internet.ADSL;
import com.milleniuminfinity.app.milleniuminfintity.domain.internet.Fibre;
import com.milleniuminfinity.app.milleniuminfintity.domain.internet.Internet;
import com.milleniuminfinity.app.milleniuminfintity.domain.internet.Mobile;
import com.milleniuminfinity.app.milleniuminfintity.repository.internet.InternetRepository;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;




/**
 * Created by Chad on 4/21/2016.
 */
public class InternetRepositoryImpl extends SQLiteOpenHelper implements InternetRepository {
    public static final String TABLE_INTERNET = "internet";
    private SQLiteDatabase database;

    public static final String COLUMN_IPADDRESS = "ipaddress";
    public static final String COLUMN_ISP = "isp";
    public static final String COLUMN_PLANNAME = "planname";
    public static final String COLUMN_PRICE = "price";
    public static final String COLUMN_DATAALLOWANCE = "dataallowance";

    //Database table creation
    private static final String DATABASE_CREATE = " CREATE TABLE "
            + TABLE_INTERNET + "("
            + COLUMN_IPADDRESS + " TEXT PRIMARY KEY, "
            + COLUMN_ISP + " TEXT NOT NULL, "
            + COLUMN_PLANNAME + " TEXT NOT NULL, "
            + COLUMN_PRICE + " INTEGER NOT NULL, "
            + COLUMN_DATAALLOWANCE + " INTEGER NOT NULL);";

    public InternetRepositoryImpl(Context context)
    {
        super(context, DBConstants.DATABASE_NAME, null, DBConstants.DATABASE_VERSION);
    }

    public void open() throws SQLException
    {
        database = this.getWritableDatabase();
    }

    public void close()
    {
        this.close();
    }

    @Override
    public Internet findById(String ipAddress, String type)
    {
        SQLiteDatabase database = this.getReadableDatabase();
        Cursor cursor = database.query(
                TABLE_INTERNET,
                new String[]{
                        COLUMN_IPADDRESS,
                        COLUMN_ISP,
                        COLUMN_PLANNAME,
                        COLUMN_PRICE,
                        COLUMN_DATAALLOWANCE},
                COLUMN_ISP + " =? ",
                new String[]{String.valueOf(ipAddress)},
                null,
                null,
                null,
                null);

        if(cursor.moveToFirst()){

            if(type.equalsIgnoreCase("ADSL")) {
                final Internet internet = new ADSL.Builder()
                        .ipAddress(cursor.getString(0))
                        .ISP(cursor.getString(1))
                        .planName(cursor.getString(2))
                        .price(cursor.getString(3))
                        .dataAllowance(cursor.getString(4))
                        .build();
                return internet;
            }
            else if(type.equalsIgnoreCase("Fibre"))
            {
                final Internet internet = new Fibre.Builder()
                        .ipAddress(cursor.getString(0))
                        .ISP(cursor.getString(1))
                        .planName(cursor.getString(2))
                        .price(cursor.getString(3))
                        .dataAllowance(cursor.getString(4))
                        .build();
                return internet;
            }
            else
            {
                final Internet internet = new Mobile.Builder()
                        .ipAddress(cursor.getString(0))
                        .ISP(cursor.getString(1))
                        .planName(cursor.getString(2))
                        .price(cursor.getString(3))
                        .dataAllowance(cursor.getString(4))
                        .build();
                return internet;
            }
        }
        else {
            return null;
        }
    }

    @Override
    public Internet save(Internet internet) throws Exception
    {
        open();
        ContentValues values = new ContentValues();
        
        values.put(COLUMN_IPADDRESS, internet.getIPAddress());
        values.put(COLUMN_ISP, internet.getISP());
        values.put(COLUMN_PLANNAME, internet.getPlanName());
        values.put(COLUMN_PRICE, internet.getPrice());
        values.put(COLUMN_DATAALLOWANCE, internet.getDataAllowance());

        Long ipAddress = database.insertOrThrow(TABLE_INTERNET, null, values);

        Internet insertedEntity = internet;

        return insertedEntity;
    }

    @Override
    public Internet update(Internet internet) throws Exception
    {
        open();
        ContentValues values = new ContentValues();
        
        values.put(COLUMN_IPADDRESS, internet.getIPAddress());
        values.put(COLUMN_ISP, internet.getISP());
        values.put(COLUMN_PLANNAME, internet.getPlanName());
        values.put(COLUMN_PRICE, internet.getPrice());
        values.put(COLUMN_DATAALLOWANCE, internet.getDataAllowance());

        database.update(
                TABLE_INTERNET,
                values,
                COLUMN_IPADDRESS + " =? ",
                new String[]{String.valueOf(internet.getIPAddress())}
        );

        return internet;
    }

    @Override
    public Internet delete(Internet internet) throws Exception
    {
        open();
        database.delete(
                TABLE_INTERNET,
                COLUMN_IPADDRESS + " =? ",
                new String[]{String.valueOf(internet.getIPAddress())}
        );

        return internet;
    }

    @Override
    public Set<Internet> findAll(String type) throws Exception
    {
        SQLiteDatabase database = this.getReadableDatabase();
        String selectAll = " SELECT * FROM " + TABLE_INTERNET;
        Set<Internet> internetServices = new HashSet<>();
        open();
        Cursor cursor = database.rawQuery(selectAll, null);
        
        if(cursor.moveToFirst())
        {
            do {

                final Internet internet;

                if(type.equalsIgnoreCase("ADSL")) {
                    internet = new ADSL.Builder()
                            .ipAddress(cursor.getString(0))
                            .ISP(cursor.getString(1))
                            .planName(cursor.getString(2))
                            .price(cursor.getString(3))
                            .dataAllowance(cursor.getString(4))
                            .build();
                }
                else if(type.equalsIgnoreCase("Fibre"))
                {
                    internet = new Fibre.Builder()
                            .ipAddress(cursor.getString(0))
                            .ISP(cursor.getString(1))
                            .planName(cursor.getString(2))
                            .price(cursor.getString(3))
                            .dataAllowance(cursor.getString(4))
                            .build();
                }
                else
                {
                    internet = new Mobile.Builder()
                            .ipAddress(cursor.getString(0))
                            .ISP(cursor.getString(1))
                            .planName(cursor.getString(2))
                            .price(cursor.getString(3))
                            .dataAllowance(cursor.getString(4))
                            .build();
                }

                    internetServices.add(internet);

                }while(cursor.moveToNext());
        }

        return internetServices;
    }

    @Override
    public int deleteAll() throws Exception
    {
        open();
        int rowsDeleted = database.delete(TABLE_INTERNET, null, null);
        close();
        return rowsDeleted;
    }

    @Override
    public void onCreate(SQLiteDatabase database)
    {
        database.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion)
    {
        Log.w(this.getClass().getName(),
                "Upgrading databse from version " + oldVersion + " to "
                        + newVersion + ", which will destroy all old data");
        
        database.execSQL("DROP TABLE IF EXISTS " + TABLE_INTERNET);
        onCreate(database);
    }
}
