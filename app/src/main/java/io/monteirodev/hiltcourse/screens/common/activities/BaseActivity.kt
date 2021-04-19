package io.monteirodev.hiltcourse.screens.common.activities

import androidx.appcompat.app.AppCompatActivity
import io.monteirodev.hiltcourse.MyApplication
import io.monteirodev.hiltcourse.common.composition.ActivityCompositionRoot

open class BaseActivity: AppCompatActivity() {

    private val appCompositionRoot get() = (application as MyApplication).appCompositionRoot

    val compositionRoot by lazy {
        ActivityCompositionRoot(this, appCompositionRoot)
    }


}