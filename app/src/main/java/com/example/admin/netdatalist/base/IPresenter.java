package com.example.admin.netdatalist.base;

/**
 * Created by admin on 2017/7/6.
 */

public interface IPresenter {
    String TAG = IPresenter.class.getSimpleName();

    void subscribe();

    void unSubScribe();

    void onDestroy();
}
