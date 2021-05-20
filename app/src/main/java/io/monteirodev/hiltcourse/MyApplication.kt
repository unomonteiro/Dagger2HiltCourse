package io.monteirodev.hiltcourse

import android.app.Application
import io.monteirodev.hiltcourse.common.dependencyinjection.app.AppModule
import io.monteirodev.hiltcourse.common.dependencyinjection.app.DaggerAppComponent

class MyApplication : Application() {

    val appComponent by lazy {
        DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
    }
}