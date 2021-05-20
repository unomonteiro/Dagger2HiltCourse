package io.monteirodev.hiltcourse.screens.common.fragments

import androidx.fragment.app.Fragment
import io.monteirodev.hiltcourse.common.dependencyinjection.presentation.DaggerPresentationComponent
import io.monteirodev.hiltcourse.common.dependencyinjection.presentation.PresentationModule
import io.monteirodev.hiltcourse.screens.common.activities.BaseActivity

open class BaseFragment: Fragment() {

    private val presentationComponent by lazy {
        DaggerPresentationComponent.builder()
            .presentationModule(PresentationModule((requireActivity() as BaseActivity).activityComponent))
            .build()
    }

    protected val injector get() = presentationComponent
}