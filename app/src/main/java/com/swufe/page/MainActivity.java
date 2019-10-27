package com.swufe.page;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager=(ViewPager)findViewById(R.id.viewpager);
        MyPageAdapter myPageAdapter=new MyPageAdapter(getSupportFragmentManager());
        TabLayout layout=(TabLayout) findViewById(R.id.sliding_tabs);
        layout.setupWithViewPager(viewPager);//实现联动
    }
}
