package com.timi.swiperefreshdemo.mvp.views.fragments.homefragments;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.timi.swiperefreshdemo.R;
import com.timi.swiperefreshdemo.api.gankapi.AllGankInterface;
import com.timi.swiperefreshdemo.base.BaseFragment;
import com.timi.swiperefreshdemo.mvp.module.homemodels.GankAllResult;
import com.timi.swiperefreshdemo.mvp.views.adapter.AllGankAdapter;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.fastjson.FastJsonConverterFactory;

/**
 * Created by timi on 2017/1/4.
 * to do: 全部的干货
 */
public class AllFragment extends BaseFragment {
    //base url
    private String baseUrl = "http://gank.io/api/data/";
    //view
    private SwipeRefreshLayout srlHomeAll;
    private RecyclerView recyclerViewHomeAll;
    //data
    private int pageSize = 10;
    private int pageIndex = 1;
    //list
    private ArrayList<GankAllResult.ResultsBean> allGanks;
    //adapter
    private AllGankAdapter adapter;

    @Override
    protected int setFragmentLayoutId() {
        return R.layout.fragment_hot;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        srlHomeAll = (SwipeRefreshLayout) view.findViewById(R.id.srl_home_all);
        recyclerViewHomeAll = (RecyclerView) view.findViewById(R.id.recycle_home_all);
    }

    @Override
    protected void initData() {
        allGanks = new ArrayList<>();
        adapter = new AllGankAdapter(allGanks);
        recyclerViewHomeAll.setLayoutManager(new GridLayoutManager(getActivity(),2));
        recyclerViewHomeAll.setAdapter(adapter);


        Retrofit retrofit = new Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(FastJsonConverterFactory.create()).build();
        AllGankInterface allGankInterface = retrofit.create(AllGankInterface.class);
        Call<GankAllResult> allGank = allGankInterface.getAllGank(pageSize + "", pageIndex + "");
        allGank.enqueue(new Callback<GankAllResult>() {
            @Override
            public void onResponse(Call<GankAllResult> call, Response<GankAllResult> response) {
                if (!response.body().getResults().isEmpty() && response.body().getResults().size() > 0) {
                    allGanks.addAll(response.body().getResults());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<GankAllResult> call, Throwable t) {

            }
        });
    }

    @Override
    protected void setOnclickListener(View view) {

    }

    public interface AllFragmentResponese {

    }
}
