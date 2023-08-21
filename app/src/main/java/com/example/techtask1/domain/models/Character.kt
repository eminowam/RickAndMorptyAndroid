package com.example.techtask1.domain.models

import com.google.gson.annotations.SerializedName

<<<<<<< HEAD
data class Character(
    @SerializedName("count") val count: Int,
    @SerializedName("pages") val pages: Int,
    @SerializedName("next") val next: String,
    @SerializedName("prev") val prev: String,
=======
data class Ifo(
    @SerializedName("name") val name: String,
    @SerializedName("status") val status: String,
    @SerializedName("species") val species: String,
    @SerializedName("image") val image: String,
>>>>>>> ef715f8 (Initial commit)
)
