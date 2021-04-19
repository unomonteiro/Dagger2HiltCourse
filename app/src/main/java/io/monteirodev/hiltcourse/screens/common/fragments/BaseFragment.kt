package io.monteirodev.hiltcourse.screens.common.fragments

import androidx.fragment.app.Fragment
import io.monteirodev.hiltcourse.common.composition.PresentationCompositionRoot
import io.monteirodev.hiltcourse.screens.common.activities.BaseActivity

open class BaseFragment: Fragment() {

    protected val compositionRoot by lazy {
        PresentationCompositionRoot((requireActivity() as BaseActivity).activityCompositionRoot)
    }

}