package com.milleniuminfinity.app.milleniuminfintity.repository.employee.Impl;

/**
 * Created by Chad on 5/12/2016.
 */
public class ManagerRepositoryImpl  {

    /*public static final String TABLE_MANAGER = "manager";
    private SQLiteDatabase database;

    public static final String COLUMN_EMPLOYEEID = "employeeid";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_SURNAME = "surname";
    public static final String COLUMN_DATEOFBIRTH = "dateofbirth";

    //Database table creation
    private static final String DATABASE_CREATE = " CREATE TABLE "
            + TABLE_MANAGER + "("
            + COLUMN_EMPLOYEEID + " TEXT PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_NAME + " TEXT NOT NULL, "
            + COLUMN_SURNAME + " TEXT NOT NULL, "
            + COLUMN_DATEOFBIRTH + "TEXT NOT NULL);";

    public ManagerRepositoryImpl(Context context)
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
    public Manager findById(String employeeID)
    {
        SQLiteDatabase database = this.getReadableDatabase();
        Cursor cursor = database.query(
                TABLE_MANAGER,
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
            final Manager manager = new Manager.Builder()
                    .employeeID(cursor.getString(0))
                    .name(cursor.getString(1))
                    .surname(cursor.getString(2))
                    .dateOfBirth(cursor.getString(3))
                    .build();

            return manager;
        }
        else
        {
            return null;
        }
    }

    @Override
    public Manager save(Manager manager) throws Exception
    {
        open();
        ContentValues values = new ContentValues();

        values.put(COLUMN_EMPLOYEEID, manager.getEmployeeID());
        values.put(COLUMN_NAME, manager.getName());
        values.put(COLUMN_SURNAME, manager.getSurname());
        values.put(COLUMN_DATEOFBIRTH, manager.getDateOfBirth());

        Long employeeID = database.insertOrThrow(TABLE_MANAGER, null, values);

        Manager insertedEntity = manager;

        return insertedEntity;
    }

    @Override
    public Manager update(Manager manager) throws Exception
    {
        open();
        ContentValues values = new ContentValues();

        values.put(COLUMN_EMPLOYEEID, manager.getEmployeeID());
        values.put(COLUMN_NAME, manager.getName());
        values.put(COLUMN_SURNAME, manager.getSurname());
        values.put(COLUMN_DATEOFBIRTH, manager.getDateOfBirth());
        database.update(
                TABLE_MANAGER,
                values,
                COLUMN_EMPLOYEEID + " =? ",
                new String[]{String.valueOf(manager.getEmployeeID())}
        );

        return manager;
    }

    @Override
    public Manager delete(Manager manager) throws Exception
    {
        open();
        database.delete(
                TABLE_MANAGER,
                COLUMN_EMPLOYEEID + " =? ",
                new String[]{String.valueOf(manager.getEmployeeID())}
        );

        return manager;
    }

    @Override
    public Set<Manager> findAll() throws Exception
    {
        SQLiteDatabase database = this.getReadableDatabase();
        String selectAll = " SELECT * FROM " + TABLE_MANAGER;
        Set<Manager> managers = new HashSet<>();
        open();
        Cursor cursor = database.rawQuery(selectAll, null);

        if(cursor.moveToFirst())
        {
            do {
                final Manager manager = new Manager.Builder()
                        .employeeID(cursor.getString(0))
                        .name(cursor.getString(1))
                        .surname(cursor.getString(2))
                        .dateOfBirth(cursor.getString(3))
                        .build();
                managers.add(manager);
            }while(cursor.moveToNext());
        }

        return managers;
    }

    @Override
    public int deleteAll() throws Exception
    {
        open();
        int rowsDeleted = database.delete(TABLE_MANAGER, null, null);
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
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MANAGER);
        onCreate(db);

    }*/
}
