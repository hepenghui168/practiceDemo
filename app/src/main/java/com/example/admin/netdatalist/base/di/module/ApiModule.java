package com.example.admin.netdatalist.base.di.module;

import com.example.admin.netdatalist.base.di.scope.AppScope;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dagger.Module;
import dagger.Provides;

/**
 * Created by admin on 2017/7/5.
 */
@Module
public final class ApiModule {

    @Provides
    @AppScope
    Gson providerGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        return gsonBuilder.create();
    }


}
