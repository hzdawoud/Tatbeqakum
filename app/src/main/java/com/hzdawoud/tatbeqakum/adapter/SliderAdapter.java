package com.hzdawoud.tatbeqakum.adapter;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.hzdawoud.tatbeqakum.MainActivity;
import com.hzdawoud.tatbeqakum.R;

import java.util.ArrayList;
import java.util.List;

public class SliderAdapter extends PagerAdapter {

 
    Activity activity;
    int count;

    public SliderAdapter(Activity activity, int count) {
        this.activity = activity;
        this.count = count;
    }


    @Override
    public int getCount() {
        return count;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }


    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        View view = LayoutInflater.from(container.getContext())
                .inflate(R.layout.item_home_page, container, false);
        container.addView(view);

        ImageView img;
        img = view.findViewById(R.id.img);

        if(count == 3){
            img.setImageResource(R.drawable.img_aklak);
        } else {
            img.setImageResource(R.drawable.img_wp);
        }

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

}
