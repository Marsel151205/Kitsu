package com.example.kitsu.models.anime

import com.google.gson.annotations.SerializedName

data class AnimeImage(
    @SerializedName("medium")
    val mediumImage: String
)
