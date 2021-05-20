package io.monteirodev.hiltcourse.common.dependencyinjection.activity

import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import dagger.Module
import dagger.Provides
import io.monteirodev.hiltcourse.common.dependencyinjection.app.AppComponent
import io.monteirodev.hiltcourse.screens.common.ScreensNavigator

@Module
class ActivityModule(
        val activity: AppCompatActivity,
        private val appComponent: AppComponent
) {

    @Provides
    fun activity() = activity

    @Provides
    fun application() = appComponent.application()

    @Provides
    @ActivityScope
    fun screensNavigator(activity: AppCompatActivity) = ScreensNavigator(activity)

    @Provides
    fun layoutInflater() = LayoutInflater.from(activity)

    @Provides
    fun fragmentManager() = activity.supportFragmentManager

    @Provides
    fun stackoverflowApi() = appComponent.stackoverflowApi()

}