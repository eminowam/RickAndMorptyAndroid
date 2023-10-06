package com.example.techtask1.domain.models

import com.google.gson.annotations.SerializedName

data class MainResponse(
    @SerializedName("results") val results: List<Character>,
)
