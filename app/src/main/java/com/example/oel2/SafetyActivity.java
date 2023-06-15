package com.example.oel2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class SafetyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safety);

        // Get reference to the TextView for displaying safety tips
        TextView safetyTipsTextView = findViewById(R.id.safetyTextView);

        // Set hardcoded safety tips
        String safetyTips = "1. Stay calm and assess the situation.\n\n" +
                "2. Call emergency services immediately.\n\n" +
                "3. Follow the instructions of emergency responders.\n\n" +
                "4. Stay away from danger zones.\n\n" +
                "5. Help others if it's safe to do so.\n\n" +
                "6. Wait for official clearance before returning to affected areas.\n\n";

        safetyTipsTextView.setText(safetyTips);
    }
}