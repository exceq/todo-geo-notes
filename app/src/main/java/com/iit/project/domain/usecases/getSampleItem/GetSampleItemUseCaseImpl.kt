package com.iit.project.domain.usecases.getSampleItem

import com.iit.project.domain.data.SampleItem
import com.iit.project.domain.repository.SampleRepository
import javax.inject.Inject

class GetSampleItemUseCaseImpl @Inject constructor(
    private val sampleRepository: SampleRepository
) : GetSampleItemUseCase {
    override suspend fun invoke(id: Int): SampleItem = sampleRepository.getSampleItem(id)
}