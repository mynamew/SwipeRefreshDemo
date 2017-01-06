package com.timi.swiperefreshdemo;


import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;

import com.timi.bottomnavigationview.BottomNavigationItem;
import com.timi.bottomnavigationview.BottomNavigationView;
import com.timi.bottomnavigationview.OnBottomNavigationItemClickListener;
import com.timi.swiperefreshdemo.api.doubanapi.DouBanMovieInterface;
import com.timi.swiperefreshdemo.base.BaseActivity;
import com.timi.swiperefreshdemo.mvp.module.BookSearchResponse;
import com.timi.swiperefreshdemo.mvp.views.fragments.DouBanFragments;
import com.timi.swiperefreshdemo.mvp.views.fragments.HomeFragment;
import com.timi.swiperefreshdemo.mvp.views.fragments.JokeFragment;
import com.timi.swiperefreshdemo.mvp.views.fragments.homefragments.UIFragment;
import com.timi.swiperefreshdemo.uils.statusutils.StatusBarUtil;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.fastjson.FastJsonConverterFactory;

public class MainActivity extends BaseActivity {
    //view
    private BottomNavigationView bottomNavigationView;
    //data
    //array
    int[] image = {R.drawable.ic_home, R.drawable.ic_movies,
            R.drawable.ic_joke_channel, R.drawable.ic_user};
    //list
    private Fragment mHomeFragments[] = new Fragment[4];
    //color
    int[] colors = {Color.parseColor("#cd5c5c"), Color.parseColor("#8fbc8f"), Color.parseColor("#a0522d"), Color.parseColor("#7b68ee")};
    // http
//    private Retrofit retrofit;
//    private DouBanMovieInterface douBanMovieInterface;

    @Override
    public int setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initBundle() {

    }

    @Override
    public void initView() {
        //初始化bottomnavigation相关
        int[] color = {getResources().getColor(R.color.indianred), getResources().getColor(R.color.darkseagreen),
                getResources().getColor(R.color.sienna), getResources().getColor(R.color.mediumslateblue)};
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.home_bottomNavigation);
        if (bottomNavigationView != null) {
            bottomNavigationView.isWithText(false);
            // bottomNavigationView.activateTabletMode();
            bottomNavigationView.isColoredBackground(true);
            bottomNavigationView.setTextActiveSize(getResources().getDimension(R.dimen.text_active));
            bottomNavigationView.setTextInactiveSize(getResources().getDimension(R.dimen.text_inactive));
            bottomNavigationView.setItemActiveColorWithoutColoredBackground(getResources().getColor(R.color.indianred));
        }

        BottomNavigationItem bottomNavigationItem = new BottomNavigationItem
                ("主页", color[0], image[0]);
        BottomNavigationItem bottomNavigationItem1 = new BottomNavigationItem
                ("影片", color[1], image[1]);
        BottomNavigationItem bottomNavigationItem2 = new BottomNavigationItem
                ("有趣", color[2], image[2]);
        BottomNavigationItem bottomNavigationItem3 = new BottomNavigationItem
                ("我的", color[3], image[3]);


        bottomNavigationView.addTab(bottomNavigationItem);
        bottomNavigationView.addTab(bottomNavigationItem1);
        bottomNavigationView.addTab(bottomNavigationItem2);
        bottomNavigationView.addTab(bottomNavigationItem3);

        bottomNavigationView.setOnBottomNavigationItemClickListener(new OnBottomNavigationItemClickListener() {
            @Override
            public void onNavigationItemClick(int index) {
                fragmentManager(index);
            }
        });
    }

    @Override
    public void initData() {
        //加入主页的碎片
        fragmentManager(0);
        //豆瓣的网络请求
//        retrofit = new Retrofit.Builder()
//                .baseUrl("https://api.douban.com/v2/")
//                .addConverterFactory(FastJsonConverterFactory.create())
//                .build();
//        douBanMovieInterface = retrofit.create(DouBanMovieInterface.class);
//        Call<BookSearchResponse> call = douBanMovieInterface.getSearchBooks("小王子", "", 0, 3);
//        //异步请求
//        call.enqueue(new Callback<BookSearchResponse>() {
//            @Override
//            public void onResponse(Call<BookSearchResponse> call, Response<BookSearchResponse> response) {
//
//                Log.e("resutl---->",response.body().getBooks().toString());
//            }
//
//            @Override
//            public void onFailure(Call<BookSearchResponse> call, Throwable t) {
//
//            }
//        });
    }

    /**
     * 对fragment  进行操作
     */
    private void fragmentManager(int position) {
        FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
        //隐藏不显示的fragment
        for (int i = 0; i < mHomeFragments.length; i++) {
            if (null != mHomeFragments[i]) {
                trans.hide(mHomeFragments[i]);
            }
        }
        //设置状态栏
        StatusBarUtil.setColor(this, colors[position]);
        //显示或者添加fragment
        switch (position) {
            case 0:
                if (null == mHomeFragments[position]) {
                    mHomeFragments[position] = new HomeFragment();
                    trans.add(R.id.fl_main, mHomeFragments[position]);
                } else {
                    trans.show(mHomeFragments[position]);
                }
                break;
            case 1:
                if (null == mHomeFragments[position]) {
                    mHomeFragments[position] = new DouBanFragments();
                    trans.add(R.id.fl_main, mHomeFragments[position]);
                } else {
                    trans.show(mHomeFragments[position]);
                }
                break;
            case 2:
                if (null == mHomeFragments[position]) {
                    mHomeFragments[position] = new JokeFragment();
                    trans.add(R.id.fl_main, mHomeFragments[position]);
                } else {
                    trans.show(mHomeFragments[position]);
                }
                break;
            case 3:
                if (null == mHomeFragments[position]) {
                    mHomeFragments[position] = new UIFragment();
                    trans.add(R.id.fl_main, mHomeFragments[position]);
                } else {
                    trans.show(mHomeFragments[position]);
                }
                break;
        }
        trans.commit();
    }

}
