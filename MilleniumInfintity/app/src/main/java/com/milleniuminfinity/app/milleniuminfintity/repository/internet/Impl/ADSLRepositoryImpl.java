package com.milleniuminfinity.app.milleniuminfintity.repository.internet.Impl;

/**
 * Created by 208023429 on 5/12/2016.
 */
public class ADSLRepositoryImpl{

    /*public static final String TABLE_ADSL = "adsl";
    private SQLiteDatabase database;

    public static final String COLUMN_IPADDRESS = "ipaddress";
    public static final String COLUMN_ISP = "isp";
    public static final String COLUMN_PLANNAME = "planname";
    public static final String COLUMN_PRICE = "price";
    public static final String COLUMN_DATAALLOWANCE = "dataallowance";

    //Database table creation
    private static final String DATABASE_CREATE = " CREATE TABLE "
            + TABLE_ADSL + "("
            + COLUMN_IPADDRESS + " TEXT PRIMARY KEY, "
            + COLUMN_ISP + " TEXT NOT NULL, "
            + COLUMN_PLANNAME + " TEXT NOT NULL, "
            + COLUMN_PRICE + " INTEGER NOT NULL, "
            + COLUMN_DATAALLOWANCE + " INTEGER NOT NULL);";

    public ADSLRepositoryImpl(Context context)
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
    public ADSL findById(String ipAddress)
    {
        SQLiteDatabase database = this.getReadableDatabase();
        Cursor cursor = database.query(
                TABLE_ADSL,
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
            final ADSL adsl = new ADSL.Builder()
                    .ipAddress(cursor.getString(0))
                    .ISP(cursor.getString(1))
                    .planName(cursor.getString(2))
                    .price(cursor.getString(3))
                    .dataAllowance(cursor.getString(4))
                    .build();

            return adsl;
        }
        else {
            return null;
        }
    }

    @Override
    public ADSL save(ADSL adsl) throws Exception
    {
        open();
        ContentValues values = new ContentValues();

        values.put(COLUMN_IPADDRESS, adsl.getIPAddress());
        values.put(COLUMN_ISP, adsl.getISP());
        values.put(COLUMN_PLANNAME, adsl.getPlanName());
        values.put(COLUMN_PRICE, adsl.getPrice());
        values.put(COLUMN_DATAALLOWANCE, adsl.getDataAllowance());

        Long ipAddress = database.insertOrThrow(TABLE_ADSL, null, values);

        ADSL insertedEntity = adsl;

        return insertedEntity;
    }

    @Override
    public ADSL update(ADSL adsl) throws Exception
    {
        open();
        ContentValues values = new ContentValues();

        values.put(COLUMN_IPADDRESS, adsl.getIPAddress());
        values.put(COLUMN_ISP, adsl.getISP());
        values.put(COLUMN_PLANNAME, adsl.getPlanName());
        values.put(COLUMN_PRICE, adsl.getPrice());
        values.put(COLUMN_DATAALLOWANCE, adsl.getDataAllowance());

        database.update(
                TABLE_ADSL,
                values,
                COLUMN_IPADDRESS + " =? ",
                new String[]{String.valueOf(adsl.getIPAddress())}
        );

        return adsl;
    }

    @Override
    public ADSL delete(ADSL adsl) throws Exception
    {
        open();
        database.delete(
                TABLE_ADSL,
                COLUMN_IPADDRESS + " =? ",
                new String[]{String.valueOf(adsl.getIPAddress())}
        );

        return adsl;
    }

    @Override
    public Set<ADSL> findAll() throws Exception
    {
        SQLiteDatabase database = this.getReadableDatabase();
        String selectAll = " SELECT * FROM " + TABLE_ADSL;
        Set<ADSL> adslServices = new HashSet<>();
        open();
        Cursor cursor = database.rawQuery(selectAll, null);

        if(cursor.moveToFirst())
        {
            do {
                final ADSL adsl = new ADSL.Builder()
                        .ipAddress(cursor.getString(0))
                        .ISP(cursor.getString(1))
                        .planName(cursor.getString(2))
                        .price(cursor.getString(3))
                        .dataAllowance(cursor.getString(4))
                        .build();

                adslServices.add(adsl);
            }while(cursor.moveToNext());
        }

        return adslServices;
    }

    @Override
    public int deleteAll() throws Exception
    {
        open();
        int rowsDeleted = database.delete(TABLE_ADSL, null, null);
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

        database.execSQL("DROP TABLE IF EXISTS " + TABLE_ADSL);
        onCreate(database);
    }*/
}
