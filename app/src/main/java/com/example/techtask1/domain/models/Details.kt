package com.example.techtask1.domain.models

import com.google.gson.annotations.SerializedName

data class Details(
<<<<<<< HEAD
=======
    @SerializedName("id") val id: Int,
>>>>>>> ef715f8 (Initial commit)
    @SerializedName("name") val name: String,
    @SerializedName("status") val status: String,
    @SerializedName("species") val species: String,
    @SerializedName("type") val type: String,
    @SerializedName("origin") val origin: OriginLocation,
    @SerializedName("location") val location: OriginLocation,
    @SerializedName("gender") val gender: String,
    @SerializedName("image") val image: String,
    @SerializedName("episode") val episode: List<String>,
    @SerializedName("url") val url: String,
    @SerializedName("created") val created: String,
    )

<<<<<<< HEAD
//@SerializedName("origin") class InnerClass
=======
>>>>>>> ef715f8 (Initial commit)
