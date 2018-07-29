package com.example.daisy.javaobserve;
 ;
 import android.app.Activity;
 import android.os.Bundle;
 import android.os.Handler;
 import android.support.design.widget.TabLayout;
 import android.support.v4.app.Fragment;
 import android.support.v4.app.FragmentPagerAdapter;
 import android.support.v4.view.ViewPager;
 import android.support.v7.app.AppCompatActivity;
 import butterknife.BindView;
 import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity  {

    @BindView(R.id.tabLayout)
    TabLayout tabLayout;

    @BindView(R.id.vp_view)
    ViewPager viewPager;

    @BindView(R.id.toolbar)
    android.support.v7.widget.Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        setContentView(R.layout.activity_main);
        setSupportActionBar(toolbar);
        toolbar.setTitle("title");


        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                return new SimpleFragment();
            }

            @Override
            public int getCount() {
                return 2;
            }
            @Override
            public CharSequence getPageTitle(int position) {
                return  "i'm "+(position);
            }
        });
        tabLayout.setupWithViewPager(viewPager);

        listener.protect();
    }
    MainActivityListener listener;
    public void setMainActivityListener(MainActivityListener listener) {
       this.listener = listener;
   }

    public void changeMode() {
        System.out.println("工厂模式");
    }
}
