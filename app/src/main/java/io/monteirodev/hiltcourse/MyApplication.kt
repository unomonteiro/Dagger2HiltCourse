package io.monteirodev.hiltcourse

import android.app.Application
import io.monteirodev.hiltcourse.common.composition.AppCompositionRoot

class MyApplication : Application() {

    lateinit var appCompositionRoot: AppCompositionRoot

    override fun onCreate() {
        appCompositionRoot = AppCompositionRoot(this)
        super.onCreate()
    }
}