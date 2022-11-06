package com.example.quizapp

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val QuestionList = ArrayList<Question>()

        val QuestionOne = Question(1, "Milyen programozási nyelvnek ez a ikonja?",
        R.drawable.javaikon,
            "Java",
            "Phyton",
            "Oracle",
            "JavaScript",
            1
        )
        QuestionList.add(QuestionOne)
        return QuestionList
    }
}