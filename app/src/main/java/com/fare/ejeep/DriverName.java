package com.fare.ejeep;

import static com.fare.ejeep.DbManager.Table_Name;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DriverName extends AppCompatActivity {

    private DbManager mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_name);

        // Initialize DbManager
        mydb = new DbManager(this);

        Button D1 = findViewById(R.id.D1);
        Button D2 = findViewById(R.id.D2);
        Button D3 = findViewById(R.id.D3);
        Button D4 = findViewById(R.id.D4);
        Button D5 = findViewById(R.id.D5);
        Button D6= findViewById(R.id.D6);
        Button D7 = findViewById(R.id.D7);
        Button D8 = findViewById(R.id.D8);
        Button D9 = findViewById(R.id.D9);
        Button D10 = findViewById(R.id.D10);
        Button D11 = findViewById(R.id.D11);
        Button D12 = findViewById(R.id.D12);
        Button D13 = findViewById(R.id.D13);
        Button D14 = findViewById(R.id.D14);
        Button D15 = findViewById(R.id.D15);
        Button D16 = findViewById(R.id.D16);
        Button D17 = findViewById(R.id.D17);
        Button D18 = findViewById(R.id.D18);
        Button D19 = findViewById(R.id.D19);
        Button D20 = findViewById(R.id.D20);
        Button D21 = findViewById(R.id.D21);
        Button D22 = findViewById(R.id.D22);
        Button D23 = findViewById(R.id.D23);
        Button D24 = findViewById(R.id.D24);
        Button D25 = findViewById(R.id.D25);




        D1.setOnClickListener(v -> {
            // Retrieve the string value from resources
            String Driver1 = getString(R.string.D1);

            // Insert driver name into the database
            boolean driverInserted = mydb.insertData(DbManager.Col1, Driver1);

            if (driverInserted) {
                // Driver name inserted successfully
                Toast.makeText(getApplicationContext(), "Driver inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(DriverName.this, BodyNumber.class);
                startActivity(intent);

            } else {
                // Failed to insert driver name
                Toast.makeText(getApplicationContext(), "Failed to insert Driver", Toast.LENGTH_SHORT).show();
            }
        });

        D2.setOnClickListener(v -> {
            // Retrieve the string value from resources
            String Driver1 = getString(R.string.D2);

            // Insert driver name into the database
            boolean driverInserted = mydb.insertData(DbManager.Col1, Driver1);

            if (driverInserted) {
                // Driver name inserted successfully
                Toast.makeText(getApplicationContext(), "Driver inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(DriverName.this, BodyNumber.class);
                startActivity(intent);

            } else {
                // Failed to insert driver name
                Toast.makeText(getApplicationContext(), "Failed to insert Driver", Toast.LENGTH_SHORT).show();
            }
        });
        D3.setOnClickListener(v -> {
            // Retrieve the string value from resources
            String Driver1 = getString(R.string.D3);

            // Insert driver name into the database
            boolean driverInserted = mydb.insertData(DbManager.Col1, Driver1);

            if (driverInserted) {
                // Driver name inserted successfully
                Toast.makeText(getApplicationContext(), "Driver inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(DriverName.this, BodyNumber.class);
                startActivity(intent);

            } else {
                // Failed to insert driver name
                Toast.makeText(getApplicationContext(), "Failed to insert Driver", Toast.LENGTH_SHORT).show();
            }
        });
        D4.setOnClickListener(v -> {
            // Retrieve the string value from resources
            String Driver1 = getString(R.string.D4);

            // Insert driver name into the database
            boolean driverInserted = mydb.insertData(DbManager.Col1, Driver1);

            if (driverInserted) {
                // Driver name inserted successfully
                Toast.makeText(getApplicationContext(), "Driver inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(DriverName.this, BodyNumber.class);
                startActivity(intent);

            } else {
                // Failed to insert driver name
                Toast.makeText(getApplicationContext(), "Failed to insert Driver", Toast.LENGTH_SHORT).show();
            }
        });
        D5.setOnClickListener(v -> {
            // Retrieve the string value from resources
            String Driver1 = getString(R.string.D5);

            // Insert driver name into the database
            boolean driverInserted = mydb.insertData(DbManager.Col1, Driver1);

            if (driverInserted) {
                // Driver name inserted successfully
                Toast.makeText(getApplicationContext(), "Driver inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(DriverName.this, BodyNumber.class);
                startActivity(intent);

            } else {
                // Failed to insert driver name
                Toast.makeText(getApplicationContext(), "Failed to insert Driver", Toast.LENGTH_SHORT).show();
            }
        });
        D6.setOnClickListener(v -> {
            // Retrieve the string value from resources
            String Driver1 = getString(R.string.D6);

            // Insert driver name into the database
            boolean driverInserted = mydb.insertData(DbManager.Col1, Driver1);

            if (driverInserted) {
                // Driver name inserted successfully
                Toast.makeText(getApplicationContext(), "Driver inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(DriverName.this, BodyNumber.class);
                startActivity(intent);

            } else {
                // Failed to insert driver name
                Toast.makeText(getApplicationContext(), "Failed to insert Driver", Toast.LENGTH_SHORT).show();
            }
        });
        D7.setOnClickListener(v -> {
            // Retrieve the string value from resources
            String Driver1 = getString(R.string.D7);

            // Insert driver name into the database
            boolean driverInserted = mydb.insertData(DbManager.Col1, Driver1);

            if (driverInserted) {
                // Driver name inserted successfully
                Toast.makeText(getApplicationContext(), "Driver inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(DriverName.this, BodyNumber.class);
                startActivity(intent);

            } else {
                // Failed to insert driver name
                Toast.makeText(getApplicationContext(), "Failed to insert Driver", Toast.LENGTH_SHORT).show();
            }
        });
        D8.setOnClickListener(v -> {
            // Retrieve the string value from resources
            String Driver1 = getString(R.string.D8);

            // Insert driver name into the database
            boolean driverInserted = mydb.insertData(DbManager.Col1, Driver1);

            if (driverInserted) {
                // Driver name inserted successfully
                Toast.makeText(getApplicationContext(), "Driver inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(DriverName.this, BodyNumber.class);
                startActivity(intent);

            } else {
                // Failed to insert driver name
                Toast.makeText(getApplicationContext(), "Failed to insert Driver", Toast.LENGTH_SHORT).show();
            }
        });
        D9.setOnClickListener(v -> {
            // Retrieve the string value from resources
            String Driver1 = getString(R.string.D9);

            // Insert driver name into the database
            boolean driverInserted = mydb.insertData(DbManager.Col1, Driver1);

            if (driverInserted) {
                // Driver name inserted successfully
                Toast.makeText(getApplicationContext(), "Driver inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(DriverName.this, BodyNumber.class);
                startActivity(intent);

            } else {
                // Failed to insert driver name
                Toast.makeText(getApplicationContext(), "Failed to insert Driver", Toast.LENGTH_SHORT).show();
            }
        });
        D10.setOnClickListener(v -> {
            // Retrieve the string value from resources
            String Driver1 = getString(R.string.D10);

            // Insert driver name into the database
            boolean driverInserted = mydb.insertData(DbManager.Col1, Driver1);

            if (driverInserted) {
                // Driver name inserted successfully
                Toast.makeText(getApplicationContext(), "Driver inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(DriverName.this, BodyNumber.class);
                startActivity(intent);

            } else {
                // Failed to insert driver name
                Toast.makeText(getApplicationContext(), "Failed to insert Driver", Toast.LENGTH_SHORT).show();
            }
        });

        D11.setOnClickListener(v -> {
            // Retrieve the string value from resources
            String Driver1 = getString(R.string.D11);

            // Insert driver name into the database
            boolean driverInserted = mydb.insertData(DbManager.Col1, Driver1);

            if (driverInserted) {
                // Driver name inserted successfully
                Toast.makeText(getApplicationContext(), "Driver inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(DriverName.this, BodyNumber.class);
                startActivity(intent);

            } else {
                // Failed to insert driver name
                Toast.makeText(getApplicationContext(), "Failed to insert Driver", Toast.LENGTH_SHORT).show();
            }
        });
        D12.setOnClickListener(v -> {
            // Retrieve the string value from resources
            String Driver1 = getString(R.string.D12);

            // Insert driver name into the database
            boolean driverInserted = mydb.insertData(DbManager.Col1, Driver1);

            if (driverInserted) {
                // Driver name inserted successfully
                Toast.makeText(getApplicationContext(), "Driver inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(DriverName.this, BodyNumber.class);
                startActivity(intent);

            } else {
                // Failed to insert driver name
                Toast.makeText(getApplicationContext(), "Failed to insert Driver", Toast.LENGTH_SHORT).show();
            }
        });
        D13.setOnClickListener(v -> {
            // Retrieve the string value from resources
            String Driver1 = getString(R.string.D13);

            // Insert driver name into the database
            boolean driverInserted = mydb.insertData(DbManager.Col1, Driver1);

            if (driverInserted) {
                // Driver name inserted successfully
                Toast.makeText(getApplicationContext(), "Driver inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(DriverName.this, BodyNumber.class);
                startActivity(intent);

            } else {
                // Failed to insert driver name
                Toast.makeText(getApplicationContext(), "Failed to insert Driver", Toast.LENGTH_SHORT).show();
            }
        });
        D14.setOnClickListener(v -> {
            // Retrieve the string value from resources
            String Driver1 = getString(R.string.D14);

            // Insert driver name into the database
            boolean driverInserted = mydb.insertData(DbManager.Col1, Driver1);

            if (driverInserted) {
                // Driver name inserted successfully
                Toast.makeText(getApplicationContext(), "Driver inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(DriverName.this, BodyNumber.class);
                startActivity(intent);

            } else {
                // Failed to insert driver name
                Toast.makeText(getApplicationContext(), "Failed to insert Driver", Toast.LENGTH_SHORT).show();
            }
        });
        D15.setOnClickListener(v -> {
            // Retrieve the string value from resources
            String Driver1 = getString(R.string.D15);

            // Insert driver name into the database
            boolean driverInserted = mydb.insertData(DbManager.Col1, Driver1);

            if (driverInserted) {
                // Driver name inserted successfully
                Toast.makeText(getApplicationContext(), "Driver inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(DriverName.this, BodyNumber.class);
                startActivity(intent);

            } else {
                // Failed to insert driver name
                Toast.makeText(getApplicationContext(), "Failed to insert Driver", Toast.LENGTH_SHORT).show();
            }
        });
        D16.setOnClickListener(v -> {
            // Retrieve the string value from resources
            String Driver1 = getString(R.string.D16);

            // Insert driver name into the database
            boolean driverInserted = mydb.insertData(DbManager.Col1, Driver1);

            if (driverInserted) {
                // Driver name inserted successfully
                Toast.makeText(getApplicationContext(), "Driver inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(DriverName.this, BodyNumber.class);
                startActivity(intent);

            } else {
                // Failed to insert driver name
                Toast.makeText(getApplicationContext(), "Failed to insert Driver", Toast.LENGTH_SHORT).show();
            }
        });
        D17.setOnClickListener(v -> {
            // Retrieve the string value from resources
            String Driver1 = getString(R.string.D17);

            // Insert driver name into the database
            boolean driverInserted = mydb.insertData(DbManager.Col1, Driver1);

            if (driverInserted) {
                // Driver name inserted successfully
                Toast.makeText(getApplicationContext(), "Driver inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(DriverName.this, BodyNumber.class);
                startActivity(intent);

            } else {
                // Failed to insert driver name
                Toast.makeText(getApplicationContext(), "Failed to insert Driver", Toast.LENGTH_SHORT).show();
            }
        });
        D18.setOnClickListener(v -> {
            // Retrieve the string value from resources
            String Driver1 = getString(R.string.D18);

            // Insert driver name into the database
            boolean driverInserted = mydb.insertData(DbManager.Col1, Driver1);

            if (driverInserted) {
                // Driver name inserted successfully
                Toast.makeText(getApplicationContext(), "Driver inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(DriverName.this, BodyNumber.class);
                startActivity(intent);

            } else {
                // Failed to insert driver name
                Toast.makeText(getApplicationContext(), "Failed to insert Driver", Toast.LENGTH_SHORT).show();
            }
        });

        D19.setOnClickListener(v -> {
            // Retrieve the string value from resources
            String Driver1 = getString(R.string.D19);

            // Insert driver name into the database
            boolean driverInserted = mydb.insertData(DbManager.Col1, Driver1);

            if (driverInserted) {
                // Driver name inserted successfully
                Toast.makeText(getApplicationContext(), "Driver inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(DriverName.this, BodyNumber.class);
                startActivity(intent);

            } else {
                // Failed to insert driver name
                Toast.makeText(getApplicationContext(), "Failed to insert Driver", Toast.LENGTH_SHORT).show();
            }
        });
        D20.setOnClickListener(v -> {
            // Retrieve the string value from resources
            String Driver1 = getString(R.string.D20);

            // Insert driver name into the database
            boolean driverInserted = mydb.insertData(DbManager.Col1, Driver1);

            if (driverInserted) {
                // Driver name inserted successfully
                Toast.makeText(getApplicationContext(), "Driver inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(DriverName.this, BodyNumber.class);
                startActivity(intent);

            } else {
                // Failed to insert driver name
                Toast.makeText(getApplicationContext(), "Failed to insert Driver", Toast.LENGTH_SHORT).show();
            }
        });
        D21.setOnClickListener(v -> {
            // Retrieve the string value from resources
            String Driver1 = getString(R.string.D21);

            // Insert driver name into the database
            boolean driverInserted = mydb.insertData(DbManager.Col1, Driver1);

            if (driverInserted) {
                // Driver name inserted successfully
                Toast.makeText(getApplicationContext(), "Driver inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(DriverName.this, BodyNumber.class);
                startActivity(intent);

            } else {
                // Failed to insert driver name
                Toast.makeText(getApplicationContext(), "Failed to insert Driver", Toast.LENGTH_SHORT).show();
            }
        });
        D22.setOnClickListener(v -> {
            // Retrieve the string value from resources
            String Driver1 = getString(R.string.D22);

            // Insert driver name into the database
            boolean driverInserted = mydb.insertData(DbManager.Col1, Driver1);

            if (driverInserted) {
                // Driver name inserted successfully
                Toast.makeText(getApplicationContext(), "Driver inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(DriverName.this, BodyNumber.class);
                startActivity(intent);

            } else {
                // Failed to insert driver name
                Toast.makeText(getApplicationContext(), "Failed to insert Driver", Toast.LENGTH_SHORT).show();
            }
        });
        D23.setOnClickListener(v -> {
            // Retrieve the string value from resources
            String Driver1 = getString(R.string.D24);

            // Insert driver name into the database
            boolean driverInserted = mydb.insertData(DbManager.Col1, Driver1);

            if (driverInserted) {
                // Driver name inserted successfully
                Toast.makeText(getApplicationContext(), "Driver inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(DriverName.this, BodyNumber.class);
                startActivity(intent);

            } else {
                // Failed to insert driver name
                Toast.makeText(getApplicationContext(), "Failed to insert Driver", Toast.LENGTH_SHORT).show();
            }
        });
        D25.setOnClickListener(v -> {
            // Retrieve the string value from resources
            String Driver1 = getString(R.string.D25);

            // Insert driver name into the database
            boolean driverInserted = mydb.insertData(DbManager.Col1, Driver1);

            if (driverInserted) {
                // Driver name inserted successfully
                Toast.makeText(getApplicationContext(), "Driver inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(DriverName.this, BodyNumber.class);
                startActivity(intent);

            } else {
                // Failed to insert driver name
                Toast.makeText(getApplicationContext(), "Failed to insert Driver", Toast.LENGTH_SHORT).show();
            }
        });

    }


}
