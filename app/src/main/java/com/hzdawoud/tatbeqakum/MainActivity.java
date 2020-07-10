package com.hzdawoud.tatbeqakum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.hzdawoud.tatbeqakum.fragment.CategoriesFragment;
import com.hzdawoud.tatbeqakum.fragment.HomeFragment;
import com.hzdawoud.tatbeqakum.fragment.OrdersFragment;
import com.hzdawoud.tatbeqakum.fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    LinearLayout home, check, window, message, profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        home = findViewById(R.id.nav_home);
        check = findViewById(R.id.nav_check);
        window = findViewById(R.id.nav_window);
        message = findViewById(R.id.nav_message);
        profile = findViewById(R.id.nav_profile);

        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new HomeFragment()).commit();


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, new HomeFragment()).commit();

            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, new OrdersFragment()).commit();
            }
        });

        window.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, new CategoriesFragment()).commit();

            }
        });

        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                getSupportFragmentManager().beginTransaction().replace(R.id.frame, new ProfileFragment()).commit();
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, new ProfileFragment()).commit();
            }
        });
    }
}
