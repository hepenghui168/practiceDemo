package com.example.admin.netdatalist.retrofit.model;

import java.io.Serializable;

/**
 * Created by admin on 2017/7/6.
 */

public class Model1<T> implements Serializable {
    private T data;
    private int http_code;
    private int http_status_code;
    private String msg = "";

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getHttp_code() {
        return http_code;
    }

    public void setHttp_code(int http_code) {
        this.http_code = http_code;
    }

    public int getHttp_status_code() {
        return http_status_code;
    }

    public void setHttp_status_code(int http_status_code) {
        this.http_status_code = http_status_code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
