package com.hellodiffa.dagger_hilt.data.remote

import com.hellodiffa.dagger_hilt.data.response.NewsResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {


    @GET("top-headlines?country=us&category=business&apiKey=YOUR_API_KEY")
    suspend fun getArticle(): Response<NewsResponse>
}