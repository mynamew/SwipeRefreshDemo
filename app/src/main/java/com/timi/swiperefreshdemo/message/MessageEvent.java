package com.timi.swiperefreshdemo.message;

/**
 * Created by timi on 2016/12/30.
 * to do:  EventBus的事件基类
 */
public class MessageEvent {
    public final String message;

    public MessageEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
