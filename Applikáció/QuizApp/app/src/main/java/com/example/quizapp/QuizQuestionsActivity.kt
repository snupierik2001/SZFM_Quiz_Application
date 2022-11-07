package com.example.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.quizapp.databinding.ActivityQuizQuestionsBinding

class QuizQuestionsActivity : AppCompatActivity(), OnClickListener {

    // A funkcionalításhoz szükséges összes változó inicializálása
    private var isAnswerSelected: Boolean = false
    private var wasAnswerGiven: Boolean = false
    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0
    private var mUserName: String? = null

    private lateinit var binding: ActivityQuizQuestionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizQuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mUserName = intent.getStringExtra(Constants.USER_NAME)

        when(intent.getIntExtra("Topic", 1)){
            1 -> mQuestionsList = Constants.getMovieQuestions()
            2 -> mQuestionsList = Constants.getGameQuestions()
            3 -> mQuestionsList = Constants.getHistoryQuestions()
            4 -> mQuestionsList = Constants.getGeographyQuestions()
        }

        setQuestion()

        binding.tvOptionOne.setOnClickListener(this)
        binding.tvOptionTwo.setOnClickListener(this)
        binding.tvOptionThree.setOnClickListener(this)
        binding.tvOptionFour.setOnClickListener(this)
        binding.btnSubmit.setOnClickListener(this)

    }

    // Ez az eljárás fogja beállítani az éppen következő kérdést
    // Emellett a válaszokat alaphelyzetbe állítja (kinézet),
    // Valamint alaphelyzetbe (false-ra) állítja a válaszolással kapcsolatos változókat
    @SuppressLint("SetTextI18n")
    private fun setQuestion() {

        isAnswerSelected = false
        wasAnswerGiven = false

        val question = mQuestionsList!![mCurrentPosition - 1]

        defaultOptionsView()

        if (mCurrentPosition == mQuestionsList!!.size) {
            binding.btnSubmit.text = "Befejezés"
        } else {
            binding.btnSubmit.text = "Küldés"
        }

        binding.progressBar.progress = mCurrentPosition
        binding.tvProgress.text = "$mCurrentPosition" + "/" + binding.progressBar.max

        binding.tvQuestion.text = question.question
        binding.ivImage.setImageResource(question.image)
        binding.tvOptionOne.text = question.optionOne
        binding.tvOptionTwo.text = question.optionTwo
        binding.tvOptionThree.text = question.optionThree
        binding.tvOptionFour.text = question.optionFour
    }

    // Ez az eljárás állítja be a válaszokat alap kinézetre (nincs válasz kijelölve)
    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        options.add(0, binding.tvOptionOne)
        options.add(1, binding.tvOptionTwo)
        options.add(2, binding.tvOptionThree)
        options.add(3, binding.tvOptionFour)

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.default_option_border)
        }
    }

    // Kezeli a felhasználó által leadott válasz megjelenítését, tovább engedést, stb.
    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_option_one -> {
                if (!wasAnswerGiven) {
                    selectedOptionView(binding.tvOptionOne, 1)
                    isAnswerSelected = true
                } else {
                    alreadyAnswered()
                }
            }
            R.id.tv_option_two -> {
                if (!wasAnswerGiven) {
                    selectedOptionView(binding.tvOptionTwo, 2)
                    isAnswerSelected = true
                } else {
                    alreadyAnswered()
                }
            }
            R.id.tv_option_three -> {
                if (!wasAnswerGiven) {
                    selectedOptionView(binding.tvOptionThree, 3)
                    isAnswerSelected = true
                } else {
                    alreadyAnswered()
                }
            }
            R.id.tv_option_four -> {
                if (!wasAnswerGiven) {
                    selectedOptionView(binding.tvOptionFour, 4)
                    isAnswerSelected = true
                } else {
                    alreadyAnswered()
                }
            }
            R.id.btn_submit -> {
                if (isAnswerSelected) {
                    if (mSelectedOptionPosition == 0) {
                        mCurrentPosition++

                        when {
                            mCurrentPosition <= mQuestionsList!!.size -> {
                                setQuestion()
                            }
                            else -> {
                                val intent = Intent(this, ResultActivity::class.java)
                                intent.putExtra(Constants.USER_NAME,mUserName)
                                intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                                intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionsList!!.size)
                                startActivity(intent)
                                finish()
                            }
                        }
                    } else {
                        val question = mQuestionsList?.get(mCurrentPosition - 1)
                        if (question!!.correctAnswer != mSelectedOptionPosition) {
                            answerView(mSelectedOptionPosition, R.drawable.wrong_option_border)
                        } else {
                            mCorrectAnswers++
                        }
                        answerView(question.correctAnswer, R.drawable.correct_option_border)

                        if (mCurrentPosition == mQuestionsList!!.size) {
                            binding.btnSubmit.text = "Befejezés"
                            wasAnswerGiven = true
                        } else {
                            binding.btnSubmit.text = "Következő kérdés"
                            wasAnswerGiven = true
                        }
                        mSelectedOptionPosition = 0
                    }
                } else {
                    Toast.makeText(
                        this,
                        "Kérem válaszoljon a kérdésre, mielőtt továbblépne!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }

    // Megjeleníti a helyes választ (ha helytelenül válaszolt a felhasználó, akkor a helyest és helytelent is)
    private fun answerView(answer: Int, drawableView: Int) {
        when (answer) {
            1 -> {
                binding.tvOptionOne.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 -> {
                binding.tvOptionTwo.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                binding.tvOptionThree.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 -> {
                binding.tvOptionFour.background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }

    // A kiválasztott válasz kinézetének megváltoztatásáért felelős függvény
    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border)
    }

    // Mellék eljárás a kód rövidítésére
    private fun alreadyAnswered() {
        Toast.makeText(
            this,
            "Ön már adott le választ erre a kérdésre!",
            Toast.LENGTH_SHORT
        ).show()
    }
}