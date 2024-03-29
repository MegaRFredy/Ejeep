package com.fare.ejeep;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbManager extends SQLiteOpenHelper {
    public static final String Database_Name = "Jeep.db";
    public static final String Table_Name = "tbl_Jeep";
    public static final String COL_4 = "Fare";

    public DbManager(Context context) {
        super(context, Database_Name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + Table_Name + " ("
                + COL_4 + " TEXT)"); // or INTEGER if you prefer
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Table_Name);
        onCreate(db);
    }

}
