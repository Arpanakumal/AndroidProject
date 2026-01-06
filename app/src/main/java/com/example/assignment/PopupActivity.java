package com.example.assignment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class PopupActivity extends AppCompatActivity {

    Button btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);

        btnMenu = findViewById(R.id.btnMenu);

        btnMenu.setOnClickListener(v -> {
            PopupMenu popupMenu = new PopupMenu(PopupActivity.this, btnMenu);
            popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

            popupMenu.setOnMenuItemClickListener(item -> {
                Fragment fragment = null;
                int itemId = item.getItemId();
                if (itemId == R.id.menu_first) {
                    fragment = new FirstFragment();
                } else if (itemId == R.id.menu_second) {
                    fragment = new SecondFragment();
                }

                if (fragment != null) {
                    loadFragment(fragment);
                }
                return true;
            });

            popupMenu.show();
        });
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragmentContainer, fragment);
        ft.commit();
    }
}
