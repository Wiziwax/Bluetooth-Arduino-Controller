package com.example.chestnut5;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chestnut5.Fragments.AnalysisFragment;
import com.example.chestnut5.Fragments.ClassifiedFragment;
import com.example.chestnut5.Fragments.SwitchesFragment;


public class PagerAdapter extends FragmentPagerAdapter {

    int tabCount;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabCount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new SwitchesFragment();

            case 1:
                return new AnalysisFragment();

            case 2:
                return new ClassifiedFragment();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
