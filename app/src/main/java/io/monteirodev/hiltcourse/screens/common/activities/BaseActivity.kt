package io.monteirodev.hiltcourse.screens.common.activities

import androidx.appcompat.app.AppCompatActivity
import io.monteirodev.hiltcourse.MyApplication
import io.monteirodev.hiltcourse.common.dependencyinjection.ActivityCompositionRoot
import io.monteirodev.hiltcourse.common.dependencyinjection.Injector
import io.monteirodev.hiltcourse.common.dependencyinjection.PresentationCompositionRoot

open class BaseActivity: AppCompatActivity() {

    private val appCompositionRoot get() = (application as MyApplication).appCompositionRoot

    val activityCompositionRoot by lazy {
        ActivityCompositionRoot(this, appCompositionRoot)
    }

    private val compositionRoot by lazy {
        PresentationCompositionRoot(activityCompositionRoot)
    }

    protected val injector get() = Injector(compositionRoot)

}