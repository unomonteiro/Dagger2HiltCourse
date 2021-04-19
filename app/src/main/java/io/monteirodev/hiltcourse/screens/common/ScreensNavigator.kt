package io.monteirodev.hiltcourse.screens.common

import android.app.Activity
import android.content.Context
import io.monteirodev.hiltcourse.screens.questiondetails.QuestionDetailsActivity

class ScreensNavigator(private val activity: Activity) {

    fun navigationBack() {
        activity.onBackPressed()
    }

    fun toQuestionsDetails(questionId: String) {
        QuestionDetailsActivity.start(activity, questionId)
    }
}