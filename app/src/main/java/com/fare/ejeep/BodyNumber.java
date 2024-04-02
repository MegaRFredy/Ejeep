package com.fare.ejeep;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class BodyNumber extends AppCompatActivity {
    private DbManager mydb;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_body_number);

        mydb = new DbManager(this); // Initialize DbManager

        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);
        Button b10 = findViewById(R.id.b10);
        Button b11 = findViewById(R.id.b11);
        Button b12 = findViewById(R.id.b12);
        Button b13 = findViewById(R.id.b13);
        Button b14 = findViewById(R.id.b14);
        Button b15 = findViewById(R.id.b15);
        Button b16 = findViewById(R.id.b16);

        b1.setOnClickListener(v -> {
            String Bodynum = getString(R.string.F01); // Retrieve the string value from resources
            boolean BodynumInserted = mydb.insertData(DbManager.Col2, Bodynum);
            if (BodynumInserted) {
                // Body number inserted successfully
                Toast.makeText(getApplicationContext(), "BodyNum inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(BodyNumber.this, TripNumber.class);
                startActivity(intent);
                finish(); // Optionally finish the current activity
            } else {
                // Failed to insert body number
                Toast.makeText(getApplicationContext(), "Failed to insert BodyNum", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });
        b2.setOnClickListener(v -> {
            String Bodynum = getString(R.string.F02); // Retrieve the string value from resources
            boolean BodynumInserted = mydb.insertData(DbManager.Col2, Bodynum);
            if (BodynumInserted) {
                // Body number inserted successfully
                Toast.makeText(getApplicationContext(), "BodyNum inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(BodyNumber.this, TripNumber.class);
                startActivity(intent);
                finish(); // Optionally finish the current activity
            } else {
                // Failed to insert body number
                Toast.makeText(getApplicationContext(), "Failed to insert BodyNum", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });
        b3.setOnClickListener(v -> {
            String Bodynum = getString(R.string.F03); // Retrieve the string value from resources
            boolean BodynumInserted = mydb.insertData(DbManager.Col2, Bodynum);
            if (BodynumInserted) {
                // Body number inserted successfully
                Toast.makeText(getApplicationContext(), "BodyNum inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(BodyNumber.this, TripNumber.class);
                startActivity(intent);
                finish(); // Optionally finish the current activity
            } else {
                // Failed to insert body number
                Toast.makeText(getApplicationContext(), "Failed to insert BodyNum", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });
        b4.setOnClickListener(v -> {
            String Bodynum = getString(R.string.F04); // Retrieve the string value from resources
            boolean BodynumInserted = mydb.insertData(DbManager.Col2, Bodynum);
            if (BodynumInserted) {
                // Body number inserted successfully
                Toast.makeText(getApplicationContext(), "BodyNum inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(BodyNumber.this, TripNumber.class);
                startActivity(intent);
                finish(); // Optionally finish the current activity
            } else {
                // Failed to insert body number
                Toast.makeText(getApplicationContext(), "Failed to insert BodyNum", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });
        b5.setOnClickListener(v -> {
            String Bodynum = getString(R.string.F05); // Retrieve the string value from resources
            boolean BodynumInserted = mydb.insertData(DbManager.Col2, Bodynum);
            if (BodynumInserted) {
                // Body number inserted successfully
                Toast.makeText(getApplicationContext(), "BodyNum inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(BodyNumber.this, TripNumber.class);
                startActivity(intent);
                finish(); // Optionally finish the current activity
            } else {
                // Failed to insert body number
                Toast.makeText(getApplicationContext(), "Failed to insert BodyNum", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });
        b6.setOnClickListener(v -> {
            String Bodynum = getString(R.string.F06); // Retrieve the string value from resources
            boolean BodynumInserted = mydb.insertData(DbManager.Col2, Bodynum);
            if (BodynumInserted) {
                // Body number inserted successfully
                Toast.makeText(getApplicationContext(), "BodyNum inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(BodyNumber.this, TripNumber.class);
                startActivity(intent);
                finish(); // Optionally finish the current activity
            } else {
                // Failed to insert body number
                Toast.makeText(getApplicationContext(), "Failed to insert BodyNum", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });
        b8.setOnClickListener(v -> {
            String Bodynum = getString(R.string.F07); // Retrieve the string value from resources
            boolean BodynumInserted = mydb.insertData(DbManager.Col2, Bodynum);
            if (BodynumInserted) {
                // Body number inserted successfully
                Toast.makeText(getApplicationContext(), "BodyNum inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(BodyNumber.this, TripNumber.class);
                startActivity(intent);
                finish(); // Optionally finish the current activity
            } else {
                // Failed to insert body number
                Toast.makeText(getApplicationContext(), "Failed to insert BodyNum", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });
        b9.setOnClickListener(v -> {
            String Bodynum = getString(R.string.F09); // Retrieve the string value from resources
            boolean BodynumInserted = mydb.insertData(DbManager.Col2, Bodynum);
            if (BodynumInserted) {
                // Body number inserted successfully
                Toast.makeText(getApplicationContext(), "BodyNum inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(BodyNumber.this, TripNumber.class);
                startActivity(intent);
                finish(); // Optionally finish the current activity
            } else {
                // Failed to insert body number
                Toast.makeText(getApplicationContext(), "Failed to insert BodyNum", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });
        b10.setOnClickListener(v -> {
            String Bodynum = getString(R.string.F10); // Retrieve the string value from resources
            boolean BodynumInserted = mydb.insertData(DbManager.Col2, Bodynum);
            if (BodynumInserted) {
                // Body number inserted successfully
                Toast.makeText(getApplicationContext(), "BodyNum inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(BodyNumber.this, TripNumber.class);
                startActivity(intent);
                finish(); // Optionally finish the current activity
            } else {
                // Failed to insert body number
                Toast.makeText(getApplicationContext(), "Failed to insert BodyNum", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });
        b11.setOnClickListener(v -> {
            String Bodynum = getString(R.string.F11); // Retrieve the string value from resources
            boolean BodynumInserted = mydb.insertData(DbManager.Col2, Bodynum);
            if (BodynumInserted) {
                // Body number inserted successfully
                Toast.makeText(getApplicationContext(), "BodyNum inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(BodyNumber.this, TripNumber.class);
                startActivity(intent);
                finish(); // Optionally finish the current activity
            } else {
                // Failed to insert body number
                Toast.makeText(getApplicationContext(), "Failed to insert BodyNum", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });
        b12.setOnClickListener(v -> {
            String Bodynum = getString(R.string.F12); // Retrieve the string value from resources
            boolean BodynumInserted = mydb.insertData(DbManager.Col2, Bodynum);
            if (BodynumInserted) {
                // Body number inserted successfully
                Toast.makeText(getApplicationContext(), "BodyNum inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(BodyNumber.this, TripNumber.class);
                startActivity(intent);
                finish(); // Optionally finish the current activity
            } else {
                // Failed to insert body number
                Toast.makeText(getApplicationContext(), "Failed to insert BodyNum", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });
        b13.setOnClickListener(v -> {
            String Bodynum = getString(R.string.F13); // Retrieve the string value from resources
            boolean BodynumInserted = mydb.insertData(DbManager.Col2, Bodynum);
            if (BodynumInserted) {
                // Body number inserted successfully
                Toast.makeText(getApplicationContext(), "BodyNum inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(BodyNumber.this, TripNumber.class);
                startActivity(intent);
                finish(); // Optionally finish the current activity
            } else {
                // Failed to insert body number
                Toast.makeText(getApplicationContext(), "Failed to insert BodyNum", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });
        b14.setOnClickListener(v -> {
            String Bodynum = getString(R.string.F14); // Retrieve the string value from resources
            boolean BodynumInserted = mydb.insertData(DbManager.Col2, Bodynum);
            if (BodynumInserted) {
                // Body number inserted successfully
                Toast.makeText(getApplicationContext(), "BodyNum inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(BodyNumber.this, TripNumber.class);
                startActivity(intent);
                finish(); // Optionally finish the current activity
            } else {
                // Failed to insert body number
                Toast.makeText(getApplicationContext(), "Failed to insert BodyNum", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });
        b15.setOnClickListener(v -> {
            String Bodynum = getString(R.string.F15); // Retrieve the string value from resources
            boolean BodynumInserted = mydb.insertData(DbManager.Col2, Bodynum);
            if (BodynumInserted) {
                // Body number inserted successfully
                Toast.makeText(getApplicationContext(), "BodyNum inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(BodyNumber.this, TripNumber.class);
                startActivity(intent);
                finish(); // Optionally finish the current activity
            } else {
                // Failed to insert body number
                Toast.makeText(getApplicationContext(), "Failed to insert BodyNum", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });
        b16.setOnClickListener(v -> {
            String Bodynum = getString(R.string.F16); // Retrieve the string value from resources
            boolean BodynumInserted = mydb.insertData(DbManager.Col2, Bodynum);
            if (BodynumInserted) {
                // Body number inserted successfully
                Toast.makeText(getApplicationContext(), "BodyNum inserted successfully", Toast.LENGTH_SHORT).show();

                // Start the new activity after insertion
                Intent intent = new Intent(BodyNumber.this, TripNumber.class);
                startActivity(intent);
                finish(); // Optionally finish the current activity
            } else {
                // Failed to insert body number
                Toast.makeText(getApplicationContext(), "Failed to insert BodyNum", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });

    }

}
