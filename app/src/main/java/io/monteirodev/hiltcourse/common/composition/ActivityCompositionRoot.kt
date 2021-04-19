package io.monteirodev.hiltcourse.common.composition

import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import io.monteirodev.hiltcourse.screens.common.ScreensNavigator

class ActivityCompositionRoot(
        private val activity: AppCompatActivity,
        private val appCompositionRoot: AppCompositionRoot
) {

    val screensNavigator by lazy {
        ScreensNavigator(activity)
    }

    val layoutInflater get() = LayoutInflater.from(activity)

    val fragmentManager get() = activity.supportFragmentManager

    val stackoverflowApi get() = appCompositionRoot.stackoverflowApi


}