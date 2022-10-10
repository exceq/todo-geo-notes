package com.iit.project.domain.usecases.getSampleList

import com.iit.project.domain.data.SampleItem

interface GetSampleListUseCase {
    suspend operator fun invoke(): List<SampleItem>
}