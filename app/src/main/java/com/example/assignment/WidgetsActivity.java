package com.example.assignment;


import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class WidgetsActivity extends AppCompatActivity {

    EditText etName;
    RadioGroup radioGroup;
    CheckBox checkAgree;
    Spinner spinnerCourse;
    Button btnSubmit;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets);

        etName = findViewById(R.id.etName);
        radioGroup = findViewById(R.id.radioGroup);
        checkAgree = findViewById(R.id.checkAgree);
        spinnerCourse = findViewById(R.id.spinnerCourse);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvResult = findViewById(R.id.tvResult);

        // Spinner data
        String[] courses = {"Android", "Java", "Python", "Web Development"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                courses
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCourse.setAdapter(adapter);

        // Button click
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = etName.getText().toString();
                String course = spinnerCourse.getSelectedItem().toString();

                int selectedId = radioGroup.getCheckedRadioButtonId();
                String gender = "";

                if (selectedId != -1) {
                    RadioButton radioButton = findViewById(selectedId);
                    gender = radioButton.getText().toString();
                }

                if (!checkAgree.isChecked()) {
                    tvResult.setText("Please agree to terms");
                    return;
                }

                tvResult.setText(
                        "Name: " + name +
                                "\nGender: " + gender +
                                "\nCourse: " + course
                );
            }
        });
    }
}
