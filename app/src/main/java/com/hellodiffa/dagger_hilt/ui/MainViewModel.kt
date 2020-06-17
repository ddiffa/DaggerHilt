package com.hellodiffa.dagger_hilt.ui

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hellodiffa.dagger_hilt.common.ResultState
import com.hellodiffa.dagger_hilt.data.NewsRepository
import com.hellodiffa.dagger_hilt.data.response.NewsResponse
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(private val repository: NewsRepository) : ViewModel(){


    private val _news = MutableLiveData<ResultState<NewsResponse>>()
    val news : LiveData<ResultState<NewsResponse>> get() = _news


    init {
        fetchNews()
    }

    private fun fetchNews() {
        viewModelScope.launch {
            _news.postValue(ResultState.loading(null))
            delay(1_500)
            try{
                _news.postValue(ResultState.success(repository.getNews().body()))
            }catch (e : Exception){
                _news.postValue(ResultState.error(e.message.toString()))
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelScope.cancel()
    }
}