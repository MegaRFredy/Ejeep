package com.fare.ejeep;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DbManager extends SQLiteOpenHelper {
    public static final String Database_Name = "Peej.db";
    public static final String Table_Name = "tbl_Jeep";
    public static final int Database_Version = 1;
    public static final String Col1 = "DriverName";
    public static final String Col2 = "BodyNumber";
    public static final String Col3 = "TripNumber";
    public static final String Col4 = "Fare";

    public DbManager(Context context) {
        super(context, Database_Name, null, Database_Version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableQuery = "CREATE TABLE " + Table_Name + " (" +
                Col1 + " TEXT, " +
                Col2 + " TEXT, " +
                Col3 + " TEXT, " +
                Col4 + " REAL)";// Assuming  ng Fare column is for numerical values
        db.execSQL(createTableQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Table_Name);
        onCreate(db);
    }

    public boolean insertData(String columnName, String value) {
        SQLiteDatabase db = null;
        try {
            db = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(columnName, value);
            long result = db.insert(Table_Name, null,contentValues);
            return result != -1;
        } finally {
            if (db != null) {
                db.close();
            }
        }
    }
}

