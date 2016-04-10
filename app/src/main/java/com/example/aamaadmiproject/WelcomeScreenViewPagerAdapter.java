package com.example.aamaadmiproject;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by Aman Agrawal on 10-04-2016.
 */
public class WelcomeScreenViewPagerAdapter extends FragmentPagerAdapter {

    String[] Titles;
    int NumbOfTabs;

    public WelcomeScreenViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    public void setVals(String[] mTitles, int mNumbOfTabsumb){
        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch(position){

            case 0:
                fragment = new forms();
                break;
            case 1:
                fragment = new exams();
                break;
            case 2:
                fragment= new schemes();
                break;
        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    @Override
    public int getCount() {
        return NumbOfTabs;
    }
}
