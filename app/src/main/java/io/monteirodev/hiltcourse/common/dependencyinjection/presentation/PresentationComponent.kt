package io.monteirodev.hiltcourse.common.dependencyinjection.presentation

import dagger.Component
import io.monteirodev.hiltcourse.screens.questiondetails.QuestionDetailsActivity
import io.monteirodev.hiltcourse.screens.questionslist.QuestionsListFragment

@Component(modules = [PresentationModule::class])
interface PresentationComponent {

    fun inject(fragment: QuestionsListFragment)
    fun inject(activity: QuestionDetailsActivity)

}