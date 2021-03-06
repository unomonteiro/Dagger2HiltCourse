package io.monteirodev.hiltcourse.screens.common.activities

import androidx.appcompat.app.AppCompatActivity
import io.monteirodev.hiltcourse.MyApplication
import io.monteirodev.hiltcourse.common.dependencyinjection.activity.ActivityModule
import io.monteirodev.hiltcourse.common.dependencyinjection.activity.DaggerActivityComponent
import io.monteirodev.hiltcourse.common.dependencyinjection.presentation.DaggerPresentationComponent
import io.monteirodev.hiltcourse.common.dependencyinjection.presentation.PresentationModule

open class BaseActivity: AppCompatActivity() {

    private val appCompositionRoot get() = (application as MyApplication).appComponent

    val activityComponent by lazy {
        DaggerActivityComponent.builder()
            .activityModule(ActivityModule(this, appCompositionRoot))
            .build()
    }

    private val presentationComponent by lazy {
        DaggerPresentationComponent.builder()
            .presentationModule(PresentationModule(activityComponent))
            .build()
    }

    protected val injector get() = presentationComponent

}