package com.example.techtask1.domain.models

import com.google.gson.annotations.SerializedName

data class MainResponse(
    @SerializedName("info") val info: Int,
    @SerializedName("results") val results: List<Details>,
)
