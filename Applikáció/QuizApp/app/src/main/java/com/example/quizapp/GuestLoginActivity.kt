package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quizapp.databinding.ActivityGuestLoginBinding

class GuestLoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGuestLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuestLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gotoQuizGame.setOnClickListener {
            val name = binding.name.text.toString()
            if(name.isNotEmpty()){
                val intent = Intent(this, SelectQuizActivity::class.java)
                intent.putExtra(Constants.USER_NAME,binding.name.text.toString())
                println(Constants.USER_NAME)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Ön nem adott meg nevet!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}