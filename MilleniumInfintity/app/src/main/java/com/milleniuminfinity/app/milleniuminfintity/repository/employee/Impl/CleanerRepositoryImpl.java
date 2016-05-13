package com.milleniuminfinity.app.milleniuminfintity.repository.employee.Impl;

/**
 * Created by Chad on 5/12/2016.
 */
public class CleanerRepositoryImpl {

    /*public static final String TABLE_CLEANER = "cleaner";
    private SQLiteDatabase database;

    public static final String COLUMN_EMPLOYEEID = "employeeid";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_SURNAME = "surname";
    public static final String COLUMN_DATEOFBIRTH = "dateofbirth";

    //Database table creation
    private static final String DATABASE_CREATE = " CREATE TABLE "
            + TABLE_CLEANER + "("
            + COLUMN_EMPLOYEEID + " TEXT PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_NAME + " TEXT NOT NULL, "
            + COLUMN_SURNAME + " TEXT NOT NULL, "
            + COLUMN_DATEOFBIRTH + "TEXT NOT NULL);";

    public CleanerRepositoryImpl(Context context)
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
    public Cleaner findById(String employeeID)
    {
        SQLiteDatabase database = this.getReadableDatabase();
        Cursor cursor = database.query(
                TABLE_CLEANER,
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
            final Cleaner cleaner = new Cleaner.Builder()
                    .employeeID(cursor.getString(0))
                    .name(cursor.getString(1))
                    .surname(cursor.getString(2))
                    .dateOfBirth(cursor.getString(3))
                    .build();

            return cleaner;
        }
        else
        {
            return null;
        }
    }

    @Override
    public Cleaner save(Cleaner cleaner) throws Exception
    {
        open();
        ContentValues values = new ContentValues();

        values.put(COLUMN_EMPLOYEEID, cleaner.getEmployeeID());
        values.put(COLUMN_NAME, cleaner.getName());
        values.put(COLUMN_SURNAME, cleaner.getSurname());
        values.put(COLUMN_DATEOFBIRTH, cleaner.getDateOfBirth());

        Long employeeID = database.insertOrThrow(TABLE_CLEANER, null, values);

        Cleaner insertedEntity = cleaner;

        return insertedEntity;
    }

    @Override
    public Cleaner update(Cleaner cleaner) throws Exception
    {
        open();
        ContentValues values = new ContentValues();

        values.put(COLUMN_EMPLOYEEID, cleaner.getEmployeeID());
        values.put(COLUMN_NAME, cleaner.getName());
        values.put(COLUMN_SURNAME, cleaner.getSurname());
        values.put(COLUMN_DATEOFBIRTH, cleaner.getDateOfBirth());
        database.update(
                TABLE_CLEANER,
                values,
                COLUMN_EMPLOYEEID + " =? ",
                new String[]{String.valueOf(cleaner.getEmployeeID())}
        );

        return cleaner;
    }

    @Override
    public Cleaner delete(Cleaner cleaner) throws Exception
    {
        open();
        database.delete(
                TABLE_CLEANER,
                COLUMN_EMPLOYEEID + " =? ",
                new String[]{String.valueOf(cleaner.getEmployeeID())}
        );

        return cleaner;
    }

    @Override
    public Set<Cleaner> findAll() throws Exception
    {
        SQLiteDatabase database = this.getReadableDatabase();
        String selectAll = " SELECT * FROM " + TABLE_CLEANER;
        Set<Cleaner> cleaners = new HashSet<>();
        open();
        Cursor cursor = database.rawQuery(selectAll, null);

        if(cursor.moveToFirst())
        {
            do {
                final Cleaner cleaner = new Cleaner.Builder()
                        .employeeID(cursor.getString(0))
                        .name(cursor.getString(1))
                        .surname(cursor.getString(2))
                        .dateOfBirth(cursor.getString(3))
                        .build();
                cleaners.add(cleaner);
            }while(cursor.moveToNext());
        }

        return cleaners;
    }

    @Override
    public int deleteAll() throws Exception
    {
        open();
        int rowsDeleted = database.delete(TABLE_CLEANER, null, null);
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
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CLEANER);
        onCreate(db);

    }*/
}
