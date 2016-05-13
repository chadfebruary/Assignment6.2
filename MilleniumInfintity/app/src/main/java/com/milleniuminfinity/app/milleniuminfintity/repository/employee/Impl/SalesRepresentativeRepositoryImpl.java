package com.milleniuminfinity.app.milleniuminfintity.repository.employee.Impl;

/**
 * Created by Chad on 5/12/2016.
 */
public class SalesRepresentativeRepositoryImpl  {

    /*public static final String TABLE_SALESREPRESENTATIVE = "salesrepresentative";
    private SQLiteDatabase database;

    public static final String COLUMN_EMPLOYEEID = "employeeid";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_SURNAME = "surname";
    public static final String COLUMN_DATEOFBIRTH = "dateofbirth";

    //Database table creation
    private static final String DATABASE_CREATE = " CREATE TABLE "
            + TABLE_SALESREPRESENTATIVE + "("
            + COLUMN_EMPLOYEEID + " TEXT PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_NAME + " TEXT NOT NULL, "
            + COLUMN_SURNAME + " TEXT NOT NULL, "
            + COLUMN_DATEOFBIRTH + "TEXT NOT NULL);";

    public SalesRepresentativeRepositoryImpl(Context context)
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
    public SalesRepresentative findById(String employeeID)
    {
        SQLiteDatabase database = this.getReadableDatabase();
        Cursor cursor = database.query(
                TABLE_SALESREPRESENTATIVE,
                new String[]{
                        COLUMN_EMPLOYEEID,
                        COLUMN_NAME,
                        COLUMN_SURNAME,
                        COLUMN_DATEOFBIRTH},
                COLUMN_EMPLOYEEID + " =? ",
                new String[]{String.valueOf(employeeID)},
                null,
                null,
                null,
                null);

        if(cursor.moveToFirst())
        {
            final SalesRepresentative salesRepresentative = new SalesRepresentative.Builder()
                    .employeeID(cursor.getString(0))
                    .name(cursor.getString(1))
                    .surname(cursor.getString(2))
                    .dateOfBirth(cursor.getString(3))
                    .build();

            return salesRepresentative;
        }
        else
        {
            return null;
        }
    }

    @Override
    public SalesRepresentative save(SalesRepresentative salesRepresentative) throws Exception
    {
        open();
        ContentValues values = new ContentValues();

        values.put(COLUMN_EMPLOYEEID, salesRepresentative.getEmployeeID());
        values.put(COLUMN_NAME, salesRepresentative.getName());
        values.put(COLUMN_SURNAME, salesRepresentative.getSurname());
        values.put(COLUMN_DATEOFBIRTH, salesRepresentative.getDateOfBirth());

        Long employeeID = database.insertOrThrow(TABLE_SALESREPRESENTATIVE, null, values);

        SalesRepresentative insertedEntity = salesRepresentative;

        return insertedEntity;
    }

    @Override
    public SalesRepresentative update(SalesRepresentative salesRepresentative) throws Exception
    {
        open();
        ContentValues values = new ContentValues();

        values.put(COLUMN_EMPLOYEEID, salesRepresentative.getEmployeeID());
        values.put(COLUMN_NAME, salesRepresentative.getName());
        values.put(COLUMN_SURNAME, salesRepresentative.getSurname());
        values.put(COLUMN_DATEOFBIRTH, salesRepresentative.getDateOfBirth());
        database.update(
                TABLE_SALESREPRESENTATIVE,
                values,
                COLUMN_EMPLOYEEID + " =? ",
                new String[]{String.valueOf(salesRepresentative.getEmployeeID())}
        );

        return salesRepresentative;
    }

    @Override
    public SalesRepresentative delete(SalesRepresentative salesRepresentative) throws Exception
    {
        open();
        database.delete(
                TABLE_SALESREPRESENTATIVE,
                COLUMN_EMPLOYEEID + " =? ",
                new String[]{String.valueOf(salesRepresentative.getEmployeeID())}
        );

        return salesRepresentative;
    }

    @Override
    public Set<SalesRepresentative> findAll() throws Exception
    {
        SQLiteDatabase database = this.getReadableDatabase();
        String selectAll = " SELECT * FROM " + TABLE_SALESREPRESENTATIVE;
        Set<SalesRepresentative> salesRepresentatives = new HashSet<>();
        open();
        Cursor cursor = database.rawQuery(selectAll, null);

        if(cursor.moveToFirst())
        {
            do {
                final SalesRepresentative salesRepresentative = new SalesRepresentative.Builder()
                        .employeeID(cursor.getString(0))
                        .name(cursor.getString(1))
                        .surname(cursor.getString(2))
                        .dateOfBirth(cursor.getString(3))
                        .build();
                salesRepresentatives.add(salesRepresentative);
            }while(cursor.moveToNext());
        }

        return salesRepresentatives;
    }

    @Override
    public int deleteAll() throws Exception
    {
        open();
        int rowsDeleted = database.delete(TABLE_SALESREPRESENTATIVE, null, null);
        close();
        return rowsDeleted;
    }

    @Override
    public void onCreate(SQLiteDatabase database)
    {
        database.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        Log.w(this.getClass().getName(),
                "Upgrading database from version " + oldVersion + " to "
                        + newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SALESREPRESENTATIVE);
        onCreate(db);

    }*/
}
