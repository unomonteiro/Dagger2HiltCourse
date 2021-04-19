package io.monteirodev.hiltcourse.common.composition

import androidx.appcompat.app.AppCompatActivity
import io.monteirodev.hiltcourse.questions.FetchQuestionDetailsUseCase
import io.monteirodev.hiltcourse.questions.FetchQuestionsUseCase
import io.monteirodev.hiltcourse.screens.common.ScreensNavigator
import io.monteirodev.hiltcourse.screens.common.dialogs.DialogsNavigator

class ActivityCompositionRoot(
        private val activity: AppCompatActivity,
        private val appCompositionRoot: AppCompositionRoot
) {

    val screensNavigator by lazy {
        ScreensNavigator(activity)
    }

    private val fragmentManager get() = activity.supportFragmentManager

    val dialogsNavigator get() = DialogsNavigator(fragmentManager)

    private val stackoverflowApi get() = appCompositionRoot.stackoverflowApi

    val fetchQuestionsUseCase get() = FetchQuestionsUseCase(stackoverflowApi)

    val fetchQuestionDetailsUseCase get() = FetchQuestionDetailsUseCase(stackoverflowApi)
}