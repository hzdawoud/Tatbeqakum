package com.hzdawoud.tatbeqakum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hzdawoud.tatbeqakum.fragment.HomeFragment;
import com.hzdawoud.tatbeqakum.fragment.OrdersFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new OrdersFragment()).commit();
    }
}
