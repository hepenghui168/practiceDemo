package com.example.admin.netdatalist.base.di;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.admin.netdatalist.base.BaseActivity;
import com.example.admin.netdatalist.base.BasePresenter;

import javax.inject.Inject;

/**
 * Created by admin on 2017/7/6.
 */

public abstract class BaseMVPActivity<P extends BasePresenter> extends BaseActivity{

    @Inject
    protected P mPresenter;

    @Override
    protected void onViewCreated(@Nullable Bundle saveInstanceState) {
        injectComponent();
    }

    protected abstract void injectComponent();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.onDestroy();
            mPresenter = null;
        }
    }
}
