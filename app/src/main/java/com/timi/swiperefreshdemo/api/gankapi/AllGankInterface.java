package com.timi.swiperefreshdemo.api.gankapi;

import com.timi.swiperefreshdemo.mvp.module.BookSearchResponse;
import com.timi.swiperefreshdemo.mvp.module.homemodels.GankAllResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Huanbei_dev4 on 2017/1/6.
 * to do:
 */

public interface AllGankInterface {
    //获取所有的干货
    @GET("all/{pageSize}/{pageIndex}")
    Call<GankAllResult> getAllGank(@Path("pageSize")String pageSize,@Path("pageIndex") String pageindex);
}
