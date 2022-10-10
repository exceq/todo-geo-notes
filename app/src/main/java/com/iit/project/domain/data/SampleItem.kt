package com.iit.project.domain.data

import com.google.gson.annotations.SerializedName

data class SampleItem(
    @SerializedName("item_id")
    val id: Int,
    val title: String
)
