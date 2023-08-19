package com.example.techtask1.domain.models

import com.google.gson.annotations.SerializedName

data class Ifo(
    @SerializedName("name") val name: String,
    @SerializedName("status") val status: String,
    @SerializedName("species") val species: String,
    @SerializedName("image") val image: String,
)
