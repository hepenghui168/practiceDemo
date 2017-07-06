package com.example.admin.netdatalist.base;

import rx.subscriptions.CompositeSubscription;

/**
 * Created by admin on 2017/7/6.
 */

public class BasePresenter<V extends IView, M extends IInteractor> implements IPresenter {

    protected V mView;
    protected M mInterctor;
    protected CompositeSubscription subscriptions = new CompositeSubscription();

    public BasePresenter(V view, M interactor) {
        mView = view;
        mInterctor = interactor;
    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unSubScribe() {
        subscriptions.unsubscribe();;

    }

    @Override
    public void onDestroy() {
        unSubScribe();
        mView = null;
        if (mInterctor != null) {
            mInterctor.onDestroy();
            mInterctor = null;
        }
    }
}
