package com.example.techtask1.data.networks

import com.example.techtask1.domain.models.Details
import com.example.techtask1.domain.models.MainResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MainApi {

    @GET(Endpoints.CHARACTER)
    suspend fun getCharacter(
        @Query("page") page: Int,
<<<<<<< HEAD
        @Query("results") results: String ,
    ):Response<MainResponse>

    @GET(Endpoints.DETAILS)
    suspend fun getDetails(
=======
    ):Response<MainResponse>

    @GET(Endpoints.DETAILS)
    suspend fun goToDetailsCharacter(
>>>>>>> ef715f8 (Initial commit)
        @Path("movie_id") movie_id: Int,
        @Query("page") page: Int = 1
    ): Response<Details>
}