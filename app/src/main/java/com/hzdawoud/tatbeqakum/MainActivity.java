package com.hzdawoud.tatbeqakum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hzdawoud.tatbeqakum.classes.BottomNavigationHandler;
import com.hzdawoud.tatbeqakum.fragment.CategoriesFragment;
import com.hzdawoud.tatbeqakum.fragment.ChatFragment;
import com.hzdawoud.tatbeqakum.fragment.HomeFragment;
import com.hzdawoud.tatbeqakum.fragment.OrdersFragment;
import com.hzdawoud.tatbeqakum.fragment.ProfileFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearLayout location;
    ImageView cart;

    LinearLayout home, check, window, message, profile;
    ImageView imgHome, imgCheck, imgWindow, imgMessage, imgProfile;
    TextView txtHome, txtCheck, txtWindow, txtMessage, txtProfile;
    Fragment fragmentHome, fragmentCheck, fragmentWindow, fragmentMessage, fragmentProfile;

    int position = 1;
    int hacker = 1;

    ArrayList<BottomNavigationHandler> listMenu = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        location = findViewById(R.id.start_location);
        cart = findViewById(R.id.toolbar_cart);

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MapActivity.class));
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BagActivity.class));
            }
        });

        fragmentHome = new HomeFragment();
        fragmentCheck = new OrdersFragment();
        fragmentWindow = new CategoriesFragment();
        fragmentMessage = new ChatFragment();
        fragmentProfile = new ProfileFragment();

        home = findViewById(R.id.click_home);
        check = findViewById(R.id.click_check);
        window = findViewById(R.id.click_window);
        message = findViewById(R.id.click_message);
        profile = findViewById(R.id.click_profile);

        imgHome = findViewById(R.id.img_home);
        imgCheck = findViewById(R.id.img_check);
        imgWindow = findViewById(R.id.img_window);
        imgMessage = findViewById(R.id.img_message);
        imgProfile = findViewById(R.id.img_profile);

        txtHome = findViewById(R.id.txt_home);
        txtCheck = findViewById(R.id.txt_check);
        txtWindow = findViewById(R.id.txt_window);
        txtMessage = findViewById(R.id.txt_message);
        txtProfile = findViewById(R.id.txt_profile);


        listMenu.add(new BottomNavigationHandler(home, imgHome, txtHome, R.drawable.logo_main, R.drawable.logo_main, this));
        listMenu.add(new BottomNavigationHandler(check, imgCheck, txtCheck, R.drawable.ic_nav_check, R.drawable.ic_selected_check, this));
        listMenu.add(new BottomNavigationHandler(window, imgWindow, txtWindow, R.drawable.ic_nav_window,R.drawable.ic_selected_window, this));
        listMenu.add(new BottomNavigationHandler(message, imgMessage, txtMessage, R.drawable.ic_nav_message, R.drawable.ic_selected_message,this));
        listMenu.add(new BottomNavigationHandler(profile, imgProfile, txtProfile,  R.drawable.ic_nav_profile, R.drawable.ic_selected_profile,this));


        home.setSelected(true);

        handelBottomNavigation();

        this.getSupportFragmentManager().beginTransaction()
                .add(R.id.frame, fragmentHome,"fragmentHome")
                .add(R.id.frame, fragmentCheck,"fragmentCheck")
                .add(R.id.frame, fragmentWindow,"fragmentWindow" )
                .add(R.id.frame, fragmentMessage,"fragmentMessage" )
                .add(R.id.frame, fragmentProfile,"fragmentProfile" )
                .commit();

        handleSelect(0);
    }

    public void handelBottomNavigation(){
        for (int i = 0; i < listMenu.size() ; i++) {
            final int finalI = i;
            listMenu.get(i).linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    handleSelect(finalI);
                }
            });
        }
    }

    public void handleSelect(int index){
        hacker = index;

        for (int i = 0; i <listMenu.size() ; i++) {
            if (index == i){
                listMenu.get(i).setIsSelected(true);
            }else {
                listMenu.get(i).setIsSelected(false);
            }
        }


        switch (index){
            case 0:
                if (position!=index){
                    this.getSupportFragmentManager().beginTransaction()
                            .hide(fragmentProfile)
                            .hide(fragmentCheck)
                            .hide(fragmentWindow)
                            .hide(fragmentMessage)
                            .show(fragmentHome).commit();
                }

                break;
            case 1:
                if (position!=index){
                    this.getSupportFragmentManager().beginTransaction()
                            .hide(fragmentProfile)
                            .hide(fragmentHome)
                            .hide(fragmentWindow)
                            .hide(fragmentMessage)
                            .show(fragmentCheck).commit();
                }

                break;
            case 2:
                if (position!=index){
                    this.getSupportFragmentManager().beginTransaction()
                            .hide(fragmentProfile)
                            .hide(fragmentHome)
                            .hide(fragmentMessage)
                            .hide(fragmentCheck)
                            .show(fragmentWindow).commit();
                }
                break;
            case 3:
                if (position!=index){
                    this.getSupportFragmentManager().beginTransaction()
                            .hide(fragmentProfile)
                            .hide(fragmentHome)
                            .hide(fragmentWindow)
                            .hide(fragmentCheck)
                            .show(fragmentMessage).commit();
                }
                break;
            case 4:
                if (position!=index){
                    this.getSupportFragmentManager().beginTransaction()
                            .hide(fragmentCheck)
                            .hide(fragmentHome)
                            .hide(fragmentMessage)
                            .hide(fragmentWindow)
                            .show(fragmentProfile).commit();
                }
                break;
        }
        position = index ;
    }
}
