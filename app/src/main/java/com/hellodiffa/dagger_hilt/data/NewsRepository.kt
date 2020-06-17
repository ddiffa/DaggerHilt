package com.hellodiffa.dagger_hilt.data

import com.hellodiffa.dagger_hilt.data.remote.ApiHelper
import javax.inject.Inject

class NewsRepository @Inject constructor(private val apiHelper : ApiHelper) {

    suspend fun getNews() = apiHelper.getNews()
}