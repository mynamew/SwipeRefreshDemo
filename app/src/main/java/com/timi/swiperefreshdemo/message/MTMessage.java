package com.timi.swiperefreshdemo.message;


import org.greenrobot.eventbus.EventBus;

/**
 * Created by timi on 2016/12/30.
 * 用于注册，反注册等
 */
public class MTMessage {

    static public void register(Object src) {
        EventBus.getDefault().register(src);
    }

    static public void unregister(Object src) {
        EventBus.getDefault().unregister(src);
    }

    static public void isRegister(Object src) {
        EventBus.getDefault().isRegistered(src);
    }

    static public void post(MessageEvent msg) {
        EventBus.getDefault().post(msg);
    }

    static public void postSticky(MessageEvent msg) {
        EventBus.getDefault().postSticky(msg);
    }

}
