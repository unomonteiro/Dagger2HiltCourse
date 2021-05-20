package io.monteirodev.hiltcourse.common.dependencyinjection.activity

import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import dagger.Component
import io.monteirodev.hiltcourse.networking.StackoverflowApi
import io.monteirodev.hiltcourse.screens.common.ScreensNavigator

@ActivityScope
@Component(modules = [ActivityModule::class])
interface ActivityComponent {

    fun activity(): AppCompatActivity

    fun layoutInflater(): LayoutInflater

    fun fragmentManager(): FragmentManager

    fun stackoverflowApi(): StackoverflowApi

    fun screensNavigator(): ScreensNavigator

}