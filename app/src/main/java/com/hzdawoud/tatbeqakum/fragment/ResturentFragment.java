package com.hzdawoud.tatbeqakum.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hzdawoud.tatbeqakum.R;
import com.hzdawoud.tatbeqakum.RestaurantActivity;
import com.hzdawoud.tatbeqakum.SandwitchActivity;


public class ResturentFragment extends Fragment {

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_resturent, container, false);

        view = root.findViewById(R.id.first_view);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), SandwitchActivity.class));
            }
        });
        return root;
    }
}