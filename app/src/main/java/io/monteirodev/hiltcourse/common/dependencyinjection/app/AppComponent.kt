package io.monteirodev.hiltcourse.common.dependencyinjection.app

import android.app.Application
import dagger.Component
import io.monteirodev.hiltcourse.networking.StackoverflowApi

@Component(modules = [AppModule::class])
interface AppComponent {

    fun application(): Application
    fun stackoverflowApi(): StackoverflowApi
}