package io.monteirodev.hiltcourse.screens.common.activities

import androidx.appcompat.app.AppCompatActivity
import io.monteirodev.hiltcourse.MyApplication
import io.monteirodev.hiltcourse.common.composition.ActivityCompositionRoot
import io.monteirodev.hiltcourse.common.composition.PresentationCompositionRoot

open class BaseActivity: AppCompatActivity() {

    private val appCompositionRoot get() = (application as MyApplication).appCompositionRoot

    val activityCompositionRoot by lazy {
        ActivityCompositionRoot(this, appCompositionRoot)
    }

    protected val compositionRoot by lazy {
        PresentationCompositionRoot(activityCompositionRoot)
    }


}