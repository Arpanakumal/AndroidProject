package com.example.assignment;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnWidgets, btnLogin, btnCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWidgets = findViewById(R.id.btnWidgets);
        btnLogin = findViewById(R.id.btnLogin);
        btnCalculator = findViewById(R.id.btnCalculator);

        btnWidgets.setOnClickListener(v ->
                startActivity(new Intent(this, WidgetsActivity.class)));

        btnLogin.setOnClickListener(v ->
                startActivity(new Intent(this, LoginActivity.class)));

        btnCalculator.setOnClickListener(v ->
                startActivity(new Intent(this, CalculatorActivity.class)));

        Button btnPopup = findViewById(R.id.btnPopup);

        btnPopup.setOnClickListener(v ->
                startActivity(new Intent(this, PopupActivity.class)));

        Button btnLoginDialog = findViewById(R.id.btnLoginDialog);

        btnLoginDialog.setOnClickListener(v ->
                startActivity(new Intent(this, LoginDialogActivity.class)));

        Button btnListView = findViewById(R.id.btnListView);
        btnListView.setOnClickListener(v ->
                startActivity(new Intent(this, ListViewActivity.class)));



    }
}
