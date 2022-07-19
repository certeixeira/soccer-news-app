package com.certeixeira.soccernews.data.remote;

import com.certeixeira.soccernews.domain.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SoccerNewsApi {

    @GET("news.json")
    Call<List<News>> getNews();
}
