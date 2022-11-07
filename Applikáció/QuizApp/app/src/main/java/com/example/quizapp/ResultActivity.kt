package com.example.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.quizapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra(Constants.USER_NAME)
        binding.tvName.text = username
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswer = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        binding.tvScore.text = "$correctAnswer / $totalQuestions kérdést válaszolt meg helyesen."

        showGIF()

        binding.btnFinish.setOnClickListener{
            startActivity(Intent(this, HomeScreenActivity::class.java))
            finish()
        }
    }

    private fun showGIF(){
        val imageView: ImageView = findViewById(R.id.iv_congrats)
        Glide.with(this).load(R.drawable.leonardo_congrats).into(imageView)
    }
}