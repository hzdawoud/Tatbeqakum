package com.hzdawoud.tatbeqakum.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.hzdawoud.tatbeqakum.BagActivity;
import com.hzdawoud.tatbeqakum.R;
import com.hzdawoud.tatbeqakum.RestaurantActivity;
import com.hzdawoud.tatbeqakum.SandwitchActivity;
import com.hzdawoud.tatbeqakum.adapter.SliderAdapter;

import me.relex.circleindicator.CircleIndicator;

public class HomeFragment extends Fragment {

    ViewPager viewPager;
    SliderAdapter adapter;

    LinearLayout linear1, linear2, linear3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_home, container, false);

        viewPager = root.findViewById(R.id.pager);
        adapter = new SliderAdapter(getActivity());
        viewPager.setAdapter(adapter);
        CircleIndicator indicator = root.findViewById(R.id.indicator_details);
        indicator.setViewPager(viewPager);

        linear1 = root.findViewById(R.id.free_delivery);
        linear2 = root.findViewById(R.id.order_car);
        linear3 = root.findViewById(R.id.order_service);


        linear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), RestaurantActivity.class));
            }
        });

        linear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), SandwitchActivity.class));
            }
        });

        linear3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), BagActivity.class));
            }
        });

        return root;
    }
}
