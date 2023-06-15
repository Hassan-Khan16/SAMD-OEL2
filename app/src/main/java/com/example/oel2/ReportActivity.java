package com.example.oel2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

// ReportActivity.java
public class ReportActivity extends AppCompatActivity {

    private Button btnSendDistressSignal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        btnSendDistressSignal = findViewById(R.id.btnSendDistressSignal);
        btnSendDistressSignal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve user input
//                String location = "";

//                // Send distress signal
//                sendDistressSignal(String location);
            }
        });
    }

    private void sendDistressSignal() {
        // Implement the logic to send the distress signal
        // This can include making API requests, generating notifications, etc.
        // You may need to handle authentication and authorization for sending the signal to the appropriate channels.

        // Assuming the distress signal is successfully sent
        Toast.makeText(getApplicationContext(), "Distress signal sent to emergency responder!", Toast.LENGTH_SHORT).show();
    }
}
