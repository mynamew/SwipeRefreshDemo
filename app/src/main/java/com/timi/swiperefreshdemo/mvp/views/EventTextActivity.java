package com.timi.swiperefreshdemo.mvp.views;


import android.os.Bundle;

import com.timi.swiperefreshdemo.R;
import com.timi.swiperefreshdemo.base.BaseEventActivity;
import com.timi.swiperefreshdemo.message.MessageEvent;

public class EventTextActivity extends BaseEventActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_text);
    }

    @Override
    public void setOnEventMainThreadCallBack(MessageEvent event) {

    }

}
