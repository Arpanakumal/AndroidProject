package com.example.assignment;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ListViewActivity extends AppCompatActivity {

    ListView lvStudents;
    String[] students = {"Arpana", "Sonu", "Shaily", "Amylee","Alice", "Bob", "Charlie", "David", "Eva", "Frank"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        lvStudents = findViewById(R.id.lvStudents);

        // Create adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, students);
        lvStudents.setAdapter(adapter);

        // Click listener
        lvStudents.setOnItemClickListener((parent, view, position, id) -> {
            String selected = students[position];
            Toast.makeText(ListViewActivity.this,
                    "Selected: " + selected, Toast.LENGTH_SHORT).show();
        });
    }
}
