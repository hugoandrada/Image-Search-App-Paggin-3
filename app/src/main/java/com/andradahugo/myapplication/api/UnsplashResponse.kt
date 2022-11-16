package com.andradahugo.myapplication.api

import com.andradahugo.myapplication.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)
