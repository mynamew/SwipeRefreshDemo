package com.timi.swiperefreshdemo.mvp.views.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.flyco.tablayout.SlidingTabLayout;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.timi.swiperefreshdemo.R;
import com.timi.swiperefreshdemo.base.BaseFragment;
import com.timi.swiperefreshdemo.mvp.views.adapter.HomeViewPagerAdapter;
import com.timi.swiperefreshdemo.mvp.views.fragments.homefragments.AllFragment;
import com.timi.swiperefreshdemo.mvp.views.fragments.homefragments.AndroidFragment;
import com.timi.swiperefreshdemo.mvp.views.fragments.homefragments.IosFragment;
import com.timi.swiperefreshdemo.mvp.views.fragments.homefragments.UIFragment;
import com.timi.swiperefreshdemo.mvp.views.fragments.homefragments.WelFareFragment;
import com.timi.swiperefreshdemo.uils.ViewFindUtils;

import java.util.ArrayList;

/**
 * Created by timi on 2017/1/4.
 * to do: 主页的碎片
 */
public class HomeFragment extends BaseFragment implements OnTabSelectListener, View.OnClickListener {
    //view
    private ViewPager homeViewPager;
    private SlidingTabLayout homeSlidingTabLayout;
    //list
    private ArrayList<Fragment> mFragments;
    // array
    private String[] mTitles = {"全部", "Android", "Ios", "UI", "福利"};

    @Override
    protected int setFragmentLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        homeViewPager = (ViewPager) view.findViewById(R.id.viewpager_home);
        View decorView = getActivity().getWindow().getDecorView();
        homeSlidingTabLayout = ViewFindUtils.find(decorView, R.id.slidinglayout_home);
    }

    @Override
    protected void initData() {
        //init fragment
        mFragments = new ArrayList<>();
        mFragments.add(new AllFragment());
        mFragments.add(new AndroidFragment());
        mFragments.add(new IosFragment());
        mFragments.add(new WelFareFragment());
        mFragments.add(new UIFragment());

        homeViewPager.setAdapter(new HomeViewPagerAdapter(getActivity().getSupportFragmentManager(), mFragments));
        homeSlidingTabLayout.setViewPager(homeViewPager, mTitles);

    }

    @Override
    protected void setOnclickListener(View view) {
        homeSlidingTabLayout.setOnTabSelectListener(this);
        view.findViewById(R.id.iv_home_menu).setOnClickListener(this);
        view.findViewById(R.id.iv_home_search).setOnClickListener(this);
    }

    @Override
    public void onTabSelect(int position) {

    }

    @Override
    public void onTabReselect(int position) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_home_menu:
                break;
            case R.id.iv_home_search:
                break;
        }
    }
}
