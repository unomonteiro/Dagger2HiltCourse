package io.monteirodev.hiltcourse.screens.common.fragments

import androidx.fragment.app.Fragment
import io.monteirodev.hiltcourse.screens.common.activities.BaseActivity

open class BaseFragment: Fragment() {

    protected val compositionRoot get() = (requireActivity() as BaseActivity).compositionRoot

}