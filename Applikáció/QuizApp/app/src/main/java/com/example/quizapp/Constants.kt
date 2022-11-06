package com.example.quizapp

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val QuestionList = ArrayList<Question>()

        val QuestionOne = Question(1, "Melyik programozási nyelvnek ez a ikonja?",
        R.drawable.javaikon,
            "Java",
            "Phyton",
            "Oracle",
            "JavaScript",
            1
        )
        QuestionList.add(QuestionOne)
        val QuestionTwo = Question(4, "Melyik programozási nyelvnek ez a ikonja?",
            R.drawable.firebase,
            "GO",
            "Fire",
            "Oracle",
            "Firebase",
            4
        )
        QuestionList.add(QuestionTwo)
        val QuestionThree = Question(3, "Melyik programozási nyelvnek ez a ikonja?",
            R.drawable.css,
            "C#",
            "Css",
            "C++",
            "C",
            2
        )
        QuestionList.add(QuestionThree)
        val QuestionFour = Question(1, "Melyik programozási nyelvnek ez a ikonja?",
            R.drawable.html5,
            "Html",
            "JavaScript",
            "Html5",
            "Json",
            3
        )
        QuestionList.add(QuestionFour)
        val QuestionFive = Question(1, "Melyik programozási nyelvnek ez a ikonja?",
            R.drawable.javascript,
            "Javascript",
            "Json",
            "C++",
            "Java",
            1
        )
        QuestionList.add(QuestionFive)
        val QuestionSix = Question(1, "Melyik programozási nyelvnek ez a ikonja?",
            R.drawable.matlab,
            "Math",
            "Matlab",
            "Mathematics",
            "Mat",
            2
        )
        QuestionList.add(QuestionSix)
        val QuestionSeven = Question(1, "Melyik programozási nyelvnek ez a ikonja?",
            R.drawable.phytonikon,
            "Matlab",
            "Phyton",
            "Oracle",
            "JavaScript",
            2
        )
        QuestionList.add(QuestionSeven)
        val QuestionEight = Question(1, "Melyik programozási nyelvnek ez a ikonja?",
            R.drawable.ruby,
            "Sapphire",
            "Diamond",
            "Emerald",
            "Ruby",
            4
        )
        QuestionList.add(QuestionEight)
        val QuestionNine = Question(1, "Melyik programozási nyelvnek ez a ikonja?",
            R.drawable.shell,
            "Base",
            "JavaScript",
            "Shell",
            "Cube",
            3
        )
        QuestionList.add(QuestionNine)
        val QuestionTen = Question(1, "Melyik programozási nyelvnek ez a ikonja?",
            R.drawable.javaikon,
            "Java",
            "Phyton",
            "Oracle",
            "JavaScript",
            1
        )
        QuestionList.add(QuestionTen)
        return QuestionList
    }
}