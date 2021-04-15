package io.monteirodev.hiltcourse.networking

import com.google.gson.annotations.SerializedName
import io.monteirodev.hiltcourse.questions.QuestionWithBody

data class SingleQuestionResponseSchema(
        @SerializedName("items") val questions: List<QuestionWithBody>
) {
    val question: QuestionWithBody get() = questions[0]
}