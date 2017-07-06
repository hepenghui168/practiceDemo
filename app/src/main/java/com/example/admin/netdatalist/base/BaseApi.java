package com.example.admin.netdatalist.base;

import android.content.Context;

/**
 * Created by admin on 2017/7/5.
 */

public class BaseApi {

    public static final int HOST_FORMAL = 1;
    public static final int HOST_TEST = 2;
    public static final int HOST_DEV = 3;

    public static int HOST_NOW;


    /**
     * 电商
     */
    public static String STORE_BASE_URL = "";


    public static void init(Context context, int environment) {
        HOST_NOW = environment;
        switch (environment) {
            case HOST_FORMAL:
                STORE_BASE_URL = "https://api-store-park.putao.com/";

                break;
            case HOST_TEST:
                STORE_BASE_URL = "http://test-api-store-park.ptdev.cn/";

                break;
            case HOST_DEV:
                STORE_BASE_URL = "http://dev-api-store-park.ptdev.cn/";

                break;
        }
    }

    public static class Url {
        /*
        * 文章列表
        * */
        public static final String URL_ARTICLE_LIST = "article/list";
    }
}
