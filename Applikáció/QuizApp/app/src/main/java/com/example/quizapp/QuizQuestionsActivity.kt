package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class QuizQuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        val questionList = Constants.getQuestions()

        val currentPosition = 1
        val question: Question? = questionList[currentPosition -1]

        progressBar.progress = currentPosition
        tv_progress.text = "$currentPosition" + "/" + progressBar.max

        tv_question.text = question!!.question
        iv_image.setImageResource(question.image)
        tv_option_one.text = question.OptionOne
        tv_option_two.text = question.OptionTwo
        tv_option_three.text = question.OptionThree
        tv_option_four.text = question.OptionFour
    }
}