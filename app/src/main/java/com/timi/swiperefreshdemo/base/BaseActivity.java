package com.timi.swiperefreshdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.zhy.autolayout.AutoLayoutActivity;

/**
 * 基类
 * Created by timi on 2016/12/30.
 */
public  abstract class BaseActivity extends AutoLayoutActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayoutId());
        initView();
    }
    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    /**
     * 设置布局layoutid
     * @return
     */
    public abstract int setLayoutId();

    /**
     * 初始化view
     */
    public abstract void initView();
}
