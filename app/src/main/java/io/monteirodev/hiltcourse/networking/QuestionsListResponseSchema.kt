package io.monteirodev.hiltcourse.networking

import com.google.gson.annotations.SerializedName
import io.monteirodev.hiltcourse.questions.Question

data class QuestionsListResponseSchema(
        @SerializedName("items") val questions: List<Question>
)