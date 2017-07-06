package com.example.admin.netdatalist.animals.di.module;

import com.example.admin.netdatalist.animals.contract.ArticleListContract;
import com.example.admin.netdatalist.animals.model.interactor.ArticleListInteractorImpl;
import com.example.admin.netdatalist.base.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by admin on 2017/7/6.
 */
@Module
public class ArticleListModule {
    private ArticleListContract.View view;

    public ArticleListModule(ArticleListContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    ArticleListContract.View providerView() {
        return view;
    }

    @ActivityScope
    @Provides
    ArticleListContract.Interactor providerModel(ArticleListInteractorImpl interactor) {
        return interactor;
    }
}
