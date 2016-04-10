package com.example.aamaadmiproject;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.astuetz.PagerSlidingTabStrip;

public class data2 extends AppCompatActivity {

    private ViewPager pager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data2);

        Intent i2= getIntent();
        Bundle namedata=i2.getExtras();
        if(namedata==null)
        {
            return;
        }
        String namerec=namedata.getString("na");
        setTitle(namerec);

        pager2 = (ViewPager) findViewById(R.id.pager2);
        secondpageradapter pagerAdapter2 = new secondpageradapter(getSupportFragmentManager());
        //String [] titles = {"Map","Past Issues","New Issue"};
        String [] titles = {"Intro","Eligibility","Documents Required","Procedure","Apply"};
        pagerAdapter2.setVals(titles, titles.length,namerec);
        pager2.setAdapter(pagerAdapter2);
        pager2.setOffscreenPageLimit(titles.length - 1);

        //PagerTitleStrip tabs= (PagerTitleStrip) findViewById(R.id.pager_title_strip);
        PagerSlidingTabStrip tabs2= (PagerSlidingTabStrip) findViewById(R.id.tabs2);
        tabs2.setViewPager(pager2);

        tabs2.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });







    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_data2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
