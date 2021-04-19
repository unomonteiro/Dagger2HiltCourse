package io.monteirodev.hiltcourse.screens.questionslist

import android.os.Bundle
import io.monteirodev.hiltcourse.R
import io.monteirodev.hiltcourse.screens.common.activities.BaseActivity

class QuestionsListActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_frame)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .add(R.id.frame_content, QuestionsListFragment())
                    .commit()

        }
    }
}