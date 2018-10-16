package com.example.android.miwok;
import android.support.v4.app.FragmentPagerAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
     * Provides the appropriate {@link Fragment} for a view pager.
     */
class fragmentpageradapter extends FragmentPagerAdapter {


        public fragmentpageradapter(FragmentManager fm) {
            super(fm);
        }



        public Fragment getItem(int position) {
            if (position == 0) {
                return new NumbersFragment();
            } else if(position == 1){
                return new FamilyFragment();
            } else if (position == 2) {
                return new ColorsFragment();
            } else
                return new PhrasesFragment();
            }


        @Override
        public int getCount() {
            return 5;
        }
    }



