package com.example.admin.netdatalist.animals.contract;

import com.example.admin.netdatalist.animals.model.model.ArticleListBean;
import com.example.admin.netdatalist.base.IInteractor;
import com.example.admin.netdatalist.base.IView;
import com.example.admin.netdatalist.retrofit.model.Model1;

import java.util.List;

import rx.Observable;

/**
 * Created by admin on 2017/7/6.
 */

public interface ArticleListContract {

    interface View extends IView {

        void getArticleListRefreshSuccess(List<ArticleListBean> articleList);

        void getArticleListMoreSuccess(List<ArticleListBean> articleList);

        void showErrorToast(String msg);

    }

    interface Interactor extends IInteractor {

        Observable<Model1<List<ArticleListBean>>> getArticleList(int page);

    }

}
