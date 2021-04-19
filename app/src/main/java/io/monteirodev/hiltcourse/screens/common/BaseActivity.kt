package io.monteirodev.hiltcourse.screens.common

import androidx.appcompat.app.AppCompatActivity
import io.monteirodev.hiltcourse.MyApplication

open class BaseActivity: AppCompatActivity() {

    val compositionRoot get() = (application as MyApplication).appCompositionRoot

}