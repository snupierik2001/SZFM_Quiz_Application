package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.databinding.ActivitySelectQuizBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class SelectQuizActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySelectQuizBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivitySelectQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth

        binding.signOutBtn.setOnClickListener{
            auth.signOut()
            Toast.makeText(this,"Sikeresen kijelentkezett fiókjából!",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,HomeScreenActivity::class.java))
            finish()
        }

        binding.movieQuizBtn.setOnClickListener {
            val movieQuizId = 1
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra("Topic",movieQuizId)
            startActivity(intent)
        }

        binding.gameQuizBtn.setOnClickListener {
            val gameQuizId = 2
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra("Topic",gameQuizId)
            startActivity(intent)
        }

        binding.historyQuizBtn.setOnClickListener {
            val historyQuizId = 3
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra("Topic",historyQuizId)
            startActivity(intent)
        }

        binding.geographyQuizBtn.setOnClickListener {
            val geographyQuizId = 4
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra("Topic",geographyQuizId)
            startActivity(intent)
        }
    }
}