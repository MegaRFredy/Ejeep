package com.fare.ejeep;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ViewActivityData extends AppCompatActivity {
    private DbManager dbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_data); // Assuming your layout file is named activity_view_data.xml

        dbManager = new DbManager(this);

        ListView listView = findViewById(R.id.listView);

        ArrayList<String> dataList = getAllData();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dataList);

        listView.setAdapter(adapter);
    }

    private ArrayList<String> getAllData() {
        ArrayList<String> dataList = new ArrayList<>();
        SQLiteDatabase db = dbManager.getReadableDatabase();

        // Define the columns you want to retrieve
        String[] projection = {
                DbManager.Col1,
                DbManager.Col2,
                DbManager.Col3,
                DbManager.Col4
        };

        // Query the database to retrieve all rows and columns
        Cursor cursor = db.query(
                DbManager.Table_Name,
                projection,
                null,
                null,
                null,
                null,
                null
        );

        // Iterate through the cursor to fetch each row
        while (cursor.moveToNext()) {
            // Retrieve values for each column in the current row
            String driverName = cursor.getString(cursor.getColumnIndexOrThrow(DbManager.Col1));
            String bodyNumber = cursor.getString(cursor.getColumnIndexOrThrow(DbManager.Col2));
            String tripNumber = cursor.getString(cursor.getColumnIndexOrThrow(DbManager.Col3));
            String fare = cursor.getString(cursor.getColumnIndexOrThrow(DbManager.Col4));

            // Format the entry using the formatEntry method
            String formattedEntry = formatEntry(driverName, bodyNumber, tripNumber, fare);

            // Add the formatted entry to the ArrayList
            dataList.add(formattedEntry);
        }

        // Close the cursor to release resources
        cursor.close();

        return dataList;
    }



    private String formatEntry(String driverName,String bodyNumber,String tripNumber, String fare) {
        return String.format("%-20s %-20s %-20s %-20s", driverName,bodyNumber,tripNumber, fare);
    }



}
