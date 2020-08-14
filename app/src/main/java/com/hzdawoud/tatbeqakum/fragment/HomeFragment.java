package com.hzdawoud.tatbeqakum.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.fuzz.indicator.CutoutViewIndicator;
import com.google.android.material.tabs.TabLayout;
import com.hzdawoud.tatbeqakum.BagActivity;
import com.hzdawoud.tatbeqakum.ChatActivity;
import com.hzdawoud.tatbeqakum.DeliveryServicesActivity;
import com.hzdawoud.tatbeqakum.MapActivity;
import com.hzdawoud.tatbeqakum.PaymentMethodActivity;
import com.hzdawoud.tatbeqakum.R;
import com.hzdawoud.tatbeqakum.RestaurantActivity;
import com.hzdawoud.tatbeqakum.SandwitchActivity;
import com.hzdawoud.tatbeqakum.TrackingMapActivity;
import com.hzdawoud.tatbeqakum.WaitingActivity;
import com.hzdawoud.tatbeqakum.adapter.SliderAdapter;
import com.hzdawoud.tatbeqakum.adapter.ViewPagerAdapter;

import me.relex.circleindicator.CircleIndicator;

public class HomeFragment extends Fragment {

    SliderAdapter adapter;

    LinearLayout linear1, linear2, linear3;

    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_home, container, false);


        viewPager = (ViewPager) root.findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getActivity(), getFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout = (TabLayout) root.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        return root;
    }
}
