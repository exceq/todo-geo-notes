package com.iit.project.domain.repository

import com.iit.project.domain.api.SampleService
import com.iit.project.domain.data.SampleItem
import javax.inject.Inject

class SampleRepositoryImpl @Inject constructor(
    private val sampleService: SampleService
) : SampleRepository {
    override suspend fun getSampleList(): List<SampleItem> = sampleService.getSampleList()

    override suspend fun getSampleItem(id: Int): SampleItem = sampleService.getSampleItem(id)
}