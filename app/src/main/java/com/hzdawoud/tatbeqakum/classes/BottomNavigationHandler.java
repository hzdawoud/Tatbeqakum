package com.hzdawoud.tatbeqakum.classes;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BottomNavigationHandler {
    public LinearLayout linearLayout;
    public ImageView img;
    public TextView text;
    public int imageSelected;
    public int imageUnselected;
    Activity activity ;

    public BottomNavigationHandler(LinearLayout linearLayout, ImageView img, TextView text, int imageUnselected, int imageSelected, Activity activity) {
        this.linearLayout = linearLayout;
        this.img = img;
        this.text = text;
        this.imageUnselected = imageUnselected;
        this.imageSelected = imageSelected;
        this.activity = activity;
    }

    public void setIsSelected(boolean isSelected){
        if (isSelected){
            img.setImageResource(imageSelected);
            text.setVisibility(View.VISIBLE);
            img.setSelected(true);
        }else {
            img.setImageResource(imageUnselected);
            text.setVisibility(View.GONE);
            img.setSelected(false);
        }

    }
}
