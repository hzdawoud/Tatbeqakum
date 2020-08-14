package com.hzdawoud.tatbeqakum.adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.hzdawoud.tatbeqakum.fragment.AllFragment;
import com.hzdawoud.tatbeqakum.fragment.ResturentFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public ViewPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // This determines the fragment for each tab
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AllFragment();
        } else if (position == 1){
            return new ResturentFragment();
        } else {
            return new ResturentFragment();
        }
    }

    // This determines the number of tabs
    @Override
    public int getCount() {
        return 6;
    }

    // This determines the title for each tab
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return "الكل";
            case 1:
                return "مطاعم";
            case 2:
                return "متاجر";
            case 3:
                return "ملابس";
            case 4:
                return "هدايا";
            case 5:
                return "أجهزة كهربائية";
            default:
                return null;
        }
    }

}
