package com.iit.project.domain.repository

import com.iit.project.domain.data.SampleItem

interface SampleRepository {
    suspend fun getSampleList(): List<SampleItem>

    suspend fun getSampleItem(id: Int): SampleItem
}