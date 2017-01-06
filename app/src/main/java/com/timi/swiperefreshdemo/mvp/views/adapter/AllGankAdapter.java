package com.timi.swiperefreshdemo.mvp.views.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.timi.swiperefreshdemo.R;
import com.timi.swiperefreshdemo.baseadapter.CommonSimpleTypeAdapter;
import com.timi.swiperefreshdemo.baseadapter.CommonViewHolder;
import com.timi.swiperefreshdemo.mvp.module.homemodels.GankAllResult;
import com.timi.swiperefreshdemo.uils.StringUtils;

import java.util.List;

/**
 * Created by timi on 2017/1/6.
 * to do:  全部干货的Adapter
 */

public class AllGankAdapter extends CommonSimpleTypeAdapter<GankAllResult.ResultsBean> {
    public AllGankAdapter(List<GankAllResult.ResultsBean> dataList) {
        super(dataList);
    }

    @Override
    public int getLayoutId(int viewType) {
        return R.layout.item_all_gank;
    }

    @Override
    public void convert(CommonViewHolder holder, GankAllResult.ResultsBean resultsBean, int position) {
        TextView tvAllTitle = (TextView) holder.getView(R.id.tv_all_title);
        TextView tvAllTime=(TextView) holder.getView(R.id.tv_all_time);
        TextView tvAuthor=(TextView) holder.getView(R.id.tv_all_user);
        tvAllTitle.setText(resultsBean.getDesc());
        tvAllTime.setText(StringUtils.changeTimeStr2Day(resultsBean.getPublishedAt()));
        tvAuthor.setText(null==resultsBean.getWho()?"未知":resultsBean.getWho());
    }
}
