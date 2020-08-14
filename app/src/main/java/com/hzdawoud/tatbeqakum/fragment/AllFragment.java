package com.hzdawoud.tatbeqakum.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.fuzz.indicator.CutoutViewIndicator;
import com.google.android.material.tabs.TabLayout;
import com.hzdawoud.tatbeqakum.BagActivity;
import com.hzdawoud.tatbeqakum.DeliveryActivity;
import com.hzdawoud.tatbeqakum.DeliveryServicesActivity;
import com.hzdawoud.tatbeqakum.ElectronicServiceActivity;
import com.hzdawoud.tatbeqakum.FreeDeliveryActivity;
import com.hzdawoud.tatbeqakum.HomeActivity;
import com.hzdawoud.tatbeqakum.R;
import com.hzdawoud.tatbeqakum.SandwitchActivity;
import com.hzdawoud.tatbeqakum.TrackingMapActivity;
import com.hzdawoud.tatbeqakum.adapter.SliderAdapter;
import com.hzdawoud.tatbeqakum.adapter.ViewPagerAdapter;

public class AllFragment extends Fragment {


    SliderAdapter adapter;

    LinearLayout linear1, linear2, linear3, linear4;
    CardView cardView;

    ViewPager viewPager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_all, container, false);

        viewPager = root.findViewById(R.id.pager);
        adapter = new SliderAdapter(getActivity(),3);
        viewPager.setAdapter(adapter);
        CutoutViewIndicator indicator = root.findViewById(R.id.indicator_details);
        indicator.setViewPager(viewPager);

        linear1 = root.findViewById(R.id.free_delivery);
        linear2 = root.findViewById(R.id.order_car);
        linear3 = root.findViewById(R.id.order_service);
        linear4 = root.findViewById(R.id.services);
        cardView = root.findViewById(R.id.first_card);


        linear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), FreeDeliveryActivity.class));
            }
        });

        linear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), DeliveryServicesActivity.class));
            }
        });

        linear3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), DeliveryActivity.class));
            }
        });

        linear4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ElectronicServiceActivity.class));
            }
        });

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), HomeActivity.class));
            }
        });

        return root;
    }
}