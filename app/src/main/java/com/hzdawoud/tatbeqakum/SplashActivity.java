package com.hzdawoud.tatbeqakum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.hzdawoud.tatbeqakum.auth.SignUpActivity;
import com.hzdawoud.tatbeqakum.fragment.HomeFragment;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, SignUpActivity.class));
                finish();
            }
        },3000);
    }
}
