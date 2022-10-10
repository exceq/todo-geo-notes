package com.iit.project.domain.usecases.getSampleList

import com.iit.project.domain.data.SampleItem
import com.iit.project.domain.repository.SampleRepository
import javax.inject.Inject

class GetSampleListUseCaseImpl @Inject constructor(
    private val sampleRepository: SampleRepository
) : GetSampleListUseCase {
    override suspend fun invoke(): List<SampleItem> = sampleRepository.getSampleList()
}