package com.example.admin.netdatalist.animals.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.admin.netdatalist.R;
import com.example.admin.netdatalist.animals.contract.ArticleListContract;
import com.example.admin.netdatalist.animals.model.model.ArticleListBean;
import com.example.admin.netdatalist.animals.presenter.ArticleListPresenter;
import com.example.admin.netdatalist.base.BaseActivity;
import com.example.admin.netdatalist.base.di.BaseMVPActivity;

import java.util.List;

/**
 * Created by admin on 2017/7/6.
 */

public class ArticleListActivity extends BaseActivity {


    @Override
    protected void onViewCreated(@Nullable Bundle saveInstanceState) {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }


    private void initView() {

    }


}
