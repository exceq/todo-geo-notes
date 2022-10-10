package com.iit.project

import android.app.Application
import com.iit.project.di.AppComponent
import com.iit.project.di.DaggerAppComponent

class MainApplication : Application() {
    lateinit var appComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}