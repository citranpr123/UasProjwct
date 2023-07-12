package com.citra.appmovie.data.api

import com.citra.appmovie.data.model.ListResponse
import com.citra.appmovie.data.model.MovieResponse
import com.citra.appmovie.data.model.TvShowResponse
import com.citra.appmovie.utils.API_KEY
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("movie/now_playing?api_key=$API_KEY")
    fun getMovies(): Call<ListResponse<MovieResponse>>

    @GET("tv/airing_today?api_key=$API_KEY")
    fun getTvShow(): Call<ListResponse<TvShowResponse>>

}