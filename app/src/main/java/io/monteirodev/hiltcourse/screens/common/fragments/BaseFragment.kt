package io.monteirodev.hiltcourse.screens.common.fragments

import androidx.fragment.app.Fragment
import io.monteirodev.hiltcourse.common.dependencyinjection.Injector
import io.monteirodev.hiltcourse.common.dependencyinjection.PresentationCompositionRoot
import io.monteirodev.hiltcourse.screens.common.activities.BaseActivity

open class BaseFragment: Fragment() {

    private val compositionRoot by lazy {
        PresentationCompositionRoot((requireActivity() as BaseActivity).activityCompositionRoot)
    }

    protected val injector get() = Injector(compositionRoot)
}