package com.example.misael.pushtest;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setUpViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setUpViewPager(ViewPager viewPager){
        ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager());
        OneFragment fragment = new OneFragment();
        fragment.setContent("ONE");
        adapter.addFragment(fragment, "ONE");
        OneFragment fragment1 = new OneFragment();
        fragment1.setContent("TWO");
        adapter.addFragment(fragment1, "TWO");
        OneFragment fragment2 = new OneFragment();
        fragment2.setContent("THREE");
        adapter.addFragment(fragment2, "THREE");
        viewPager.setAdapter(adapter);
    }
}
