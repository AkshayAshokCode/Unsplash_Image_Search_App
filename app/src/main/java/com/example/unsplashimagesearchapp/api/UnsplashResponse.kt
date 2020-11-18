package com.example.unsplashimagesearchapp.api

import com.example.unsplashimagesearchapp.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)