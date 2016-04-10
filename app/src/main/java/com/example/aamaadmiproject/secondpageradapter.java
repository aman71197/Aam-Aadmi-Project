package com.example.aamaadmiproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Aman Agrawal on 10-04-2016.
 */
public class secondpageradapter  extends FragmentPagerAdapter {

    String[] Titles;
    int NumbOfTabs;
    String nametext;

    public secondpageradapter(FragmentManager fm) {
        super(fm);
    }
    public void setVals(String[] mTitles, int mNumbOfTabsumb, String nametext){
        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;
        this.nametext=nametext;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        Bundle bundle=new Bundle();
        switch(position){

            case 0:

                bundle.putString("nametext", nametext);
                fragment = new intro();
                fragment.setArguments(bundle);
                break;
            case 1:

                bundle.putString("nametext", nametext);
                fragment = new eligibility();
                fragment.setArguments(bundle);
                break;
            case 2:

                bundle.putString("nametext", nametext);
                fragment = new documents();
                fragment.setArguments(bundle);
                break;
            case 3:

                bundle.putString("nametext",nametext);
                fragment = new procedure();
                fragment.setArguments(bundle);
                break;
            case 4:

                bundle.putString("nametext", nametext);
                fragment = new apply();
                fragment.setArguments(bundle);
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