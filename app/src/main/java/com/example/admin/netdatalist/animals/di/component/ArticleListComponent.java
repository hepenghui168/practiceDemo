package com.example.admin.netdatalist.animals.di.component;

import com.example.admin.netdatalist.animals.di.module.ArticleListModule;
import com.example.admin.netdatalist.animals.ui.activity.ArticleListActivity;
import com.example.admin.netdatalist.base.di.component.AppComponent;
import com.example.admin.netdatalist.base.di.scope.ActivityScope;

import dagger.Component;

/**
 * Created by admin on 2017/7/6.
 */
@ActivityScope
@Component(modules = ArticleListModule.class, dependencies = AppComponent.class)
public interface ArticleListComponent {
    void inject(ArticleListActivity activity);
}
