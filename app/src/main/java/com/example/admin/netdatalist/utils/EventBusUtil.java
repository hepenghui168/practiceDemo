package com.example.admin.netdatalist.utils;

import org.simple.eventbus.EventBus;

/**
 * Created by admin on 2017/7/6.
 */

public class EventBusUtil {
    private static EventBus eventBus = EventBus.getDefault();

    public static void register(Object subscriber) {
        eventBus.register(subscriber);
    }

    public static void unregister(Object subscriber) {
        eventBus.unregister(subscriber);
    }

    public static void post(Object target, String tag) {
        eventBus.post(target, tag);
    }

    public static void postSticky(Object target, String tag) {
        eventBus.postSticky(target, tag);
    }

    public static void removeSticky(Class<?> eventClass, String tag) {
        eventBus.removeStickyEvent(eventClass, tag);
    }
}
