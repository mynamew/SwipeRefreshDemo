package com.timi.swiperefreshdemo;

import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.timi.swiperefreshdemo.base.BaseActivity;
import com.timi.swiperefreshdemo.baseadapter.CommonSimpleTypeAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends BaseActivity implements SwipeRefreshLayout.OnRefreshListener {
    private RecyclerView recyclerView;
    private SwipeRefreshLayout refreshLayout;
    private MainAdapter mainAdapter;
    private List<String> datas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        datas = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            datas.add(i + "");
        }
        refreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);
        refreshLayout.setColorSchemeResources(R.color.colorAccent, R.color.colorPrimary, R.color.colorPrimaryDark);
        refreshLayout.setOnRefreshListener(this);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mainAdapter = new MainAdapter(datas);
        mainAdapter.setOnItemClickListener(R.id.id_text, new CommonSimpleTypeAdapter.ItemClickListener() {
            @Override
            public void onItemClicked(View view, int position) {
                Log.e("点击", "root clicked..." + position);
            }
        });
        mainAdapter.setOnItemClickListener(R.id.icon, new CommonSimpleTypeAdapter.ItemClickListener() {
            @Override
            public void onItemClicked(View view, int position) {
                Log.e("点击", "root clicked..." + position);
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mainAdapter);
    }

    /**
     * 刷新的方法
     */
    @Override
    public void onRefresh() {
        final Random random = new Random();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                datas.add(0, "我是天才" + random.nextInt(100) + "号");
                mainAdapter.notifyDataSetChanged();

                Toast.makeText(MainActivity.this, "刷新了一条数据", Toast.LENGTH_SHORT).show();

                // 加载完数据设置为不刷新状态，将下拉进度收起来
                refreshLayout.setRefreshing(false);
            }
        }, 1200);
        try {
            Thread.sleep(2000);
            refreshLayout.setRefreshing(true);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
