package io.monteirodev.hiltcourse.screens.common.activities

import androidx.appcompat.app.AppCompatActivity
import io.monteirodev.hiltcourse.MyApplication
import io.monteirodev.hiltcourse.common.dependencyinjection.ActivityCompositionRoot
import io.monteirodev.hiltcourse.common.dependencyinjection.DaggerPresentationComponent
import io.monteirodev.hiltcourse.common.dependencyinjection.Injector
import io.monteirodev.hiltcourse.common.dependencyinjection.PresentationModule

open class BaseActivity: AppCompatActivity() {

    private val appCompositionRoot get() = (application as MyApplication).appCompositionRoot

    val activityCompositionRoot by lazy {
        ActivityCompositionRoot(this, appCompositionRoot)
    }

    private val presentationComponent by lazy {
        DaggerPresentationComponent.builder()
            .presentationModule(PresentationModule(activityCompositionRoot))
            .build()
    }

    protected val injector get() = Injector(presentationComponent)

}