package io.monteirodev.hiltcourse.common.composition

import android.app.Activity
import io.monteirodev.hiltcourse.questions.FetchQuestionDetailsUseCase
import io.monteirodev.hiltcourse.questions.FetchQuestionsUseCase
import io.monteirodev.hiltcourse.screens.common.ScreensNavigator

class ActivityCompositionRoot(
        private val activity: Activity,
        private val appCompositionRoot: AppCompositionRoot
) {

    val screensNavigator by lazy {
        ScreensNavigator(activity)
    }

    private val stackoverflowApi get() = appCompositionRoot.stackoverflowApi

    val fetchQuestionsUseCase get() = FetchQuestionsUseCase(stackoverflowApi)

    val fetchQuestionDetailsUseCase get() = FetchQuestionDetailsUseCase(stackoverflowApi)
}