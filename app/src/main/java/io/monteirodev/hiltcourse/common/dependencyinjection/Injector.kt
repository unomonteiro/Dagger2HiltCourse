package io.monteirodev.hiltcourse.common.dependencyinjection

import io.monteirodev.hiltcourse.screens.questiondetails.QuestionDetailsActivity
import io.monteirodev.hiltcourse.screens.questionslist.QuestionsListFragment

class Injector(private val compositionRoot: PresentationCompositionRoot) {
    fun inject(fragment: QuestionsListFragment) {
        fragment.fetchQuestionsUseCase = compositionRoot.fetchQuestionsUseCase
        fragment.dialogsNavigator = compositionRoot.dialogsNavigator
        fragment.screensNavigator = compositionRoot.screensNavigator
        fragment.viewMvcFactory = compositionRoot.viewMvcFactory

    }

    fun inject(activity: QuestionDetailsActivity) {
        activity.fetchQuestionDetailsUseCase = compositionRoot.fetchQuestionDetailsUseCase
        activity.screensNavigator = compositionRoot.screensNavigator
        activity.dialogsNavigator = compositionRoot.dialogsNavigator
        activity.viewMvcFactory = compositionRoot.viewMvcFactory
    }
}