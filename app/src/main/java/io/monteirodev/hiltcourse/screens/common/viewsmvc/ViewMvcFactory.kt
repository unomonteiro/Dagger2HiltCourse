package io.monteirodev.hiltcourse.screens.common.viewsmvc

import android.view.LayoutInflater
import android.view.ViewGroup
import io.monteirodev.hiltcourse.screens.questiondetails.QuestionDetailsViewMvc
import io.monteirodev.hiltcourse.screens.questionslist.QuestionsListViewMvc

class ViewMvcFactory(private val layoutInflater: LayoutInflater) {

    fun newQuestionsListViewMvc(parent: ViewGroup?): QuestionsListViewMvc {
        return QuestionsListViewMvc(layoutInflater, parent)
    }

    fun newQuestionDetailsViewMvc(parent: ViewGroup?): QuestionDetailsViewMvc {
        return QuestionDetailsViewMvc(layoutInflater, parent)
    }
}