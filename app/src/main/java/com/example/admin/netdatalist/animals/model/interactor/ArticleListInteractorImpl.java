package com.example.admin.netdatalist.animals.model.interactor;

import com.example.admin.netdatalist.animals.contract.ArticleListContract;
import com.example.admin.netdatalist.animals.model.model.ArticleListBean;
import com.example.admin.netdatalist.base.di.scope.ActivityScope;
import com.example.admin.netdatalist.retrofit.api.StoreApi;
import com.example.admin.netdatalist.retrofit.model.Model1;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by admin on 2017/7/6.
 */
@ActivityScope
public class ArticleListInteractorImpl implements ArticleListContract.Interactor {
    private StoreApi storeApi;

    @Inject
    public ArticleListInteractorImpl(StoreApi storeApi) {
        this.storeApi = storeApi;
    }


    @Override
    public void onDestroy() {

    }

    @Override
    public Observable<Model1<List<ArticleListBean>>> getArticleList(int page) {
        return null;
    }
}
