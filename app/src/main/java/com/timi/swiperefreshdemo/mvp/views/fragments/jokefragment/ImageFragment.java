package com.timi.swiperefreshdemo.mvp.views.fragments.jokefragment;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.timi.swiperefreshdemo.R;
import com.timi.swiperefreshdemo.base.BaseFragment;

/**
 * Created by timi on 2017/1/6.
 * to do:  图片的碎片
 */

public class ImageFragment extends BaseFragment {
    //view
    private SwipeRefreshLayout srlImg;
    private RecyclerView recyclerViewImg;

    @Override
    protected int setFragmentLayoutId() {
        return R.layout.fragment_joke_img;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        srlImg = (SwipeRefreshLayout) view.findViewById(R.id.srl_joke_img);
        recyclerViewImg = (RecyclerView) view.findViewById(R.id.recycle_joke_img);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void setOnclickListener(View view) {

    }
}
