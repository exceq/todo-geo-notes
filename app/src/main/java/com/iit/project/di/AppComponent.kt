package com.iit.project.di

import androidx.lifecycle.ViewModelProvider
import com.iit.project.domain.api.SampleService
import com.iit.project.domain.repository.SampleRepository
import com.iit.project.domain.repository.SampleRepositoryImpl
import com.iit.project.domain.usecases.getSampleItem.GetSampleItemUseCase
import com.iit.project.domain.usecases.getSampleItem.GetSampleItemUseCaseImpl
import com.iit.project.domain.usecases.getSampleList.GetSampleListUseCase
import com.iit.project.domain.usecases.getSampleList.GetSampleListUseCaseImpl
import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

@Component(modules = [AppModule::class])
interface AppComponent {

}

@Module(includes = [NetworkModule::class, AppBindModule::class])
class AppModule

@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}

@Module
interface AppBindModule {
    @Binds
    fun bindSampleRepository(repository: SampleRepositoryImpl): SampleRepository

    @Binds
    fun bindGetSampleListUseCase(useCase: GetSampleListUseCaseImpl): GetSampleListUseCase

    @Binds
    fun bindGetSampleItemUseCase(useCase: GetSampleItemUseCaseImpl): GetSampleItemUseCase
}

@Module
class NetworkModule {
    @Provides
    fun provideSampleApi(): SampleService {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://www.sampleapi.com/")
            .build()
        return retrofit.create()
    }
}
