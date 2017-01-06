package com.timi.swiperefreshdemo.api.doubanapi;

import com.timi.swiperefreshdemo.mvp.module.BookSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by timi on 2017/1/6.
 * to do:  豆瓣电影的movies
 */

public interface DouBanMovieInterface {
    //获取豆瓣Top250 榜单
    @GET("book/search")
    Call<BookSearchResponse> getSearchBooks(@Query("q") String name,
                                            @Query("tag") String tag, @Query("start") int start,
                                            @Query("count") int count);

}
