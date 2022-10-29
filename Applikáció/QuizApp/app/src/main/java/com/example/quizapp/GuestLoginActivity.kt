package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quizapp.databinding.ActivityGuestLoginBinding
import com.example.quizapp.databinding.ActivityHomeScreenBinding

class GuestLoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGuestLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuestLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gotoQuizGame.setOnClickListener {
            val name = binding.name.text.toString()
            if(name.isNotEmpty()){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Ön nem adott meg nevet!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}