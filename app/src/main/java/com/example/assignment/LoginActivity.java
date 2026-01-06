package com.example.assignment;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText etEmail, etPassword;
    Button btnLogin;
    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        tvMessage = findViewById(R.id.tvMessage);

        btnLogin.setOnClickListener(v -> {

            String email = etEmail.getText().toString().trim();
            String password = etPassword.getText().toString().trim();

            if (email.isEmpty()) {
                tvMessage.setText(R.string.enter_email);
            } else if (password.isEmpty()) {
                tvMessage.setText(R.string.enter_password);
            } else if (!email.contains("@")) {
                tvMessage.setText(R.string.invalid_email);
            } else {
                // ✅ Login Successful
                tvMessage.setText(R.string.login_successful);

                // 🔹 INTENT HERE
                Intent intent = new Intent(LoginActivity.this, WidgetsActivity.class);
                startActivity(intent);

                // optional: close login screen
                // finish();
            }
        });
    }
}