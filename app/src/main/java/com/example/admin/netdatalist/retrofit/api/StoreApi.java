package com.example.admin.netdatalist.retrofit.api;

import com.example.admin.netdatalist.animals.model.model.ArticleListBean;
import com.example.admin.netdatalist.base.BaseApi;
import com.example.admin.netdatalist.retrofit.model.Model1;

import java.util.List;
import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by admin on 2017/7/5.
 */

public interface StoreApi {
    /*
    * 获取网络数据
    * */
    @GET(BaseApi.Url.URL_ARTICLE_LIST)
    Observable<Model1<List<ArticleListBean>>> getArticleList(@QueryMap Map<String, String> map);

}
