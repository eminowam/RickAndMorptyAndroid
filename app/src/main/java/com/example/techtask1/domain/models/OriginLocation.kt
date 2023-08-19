package com.example.techtask1.domain.models

import com.google.gson.annotations.SerializedName

data class OriginLocation(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String,
)