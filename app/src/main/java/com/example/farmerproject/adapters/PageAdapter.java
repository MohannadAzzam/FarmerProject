package com.example.farmerproject.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.farmerproject.fragments.EndedProductFragment;
import com.example.farmerproject.fragments.NewProductFragment;
import com.example.farmerproject.fragments.ProgProductFragment;

public class PageAdapter extends FragmentPagerAdapter {

    private int number;

    public PageAdapter(@NonNull FragmentManager fm, int number) {
        super(fm);
        this.number = number;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new EndedProductFragment();
            case 1:
                return new ProgProductFragment();
            case 2:
                return new NewProductFragment();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
