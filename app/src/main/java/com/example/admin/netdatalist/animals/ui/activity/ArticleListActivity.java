package com.example.admin.netdatalist.animals.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.admin.netdatalist.R;
import com.example.admin.netdatalist.animals.contract.ArticleListContract;
import com.example.admin.netdatalist.animals.model.model.ArticleListBean;
import com.example.admin.netdatalist.animals.presenter.ArticleListPresenter;
import com.example.admin.netdatalist.base.di.BaseMVPActivity;

import java.util.List;

/**
 * Created by admin on 2017/7/6.
 */

public class ArticleListActivity extends BaseMVPActivity<ArticleListPresenter> implements ArticleListContract.View {
    @Override
    protected void injectComponent() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onViewCreated(@Nullable Bundle saveInstanceState) {
        super.onViewCreated(saveInstanceState);
        initView();
    }

    private void initView() {

    }

    @Override
    public void getArticleListRefreshSuccess(List<ArticleListBean> articleList) {

    }

    @Override
    public void getArticleListMoreSuccess(List<ArticleListBean> articleList) {

    }

    @Override
    public void showErrorToast(String msg) {

    }
}
