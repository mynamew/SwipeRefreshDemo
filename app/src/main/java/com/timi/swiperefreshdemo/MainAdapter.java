package com.timi.swiperefreshdemo;

import android.widget.TextView;

import com.timi.swiperefreshdemo.baseadapter.CommonSimpleTypeAdapter;
import com.timi.swiperefreshdemo.baseadapter.CommonViewHolder;

import java.util.List;

/**
 * Created by Huanbei_dev4 on 2016/12/19.
 */
public class MainAdapter extends CommonSimpleTypeAdapter<String> {
    public MainAdapter(List<String> dataList) {
        super(dataList);
    }

    @Override
    public int getLayoutId(int viewType) {
        return R.layout.item_view_main1;
    }

    @Override
    public void convert(CommonViewHolder holder, String s, int position) {
        TextView textView = (TextView) holder.getView(R.id.id_text);
        textView.setText(s);
    }
}
