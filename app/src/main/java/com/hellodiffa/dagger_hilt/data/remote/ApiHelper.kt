package com.hellodiffa.dagger_hilt.data.remote

import com.hellodiffa.dagger_hilt.data.response.NewsResponse
import retrofit2.Response

interface ApiHelper {

    suspend fun getNews() : Response<NewsResponse>
}