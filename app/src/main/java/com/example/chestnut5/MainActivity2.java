package com.example.chestnut5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity2 extends AppCompatActivity {


    TabLayout tabLayout;
    TabItem mSwitchSlide, mAnalysisSlide, mClassified;
    PagerAdapter pagerAdapter;
    Toolbar mToolbar;
    private Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().hide();



        final Button buttonConnect = findViewById(R.id.buttonConnect);

        buttonConnect.setEnabled(true);
        mSwitchSlide = findViewById(R.id.switchSlide);
        mAnalysisSlide = findViewById(R.id.analysisSlide);
        mClassified = findViewById(R.id.classifiedSlide);

        ViewPager viewPager1 = findViewById(R.id.fragmentContainer);
        tabLayout = findViewById(R.id.include);

        pagerAdapter = new PagerAdapter(getSupportFragmentManager(), 3);
        viewPager1.setAdapter(pagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager1.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0 || tab.getPosition() == 1 || tab.getPosition() == 2) {
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager1.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


        // Select Bluetooth Device
        buttonConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Move to adapter list

                Intent intent = new Intent(MainActivity2.this, SelectDeviceActivity.class);
                startActivity(intent);


            }
        });


    }
}