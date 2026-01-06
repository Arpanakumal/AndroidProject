package com.example.assignment;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result); // Must set layout first

        // Initialize TextView
        tvResult = findViewById(R.id.tvResult);

        // Get data from Intent
        String op = getIntent().getStringExtra("operation");
        int result = getIntent().getIntExtra("result", 0);

        // Display the result
        tvResult.setText(getString(R.string.result_format, op, result));
    }
}
