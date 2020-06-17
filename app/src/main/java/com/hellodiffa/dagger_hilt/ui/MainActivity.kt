package com.hellodiffa.dagger_hilt.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.hellodiffa.dagger_hilt.R
import com.hellodiffa.dagger_hilt.common.ResultState
import com.hellodiffa.dagger_hilt.common.Status
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel : MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        observeNewsData()
    }

    private fun observeNewsData() {
        viewModel.news.observe(this, Observer {
            when(it.status){
                Status.SUCCESS -> {
                    progressBar.visibility = View.GONE
                    Glide.with(applicationContext)
                        .load(it.data?.articles?.get(0)?.urlToImage)
                        .into(imgContent)
                    tvTitle.text = it.data?.articles?.get(0)?.title
                    tvDescription.text = it.data?.articles?.get(0)?.description
                }
                Status.ERROR -> {
                    progressBar.visibility = View.GONE
                    Toast.makeText(baseContext, it.message, Toast.LENGTH_SHORT).show()
                }

                Status.LOADING -> {
                    progressBar.visibility = View.VISIBLE
                }
            }
        })
    }
}