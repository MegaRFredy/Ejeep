package com.fare.ejeep;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbManager extends SQLiteOpenHelper{
    public static final String Database_Name = "Jeep.db";
    public static final String Table_Name = "tbl_Jeep";
    public static final String COL_1 =  "Driver";
    public static final String COL_2 = "Trip";

    public static final String COL_3 = "BodyNumber";
    public static final String COL_4 = "Fare";

    public DbManager( Context context) {
        super(context, Database_Name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
