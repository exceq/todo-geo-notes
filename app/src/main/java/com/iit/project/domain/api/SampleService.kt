package com.iit.project.domain.api

import com.iit.project.domain.data.SampleItem
import retrofit2.http.GET
import retrofit2.http.Query

interface SampleService {
    //todo ОБЕРНУТЬ в НЕКИЙ ApiResult с перехватом try catch
    @GET("sampleDir")
    suspend fun getSampleList(): List<SampleItem>

    @GET("sampleDir/{id}")
    suspend fun getSampleItem(@Query("id") id: Int): SampleItem
}