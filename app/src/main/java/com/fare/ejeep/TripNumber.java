package com.fare.ejeep;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TripNumber extends AppCompatActivity {
    private DbManager mydb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_trip_number);

        mydb = new DbManager(this); // Initialize DbManager

        Button t1 = findViewById(R.id.T1);
        Button t2 = findViewById(R.id.T2);
        Button t3 = findViewById(R.id.T3);
        Button t4 = findViewById(R.id.T4);
        Button t5 = findViewById(R.id.T5);
        Button t6 = findViewById(R.id.T6);
        Button t7 = findViewById(R.id.T7);
        Button t8 = findViewById(R.id.T8);
        Button t9 = findViewById(R.id.T9);
        Button t10 = findViewById(R.id.T10);


        t1.setOnClickListener(v -> {
            String Trip = getString(R.string.T1); // Retrieve the string value from resources
            boolean insertData = mydb.insertData(DbManager.Col3, Trip);
            if (insertData) {
                // Trip number inserted successfully
                Toast.makeText(getApplicationContext(), "Trip inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(TripNumber.this, MainActivity.class);
                startActivity(intent);
                finish(); // Optionally finish the current activity
            } else {
                // Failed to insert trip number
                Toast.makeText(getApplicationContext(), "Failed to insert Trip", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });
        t2.setOnClickListener(v -> {
            String Trip = getString(R.string.T2); // Retrieve the string value from resources
            boolean insertData = mydb.insertData(DbManager.Col3, Trip);
            if (insertData) {
                // Trip number inserted successfully
                Toast.makeText(getApplicationContext(), "Trip inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(TripNumber.this, MainActivity.class);
                startActivity(intent);
                finish(); // Optionally finish the current activity
            } else {
                // Failed to insert trip number
                Toast.makeText(getApplicationContext(), "Failed to insert Trip", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });
        t3.setOnClickListener(v -> {
            String Trip = getString(R.string.T3); // Retrieve the string value from resources
            boolean insertData = mydb.insertData(DbManager.Col3, Trip);
            if (insertData) {
                // Trip number inserted successfully
                Toast.makeText(getApplicationContext(), "Trip inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(TripNumber.this, MainActivity.class);
                startActivity(intent);
                finish(); // Optionally finish the current activity
            } else {
                // Failed to insert trip number
                Toast.makeText(getApplicationContext(), "Failed to insert Trip", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });
        t4.setOnClickListener(v -> {
            String Trip = getString(R.string.T4); // Retrieve the string value from resources
            boolean insertData = mydb.insertData(DbManager.Col3, Trip);
            if (insertData) {
                // Trip number inserted successfully
                Toast.makeText(getApplicationContext(), "Trip inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(TripNumber.this, MainActivity.class);
                startActivity(intent);
                finish(); // Optionally finish the current activity
            } else {
                // Failed to insert trip number
                Toast.makeText(getApplicationContext(), "Failed to insert Trip", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });
        t5.setOnClickListener(v -> {
            String Trip = getString(R.string.T5); // Retrieve the string value from resources
            boolean insertData = mydb.insertData(DbManager.Col3, Trip);
            if (insertData) {
                // Trip number inserted successfully
                Toast.makeText(getApplicationContext(), "Trip inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(TripNumber.this, MainActivity.class);
                startActivity(intent);
                finish(); // Optionally finish the current activity
            } else {
                // Failed to insert trip number
                Toast.makeText(getApplicationContext(), "Failed to insert Trip", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });
        t6.setOnClickListener(v -> {
            String Trip = getString(R.string.T6); // Retrieve the string value from resources
            boolean insertData = mydb.insertData(DbManager.Col3, Trip);
            if (insertData) {
                // Trip number inserted successfully
                Toast.makeText(getApplicationContext(), "Trip inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(TripNumber.this, MainActivity.class);
                startActivity(intent);
                finish(); // Optionally finish the current activity
            } else {
                // Failed to insert trip number
                Toast.makeText(getApplicationContext(), "Failed to insert Trip", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });
        t7.setOnClickListener(v -> {
            String Trip = getString(R.string.T8); // Retrieve the string value from resources
            boolean insertData = mydb.insertData(DbManager.Col3, Trip);
            if (insertData) {
                // Trip number inserted successfully
                Toast.makeText(getApplicationContext(), "Trip inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(TripNumber.this, MainActivity.class);
                startActivity(intent);
                finish(); // Optionally finish the current activity
            } else {
                // Failed to insert trip number
                Toast.makeText(getApplicationContext(), "Failed to insert Trip", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });
        t9.setOnClickListener(v -> {
            String Trip = getString(R.string.T9); // Retrieve the string value from resources
            boolean insertData = mydb.insertData(DbManager.Col3, Trip);
            if (insertData) {
                // Trip number inserted successfully
                Toast.makeText(getApplicationContext(), "Trip inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(TripNumber.this, MainActivity.class);
                startActivity(intent);
                finish(); // Optionally finish the current activity
            } else {
                // Failed to insert trip number
                Toast.makeText(getApplicationContext(), "Failed to insert Trip", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });
        t10.setOnClickListener(v -> {
            String Trip = getString(R.string.T10); // Retrieve the string value from resources
            boolean insertData = mydb.insertData(DbManager.Col3, Trip);
            if (insertData) {
                // Trip number inserted successfully
                Toast.makeText(getApplicationContext(), "Trip inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(TripNumber.this, MainActivity.class);
                startActivity(intent);
                finish(); // Optionally finish the current activity
            } else {
                // Failed to insert trip number
                Toast.makeText(getApplicationContext(), "Failed to insert Trip", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });

    }

}