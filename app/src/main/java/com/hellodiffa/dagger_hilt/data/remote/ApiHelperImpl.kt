package com.hellodiffa.dagger_hilt.data.remote

import com.hellodiffa.dagger_hilt.data.response.NewsResponse
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val service: ApiService) : ApiHelper {

    override suspend fun getNews(): Response<NewsResponse> = service.getArticle()

}