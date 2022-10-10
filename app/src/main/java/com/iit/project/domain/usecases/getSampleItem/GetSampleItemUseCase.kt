package com.iit.project.domain.usecases.getSampleItem

import com.iit.project.domain.data.SampleItem

interface GetSampleItemUseCase {
    suspend operator fun invoke(id: Int): SampleItem
}