package com.example.admin.netdatalist.base;

import android.app.Application;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.example.admin.netdatalist.utils.EventBusUtil;
import com.trello.rxlifecycle.components.support.RxAppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by admin on 2017/7/5.
 */

public abstract class BaseActivity extends RxAppCompatActivity {
    protected BaseApplication application;
    private boolean isResume;

    private Unbinder unbinder;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(getLayoutId());

        application = (BaseApplication) getApplication();
        unbinder = ButterKnife.bind(this);
        if (useEventBus()) {
            EventBusUtil.register(this);
        }
    }

    protected abstract void onViewCreated(@Nullable Bundle saveInstanceState);

    @Override
    protected void onResume() {
        super.onResume();
        isResume = true;
    }

    @Override
    protected void onPause() {
        super.onPause();
        isResume = false;
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    protected abstract int getLayoutId();

    protected boolean useEventBus() {
        return false;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
        if (useEventBus()) {
            EventBusUtil.unregister(this);
        }
    }
}
