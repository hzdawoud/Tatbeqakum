package com.hzdawoud.tatbeqakum.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hzdawoud.tatbeqakum.R;
import com.hzdawoud.tatbeqakum.adapter.SliderAdapter;

import me.relex.circleindicator.CircleIndicator;

public class HomeFragment extends Fragment {

    ViewPager viewPager;
    SliderAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_home, container, false);

        viewPager = root.findViewById(R.id.pager);
        adapter = new SliderAdapter(getActivity());
        viewPager.setAdapter(adapter);
        CircleIndicator indicator = root.findViewById(R.id.indicator_details);
        indicator.setViewPager(viewPager);

        return root;
    }
}
