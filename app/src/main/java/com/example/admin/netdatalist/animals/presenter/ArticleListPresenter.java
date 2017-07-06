package com.example.admin.netdatalist.animals.presenter;

import com.example.admin.netdatalist.animals.contract.ArticleListContract;
import com.example.admin.netdatalist.base.BasePresenter;

import javax.inject.Inject;

/**
 * Created by admin on 2017/7/6.
 */

public class ArticleListPresenter extends BasePresenter<ArticleListContract.View, ArticleListContract.Interactor> {

    @Inject
    public ArticleListPresenter(ArticleListContract.View view, ArticleListContract.Interactor interactor) {
        super(view, interactor);
    }


}
