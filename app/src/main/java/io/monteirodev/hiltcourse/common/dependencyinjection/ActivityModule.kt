package io.monteirodev.hiltcourse.common.dependencyinjection

import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import dagger.Module
import dagger.Provides
import io.monteirodev.hiltcourse.screens.common.ScreensNavigator

@Module
class ActivityModule(
        val activity: AppCompatActivity,
        private val appComponent: AppComponent
) {

    private val screensNavigator by lazy {
        ScreensNavigator(activity)
    }

    @Provides
    fun activity() = activity

    @Provides
    fun application() = appComponent.application()

    @Provides
    fun screensNavigator(activity: AppCompatActivity) = screensNavigator

    @Provides
    fun layoutInflater() = LayoutInflater.from(activity)

    @Provides
    fun fragmentManager() = activity.supportFragmentManager

    @Provides
    fun stackoverflowApi() = appComponent.stackoverflowApi()

}