package com.example.techtask1.domain.models

import com.google.gson.annotations.SerializedName

data class Character(
    @SerializedName("count") val count: Int,
    @SerializedName("pages") val pages: Int,
    @SerializedName("next") val next: String,
    @SerializedName("prev") val prev: String,
)
