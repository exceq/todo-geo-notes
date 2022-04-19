package com.zotreex.sample_project.domain.repository

import com.zotreex.sample_project.domain.api.SampleService
import com.zotreex.sample_project.domain.data.SampleItem
import javax.inject.Inject

class SampleRepositoryImpl @Inject constructor(
    private val sampleService: SampleService
) : SampleRepository {
    override suspend fun getSampleList(): List<SampleItem> = sampleService.getSampleList()

    override suspend fun getSampleItem(id: Int): SampleItem = sampleService.getSampleItem(id)
}