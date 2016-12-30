package com.timi.swiperefreshdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.timi.swiperefreshdemo.message.MessageEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;


/**
 * 事件总线的基类
 * Created by timi  on 2016/12/30.
 */
public abstract class BaseEventActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    /**
     * 设置订阅的事件的回调
     *
     * @param event
     */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(MessageEvent event) {
        if (event != null && event instanceof MessageEvent) {
            setOnEventMainThreadCallBack(event);
        }
    }

    /**
     * 子类回调订阅的事件
     *
     * @param event
     */
    public abstract void setOnEventMainThreadCallBack(MessageEvent event);

}
