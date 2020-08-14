package com.hzdawoud.tatbeqakum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.fuzz.indicator.CutoutViewIndicator;
import com.hzdawoud.tatbeqakum.adapter.SliderAdapter;

public class PaymentMethodActivity extends AppCompatActivity {

    ViewPager viewPager;
    SliderAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method);

        viewPager = findViewById(R.id.pager);
        adapter = new SliderAdapter(this,2);
        viewPager.setAdapter(adapter);
        CutoutViewIndicator indicator = findViewById(R.id.indicator_details);
        indicator.setViewPager(viewPager);
    }
}