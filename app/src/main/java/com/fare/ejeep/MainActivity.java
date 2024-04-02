package com.fare.ejeep;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_EXTERNAL_STORAGE = 1;
    private static final String[] PERMISSIONS_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE
    };
    private DbManager mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        mydb = new DbManager(this);

        Button F1 = findViewById(R.id.F1);
        Button F2 = findViewById(R.id.F2);
        Button VIEW = findViewById(R.id.VIEW);

        F1.setOnClickListener(v -> {
            String Fare1 = getString(R.string.F1); // Assuming this is where you get the fare value
            boolean FareInserted = mydb.insertData(DbManager.Col4, Fare1);
            if (FareInserted) {
                // Fare value inserted successfully
                Toast.makeText(getApplicationContext(), "50 inserted successfully", Toast.LENGTH_SHORT).show();
            } else {
                // Failed to insert fare value
                Toast.makeText(getApplicationContext(), "Failed to insert fare value", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });

        F2.setOnClickListener(v -> {
            String Fare1 = getString(R.string.F2); // Assuming this is where you get the fare value
            boolean FareInserted = mydb.insertData(DbManager.Col4, Fare1);
            if (FareInserted) {
                // Fare value inserted successfully
                Toast.makeText(getApplicationContext(), "45 inserted successfully", Toast.LENGTH_SHORT).show();
            } else {
                // Failed to insert fare value
                Toast.makeText(getApplicationContext(), "Failed to insert fare value", Toast.LENGTH_SHORT).show();
                // Example: Retry the operation
            }
        });


        if (checkStoragePermission()) {
            requestStoragePermission();
        }


    }

    // Define openViewDataActivity method outside of onClick
    public void openViewDataActivity(View view) {
        Intent intent = new Intent(this, ViewActivityData.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

    }
    private boolean checkStoragePermission() {
        return ContextCompat.checkSelfPermission(this,
                Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED;
    }

    private void requestStoragePermission() {
        ActivityCompat.requestPermissions(this, PERMISSIONS_STORAGE,
                REQUEST_EXTERNAL_STORAGE);
    }
}
