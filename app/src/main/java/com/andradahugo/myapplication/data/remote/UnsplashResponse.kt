package com.andradahugo.myapplication.data.remote

import com.andradahugo.myapplication.data.model.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)
